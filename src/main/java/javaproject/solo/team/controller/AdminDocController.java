package javaproject.solo.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminDocController {
    @GetMapping("adminDoc/index")
    public String index() {

        return "adminDoc/index";

    }
}
