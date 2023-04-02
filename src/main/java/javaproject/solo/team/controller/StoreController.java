package javaproject.solo.team.controller;

import javaproject.solo.team.service.CategoryService;
import javaproject.solo.team.service.ProductService;
import org.apache.catalina.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

    private ProductService productService;
    private CategoryService categoryService;
    public StoreController(ProductService productService, CategoryService categoryService)
    {
        super();
        this.productService = productService;
        this.categoryService = categoryService;
    }


    @GetMapping("store/index")
    public String index(Model model) {


        return "store/index";
    }

}
