package tian.pusen.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by tianpusen on 2017/4/17.
 */
@Component
@ConfigurationProperties(prefix = "tianpusen")// 接受application.yml中前缀为tianpusen下面的属性
//@PropertySource("classpath:application.yml")
public class YmlConfig {
    private String user;
    private String[] address;
    private Map<String, String>  relation;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public Map<String, String> getRelation() {
        return relation;
    }

    public void setRelation(Map<String, String> relation) {
        this.relation = relation;
    }
}
