package Web.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HalloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hallo!");
        messages.add("Please insert \"/users/new\" to get able to create user");
        messages.add("Please insert \"/users\" to get table of all users");
        messages.add("Please insert \"/users/id\" to get able to delete user");
        messages.add("Please insert \"/users/id/update\" to get able to edit user");
        model.addAttribute("messages", messages);
        return "hallo";
    }


}
