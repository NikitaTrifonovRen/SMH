package Web.Contoller;

import Web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("user/{id}")
    public String showUser(@PathVariable("id")int id, ModelMap model){
        model.addAttribute("user",userService.showUser(id));
        return "userPage";
    }
}
