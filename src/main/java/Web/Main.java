package Web;

import Web.Config.HiberConfig;
import Web.Models.Role;
import Web.Models.User;
import Web.Service.RoleService;
import Web.Service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

//Main class have been used for testing workability of HiberConfig and UserDaoImpl classes
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HiberConfig.class);
        UserService userService = context.getBean(UserService.class);
        RoleService roleService = context.getBean(RoleService.class);
        Role admin = new Role("admin");
        List<Role> adminRole = new ArrayList<>();
        adminRole.add(admin);
        User newUser = userService.findByName("admin1");
        System.out.println(newUser.getUserRoles().toString());
        Role newRole = roleService.showRole("user");





    }
}
