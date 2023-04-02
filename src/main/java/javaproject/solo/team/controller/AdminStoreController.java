package javaproject.solo.team.controller;

import javaproject.solo.team.entity.Category;
import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Product;
import javaproject.solo.team.service.CategoryService;
import javaproject.solo.team.service.ProductService;
import javaproject.solo.team.util.ImageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class AdminStoreController {

    private CategoryService categoryService;
    private ProductService productService;
    public  AdminStoreController(CategoryService categoryService, ProductService productService)
    {
        super();
        this.categoryService = categoryService;
        this.productService =productService;
    }

    @GetMapping("adminstore/index")
    public  String index(@RequestParam(defaultValue = "0") int page, Model model)
    {
        // lay danh sach document ve
        List<Product> products = this.productService.getAll();

        int start = page * 15;
        if(start > products.size())
        {
            start = start - 15;
        }
        if (start < products.size()) {
            int end = Math.min(start + 15, products.size());
            List<Product> results = products.subList(start, end);

            model.addAttribute("products", results);
            model.addAttribute("currentPage", page);
            model.addAttribute("totalPages", (int) Math.ceil((double) products.size() / 15));

            return "admin_store/index";
        } else {
            // trả về trang lỗi hoặc thông báo lỗi cho người dùng
            return "redirect:index";
        }
//        model.addAttribute("products",productService.getAll());

//        return "admin_store/index";
    }

    @GetMapping("adminstore/add")
    public  String add(Model model)
    {
        model.addAttribute("category",categoryService.getAll());

        return "admin_store/add";
    }

    @GetMapping("adminstore/delete")
    public String delete (@RequestParam("id") int id) {
    try {
        productService.deleteById(id);
    }catch (Exception e){
        e.printStackTrace();
    }
    return "redirect:index";
    }


    @PostMapping("adminstore/add")
    public String addProduct(@RequestParam("name") String name,
                             @RequestParam("description") String description,
                             @RequestParam("price") float price,
                             @RequestParam("category") int category_id,
                             @RequestParam("image") MultipartFile image)
    {
        System.out.println(name + "\t " + description + "\t " +  price + "\t " +  category_id);
        System.out.println(image.getOriginalFilename());
        String filenameRes = ImageUtil.saveImg(image).getFilename();
        System.out.println(filenameRes);
        try
        {
            // getcategory from id
            Category category = categoryService.getById(category_id);

            //init product
            Product product = new Product();
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setCategory(category);
            product.setImage(filenameRes);

            productService.save(product);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return "admin_store/index";
    }

}
