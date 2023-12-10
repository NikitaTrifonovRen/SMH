package Web;

import Web.Config.HiberConfig;
import Web.Models.User;
import Web.Service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Main class have been used for testing workability of HiberConfig and UserDaoImpl classes
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HiberConfig.class);
        UserService userService = context.getBean(UserService.class);
        User userToMerge = new User("Max","road1");
        userService.updateUserParams(11,userToMerge);

    }
}
