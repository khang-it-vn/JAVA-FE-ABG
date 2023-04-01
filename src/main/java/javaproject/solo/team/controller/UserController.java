package javaproject.solo.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("user/index")
    public String index(Model model) {

        return "user/index";
    }
    @GetMapping("user/market")
    public String market(Model model) {

        return "user/market";
    }
    @GetMapping("user/wallet")
    public String wallet(Model model) {

        return "user/wallet";
    }

    @GetMapping("user/login")
    public String login(Model model) {

        return "user/login";
    }
    @GetMapping("user/updatempass")
    public String updateMpass(Model model) {

        return "user/updatempass";
    }


}
