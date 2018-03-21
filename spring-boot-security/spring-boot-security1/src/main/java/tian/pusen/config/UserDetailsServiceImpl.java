package tian.pusen.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tian.pusen.mybatisplus.entity.User;
import tian.pusen.mybatisplus.service.IUserService;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/20 16:02
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
//@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsInfo userDetails = null;
        System.out.println("数据库查询");
        User user = userService.selectByName(username);
        if(user != null) {
            System.out.println("username:"+user.getUsername()+";password:"+user.getPassword());
            userDetails = new UserDetailsInfo();
            userDetails.setUsername(username);
            userDetails.setPassword(user.getPassword());
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return userDetails;
    }
}
