package vn.unikcore.nextcrmads.common.helper;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpHelper {
    public static <T, R> T post (String url, R data, Class<T> type) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        T result = restTemplate.postForObject(url, data, type);

        return result;
    }
}
