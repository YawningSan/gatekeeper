package literacymasters.gatekeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("link")
    public String link(Model model){
        model.addAttribute("data", "hello");
        return "link";
    }
}
