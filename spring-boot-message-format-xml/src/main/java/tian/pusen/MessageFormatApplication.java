package tian.pusen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tianpusen on 2017/5/28.
 */
@SpringBootApplication
public class MessageFormatApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageFormatApplication.class);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
