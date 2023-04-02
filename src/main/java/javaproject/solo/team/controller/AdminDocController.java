package javaproject.solo.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDocController {

    @GetMapping("admindoc/index")
    public String index(Model model)
    {
        model.addAttribute("data","Data guiwr qua");
        return "admin_doc/index";
    }
}
