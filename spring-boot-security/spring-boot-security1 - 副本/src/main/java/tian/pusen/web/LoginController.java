package tian.pusen.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/15 13:26
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        System.out.println("登录");
        return "login/login";
    }
    @RequestMapping("/loginOn")
    public String loginOn() {
        System.out.println("登录处理");
        return "index";
    }
    @RequestMapping("/loginOff")
    public String loginOff() {
        System.out.println("注销登录");
        return "index";
    }

    @RequestMapping("/loginError")
    public String loginError() {
        System.out.println("登录用户名或是密码错误，登录失败");
        return "login/login-error";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("emplyees", Arrays.asList(new String[]{"AB", "12", "X#"}));
        return "/greeting";
    }
}
