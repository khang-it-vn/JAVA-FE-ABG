package javaproject.solo.team.controller;


import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.service.DocService;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DeveloperController {

    private DocService docService;

    public DeveloperController(DocService docService)
    {
        super();
        this.docService = docService;
    }

    @GetMapping("developer/index")
    public  String index (Model model, @RequestParam(value = "idDoc", defaultValue = "1") Integer idDoc)
    {
        List<Doc> docs = docService.getAll();
        model.addAttribute("docs", docs);
        Doc doc = docService.getById(idDoc);
        System.out.println(doc.getContent());
        model.addAttribute("doc", doc);
        return "developer/index";
    }

}
