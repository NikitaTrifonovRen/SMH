package Web.Contoller;

import Web.Models.User;
import Web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String printAllUsers (ModelMap model){
        model.addAttribute("users",userService.allUsers());
        return "users";
    }
    @GetMapping("/{id}")
    public String showUser(@PathVariable("id")int id, ModelMap model){
        model.addAttribute("user",userService.showUser(id));
        return "show";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user){
        return "new";
    }
    @PostMapping
    public String createUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/users";
    }
    @GetMapping("/{id}/update")
    public String editUser(@PathVariable("id")int id, ModelMap model){
        model.addAttribute("user",userService.showUser(id));
        return "update";
    }
    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user,@PathVariable("id") int id){
        userService.updateUserParams(id, user);
        return "redirect:/users";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@ModelAttribute("user") User user,@PathVariable("id") int id){
        userService.removeUser(id);
        return "redirect:/users";
    }


}
