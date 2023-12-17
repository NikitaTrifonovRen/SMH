package Web;

import Web.Config.HiberConfig;
import Web.Models.Role;
import Web.Models.User;
import Web.Service.RoleService;
import Web.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

//Main class have been used for testing workability of HiberConfig and UserDaoImpl classes
@SpringBootApplication

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
