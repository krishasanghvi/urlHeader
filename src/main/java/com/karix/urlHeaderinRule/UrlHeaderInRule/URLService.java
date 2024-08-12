package com.karix.urlHeaderinRule.UrlHeaderInRule;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class URLService {
    private final RestTemplate restTemplate;

    public URLService() {
        this.restTemplate = new RestTemplate();
    }

    public String fetchHeaders(String url) {
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return response.getHeaders().toString();
    }

//    public String




}
