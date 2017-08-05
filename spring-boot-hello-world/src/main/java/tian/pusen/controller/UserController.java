package tian.pusen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tian.pusen.entity.User;
import tian.pusen.service.IUserService;


/**
 * Created by tianpusen on 2017/3/24.
 */
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUserService userService;

    @RequestMapping(value="/users/${id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id")String id) {
        logger.info("To get a User with user id:{}", id);
        User user = userService.selectById(id);
        return user;
    }
    @RequestMapping(value="/users/${id}", method = RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable("id")String id) {
        logger.info("To delete a User with user id:{}", id);
        boolean bool = userService.deleteById(id);
        return bool;
    }
    @RequestMapping(value="/users", method = RequestMethod.POST)
    public boolean addUser(@RequestBody  User user) {
        logger.info("To add a new User with user:{}", user);
        boolean bool = userService.insert(user);
        return bool;
    }
    @RequestMapping(value="/users/${id}", method = RequestMethod.PUT)
    public boolean updateUser(@PathVariable("id")String id, @RequestBody User user) {
        logger.info("To update the user with all user info:{} and id:{} ", user, id);
        boolean bool = userService.updateById(user);
        return bool;
    }
    @RequestMapping(value="/users/${id}", method = RequestMethod.PATCH)
    public boolean updatePartUser(@PathVariable("id")String id, @RequestBody User user) {
        logger.info("To update the user with part user info:{} and id:{} ", user, id);
        boolean bool = userService.updateById(user);
        return bool;
    }
}
