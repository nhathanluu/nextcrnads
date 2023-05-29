package vn.unikcore.nextcrmads.pojo.shared;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Response {
    @JsonProperty("Success")
    private String status = "Success";

    @JsonProperty("data")
    private Object data;

    @JsonProperty("error")
    private String error;

    @JsonProperty("code")
    private int statusCode = 200;

    public Response() {

    }

    public Response(Object data) {
        this.data = data;
        this.error = "";
    }

    public Response(String error, Integer code) {
        this.error = error;
        this.status = "Failed";
        this.statusCode = code;
    }

    public Response(Map<String, Object> map) {
        this.data = map.get("data");
        this.error = (String)map.get("message");
        this.status = "Failed";
        this.statusCode = (Integer)map.get("statusCode");
    }
}
