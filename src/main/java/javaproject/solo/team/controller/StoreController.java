package javaproject.solo.team.controller;

import javaproject.solo.team.entity.Category;
import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Product;
import javaproject.solo.team.service.CategoryService;
import javaproject.solo.team.service.ProductService;
import org.apache.catalina.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {

    private ProductService productService;
    private CategoryService categoryService;

    public StoreController(ProductService productService, CategoryService categoryService) {
        super();
        this.productService = productService;
        this.categoryService = categoryService;
    }


    @GetMapping("store/index")
    public String index(@RequestParam(value = "id", required = false) Integer id, Model model) {
        model.addAttribute("product", productService.getAll());
        if (id != null) {
            model.addAttribute("product", productService.getById(id));

        }
        model.addAttribute("category", categoryService.getAll());


        return "store/index";
    }

}
