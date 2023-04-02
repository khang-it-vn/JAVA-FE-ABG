package javaproject.solo.team.controller;

import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.repository.DocRepository;
import javaproject.solo.team.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminDocController {
    private DocService docService;
    public AdminDocController(DocService docService) {
        super();
        this.docService = docService;
    }

    @GetMapping("admindoc/index")
    public String index(Model model)
    {
        //lay ve danh sach cua document vo bien docs
        model.addAttribute("docs", this.docService.getAll());

        return "admin_doc/index";

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

    // tùng xem lại cái flow của nó thử he, ok cái bước thêm r á
    // thấy rồi à khang hehe,
    // ok v làm lun cái hàm xóa lun
    // tùng vết  tử khang xem lun ư
    // ok khang ok vết đi á khang xem ựêụcê lun khỏi out

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
