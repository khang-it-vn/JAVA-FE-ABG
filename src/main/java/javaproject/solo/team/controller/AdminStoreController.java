package javaproject.solo.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminStoreController {

    @GetMapping("adminstore/index")
    public  String index(Model model)
    {
        return "admin_store/index";
    }
}
