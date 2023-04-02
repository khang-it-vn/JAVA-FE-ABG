package javaproject.solo.team.controller;

import javaproject.solo.team.entity.SymbolInfor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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



}
