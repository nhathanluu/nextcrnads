package vn.unikcore.nextcrmads.common.helper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import vn.unikcore.nextcrmads.predicate.shared.Response;

public class ApiResponse {
    public static ResponseEntity<Object> generateResponse(HttpStatus status, boolean error, String message, Object responseObj) {
        try {
            if (error) {
                Response response = new Response(message, status.value());

                return new ResponseEntity<Object>(response, status);
            } else {
                Response response = new Response(responseObj);

                return new ResponseEntity<Object>(response, status);
            }
        } catch (Exception e) {
            Response response = new Response(message, status.value());

            return new ResponseEntity<Object>(response, status);
        }
    }
}
