package vn.unikcore.nextcrmads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"vn.unikcore.nextcrmads.model.postgres"}) 
// @SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class NextcrmadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextcrmadsApplication.class, args);
	}

}
