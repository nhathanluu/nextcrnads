package vn.unikcore.nextcrmads.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${airbyte.api_host}")
    public String airbyte_host;
}
