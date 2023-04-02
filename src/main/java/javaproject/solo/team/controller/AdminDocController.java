package javaproject.solo.team.controller;

import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.repository.DocRepository;
import javaproject.solo.team.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminDocController {
    private DocService docService;
    public AdminDocController(DocService docService) {
        super();
        this.docService = docService;
    }

    @GetMapping("admindoc/index")
    public String index(@RequestParam(defaultValue = "0") int page, Model model) {
        // lay danh sach document ve
        List<Doc> docs = this.docService.getAll();

        int start = page * 10;
        if(start > docs.size())
        {
            start = start - 10;
        }
        if (start < docs.size()) {
            int end = Math.min(start + 10, docs.size());
            List<Doc> results = docs.subList(start, end);

            model.addAttribute("docs", results);
            model.addAttribute("currentPage", page);
            model.addAttribute("totalPages", (int) Math.ceil((double) docs.size() / 10));

            return "admin_doc/index";
        } else {
            // trả về trang lỗi hoặc thông báo lỗi cho người dùng
            return "redirect:index";
        }

    }
    @GetMapping("admindoc/add")
    public String add(Model model)
    {
        return "admin_doc/add";
    }


    @PostMapping("admindoc/save")
    public String save(@ModelAttribute("Doc") Doc document) {
        try
        {
            docService.save(document);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return "redirect:index";
    }

    @GetMapping("admindoc/delete")
    public String delete(@RequestParam("id") int id, Model model)
    {
         try
         {
             docService.deleteById(id);
         }catch(Exception e)
         {
             e.printStackTrace();
         }
         return "redirect:index";
    }
}
