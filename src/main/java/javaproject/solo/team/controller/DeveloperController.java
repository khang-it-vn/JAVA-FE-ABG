package javaproject.solo.team.controller;


import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.service.DocService;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeveloperController {

    private DocService docService;

    public DeveloperController(DocService docService) {
        super();
        this.docService = docService;
    }

    @GetMapping("developer/index")
    public String index(Model model, @RequestParam(value = "idDoc", defaultValue = "1") Integer idDoc, @RequestParam(value = "keyword", defaultValue = "") String keyword) {
        List<Doc> docs = docService.getAll();
        System.out.println(docs.size());
        System.out.println(keyword);
        ArrayList<Doc> docArrayList = new ArrayList<>();
        if (!keyword.isEmpty()) {

            while ( docs.size() > 0) {
                if (docs.get(0).getTitle().contains(keyword)) {
                   docArrayList.add(docs.get(0));
                }
                docs.remove(docs.get(0));
            }
        }
        model.addAttribute("docs", docArrayList);
        Doc doc = docService.getById(idDoc);
        model.addAttribute("doc", doc);
        return "developer/index";
    }

}
