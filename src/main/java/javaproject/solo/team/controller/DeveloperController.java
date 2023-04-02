package javaproject.solo.team.controller;


import javaproject.solo.team.service.DocService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeveloperController {

    private DocService docService;

    public DeveloperController(DocService docService)
    {
        super();
        this.docService = docService;
    }

    @GetMapping("developer/index")
    public  String index (Model model)
    {
        return "developer/index";
    }
}
