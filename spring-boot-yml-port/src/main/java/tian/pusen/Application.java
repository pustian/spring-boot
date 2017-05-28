package tian.pusen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianpusen on 2017/4/17.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        Map<String, Object> defaultMap = new HashMap<String, Object>();
        defaultMap.put("project.name", "projectName");
        defaultMap.put("server.port", "8081");
        //还可以是Properties对象
        springApplication.setDefaultProperties(defaultMap);
        springApplication.run(args);
    }
}
