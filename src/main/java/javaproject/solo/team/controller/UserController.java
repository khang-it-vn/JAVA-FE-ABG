package javaproject.solo.team.controller;

import jakarta.servlet.http.HttpSession;
import javaproject.solo.team.entity.Account;
import javaproject.solo.team.entity.ResponseAccount;
import javaproject.solo.team.entity.ResponseRole;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import javaproject.solo.team.entity.SymbolInfor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class UserController {

    @GetMapping("user/index")
    public String index(Model model) {

        return "user/index";
    }
    @GetMapping("user/market")
    public String market(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/binance/getPriceFollowPage/1";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer <token>");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<SymbolInfor[]> response = restTemplate.exchange(url, HttpMethod.GET, entity, SymbolInfor[].class);
        SymbolInfor[] symbolInfor = response.getBody();

        for (SymbolInfor item : symbolInfor) {
            System.out.printf(item.getSymbol());
            System.out.printf(item.getPrevClosePrice());
            System.out.printf(item.getPriceChangePercent());
            System.out.printf(item.getLastPrice());
            System.out.printf(item.getVolume());
        }

        model.addAttribute("symbolinfors", symbolInfor);
        return "user/market";
    }
    @GetMapping("user/wallet")
    public String wallet(Model model) {

        return "user/wallet";
    }

    @GetMapping("user/login")
    public String login(Model model) {

        return "user/login";
    }
    @PostMapping("user/updatempass")
    public String updateMpass(@RequestParam("mpass") String mpass) {

        System.out.printf(mpass);
        return "redirect:updatempass";
    }
    @GetMapping("user/updatempass")
    public String getMpass()
    {
        return "user/updatempass";
    }

    @PostMapping("user/checkAccountLoginGoogle")
    public String checkAccountLoginFromGoogle(@RequestParam("credential") String credential, HttpSession session)
    {
//   Bắt đầu verify token
        // Tạo một đối tượng RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Tạo request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Tạo request body
        String credentialJson = "{\"credential\": \"" + credential + "\"}";
        HttpEntity<String> request = new HttpEntity<>(credentialJson, headers);

        // Gọi API với method POST và body là credential
        ResponseEntity<Map[]> response = restTemplate.postForEntity("http://localhost:3000/login", request,  Map[].class);

        Map<String, Object> tokenObject = response.getBody()[1]; // Lấy đối tượng đầu tiên trong mảng
        System.out.println(tokenObject.get("token"));

        Map<String, Object> responseBody = response.getBody()[2];
        Map<String, Object> roleObject = (Map<String, Object>) responseBody.get("roles");

        Integer from = (Integer) roleObject.get("from"); // Lấy giá trị của thuộc tính 'from'
        String title = (String) roleObject.get("title"); // Lấy giá trị của thuộc tính 'title'

        ResponseRole author = new ResponseRole();
        author.setToken(tokenObject.get("token").toString());
        author.setFrom(from);
        author.setTitle(title);

//      Kết thúc verify token

//      Bắt đầu lấy thông tin cá nhân
       ResponseAccount responseAccount = getInfo(author,"");
//
//        Kiểm tra mpass
        if(responseAccount == null)
        {
            return "user/login";
        }
        session.setAttribute("Account",responseAccount);
        session.setAttribute("Role",author);
        if(responseAccount.getMpass().length() <= 0)
        {
            return "user/updatempass";
        }

        return  "user/login";
    }




    private void setMPass(String mpass) {
        RestTemplate restTemplate = new RestTemplate();

        // Tạo request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Tạo request body
        String credentialJson = "{\"mpass\": \"" + mpass + "\"}";
        HttpEntity<String> request = new HttpEntity<>(credentialJson, headers);

        // Gọi API với method POST và body là credential
        ResponseEntity<Map> response = restTemplate.postForEntity("http://localhost:3000/login", request,  Map.class);

        Map<String, Object> tokenObject = response.getBody(); // Lấy đối tượng đầu tiên trong mảng
        System.out.println(tokenObject.get("mpass"));
    }

    public ResponseAccount getInfo(ResponseRole account, String apiUrl) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(account.getToken());

        HttpEntity<String> entity = new HttpEntity<>(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Object>> response = restTemplate.exchange(
                "http://localhost:3000/getUserInfo",
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Object>>() {}
        );

        if (response.getBody() != null && response.getBody().size() > 0) {
            Map<String, Object> firstObject = (Map<String, Object>) response.getBody().get(0);
            String address = (String) firstObject.get("address");

            ResponseAccount responseAccount = new ResponseAccount();
            responseAccount.setIdAccount((Integer) firstObject.get("id_account"));
            responseAccount.setFullname((String) firstObject.get("fullname"));
            responseAccount.setEmail((String) firstObject.get("email"));
            responseAccount.setAddress((String) firstObject.get("address"));
            responseAccount.setPrivatekey((String) firstObject.get("privatekey"));
            responseAccount.setMpass((String) firstObject.get("mpass"));
            responseAccount.setAvatar((String) firstObject.get("avatar"));
            return responseAccount;
        } else {
           return null;
        }
    }





}
