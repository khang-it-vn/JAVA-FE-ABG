package javaproject.solo.team.util;

import javaproject.solo.team.template_response.ResponseImage;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

public class ImageUtil {
    public  static ResponseImage saveImg(MultipartFile image)
    {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("image", image.getResource());


        HttpEntity<MultiValueMap<String, Object>> requestEntity =
                new HttpEntity<>(body, headers);

        ResponseEntity<ResponseImage> response = restTemplate.exchange(
                "http://localhost:3000/util/upload", HttpMethod.POST,
                requestEntity, ResponseImage.class);

        return response.getBody();

    }
}
