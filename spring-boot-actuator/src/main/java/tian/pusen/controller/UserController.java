package tian.pusen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.entity.User;

/**
 * Created by tianpusen on 2017/3/24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    // curl http://localhost:8080/user/selectByUserID?userID=003
    // curl http://localhost:8080/user/selectByUserID
    // @RequestMapping(value="/select", method=RequestMethod.GET)
    @RequestMapping("/selectByUserID")
    public User selectByUserID(@RequestParam(name="userID", defaultValue="001") String userID) {
        User user = new User();
        user.setUserID(userID);
        user.setUserName("田普森");
        user.setPassword("PasswordXXX");
        return user;
    }
}
