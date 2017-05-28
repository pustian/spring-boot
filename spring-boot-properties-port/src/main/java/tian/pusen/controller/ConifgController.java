package tian.pusen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.config.PropertiesConfig;

/**
 * Created by tianpusen on 2017/4/17.
 */
@RestController
public class ConifgController {
    @Value("${project.name}")
    private String name;

    @Autowired
    PropertiesConfig propertiesConfig;

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/project")
    public String project() {
        return "Project name:" + name;
    }

    @RequestMapping(value = "/propertiesConfigInfo", produces = "application/json; charset=utf-8" )
    public PropertiesConfig propertiesConfigInfo(){
        return  propertiesConfig;
    }

}
