package com.zecola.zecolapiclientsdk;

import com.zecola.zecolapiclientsdk.client.ZecolApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "zecola.client")
@Data
@ComponentScan
public class ZecolApiClientConfig {
    private String accessKey;

    private String secretKey;

    @Bean
    public ZecolApiClient zecolApiClient(){
        return new ZecolApiClient(accessKey,secretKey);
    }

}
