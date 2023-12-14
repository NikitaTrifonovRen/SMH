package Web.Service;

import Web.Dao.UserDao;
import Web.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userDao.findByName(name);
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), user.getUserRoles().stream().map((role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList()));
    }
}
