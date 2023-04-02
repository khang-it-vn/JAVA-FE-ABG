package javaproject.solo.team.controller;

import jakarta.servlet.http.HttpSession;
import javaproject.solo.team.entity.Category;
import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Product;
import javaproject.solo.team.service.CategoryService;
import javaproject.solo.team.service.ProductService;
import org.apache.catalina.Store;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
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

    @GetMapping("/store/productDetail")
    public String productDetail(@RequestParam("idProduct") Integer idProduct, Model model) {
        Product product = productService.getById(idProduct);
        if (product == null) {
            return "redirect:/store/index";
        }
        else {
            model.addAttribute("product",productService.getAll());
        }
        model.addAttribute("product", product);
        return "store/productDetail";
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

//    @GetMapping("/store/order")
//    public String order(@RequestParam("id") Integer id,
//                        @RequestParam("number") Integer number,
//                        HttpSession session) {
//
//        // Get the list of orders from the session, or create a new one if it doesn't exist
//        ArrayList<Object[]> orders = (ArrayList<Object[]>) session.getAttribute("orders");
//        if(orders == null) {
//            orders = new ArrayList<>();
//            session.setAttribute("orders", orders);
//        }
//
//        // Check if the product is already in the order list
//        boolean productExists = false;
//        for (Object[] order : orders) {
//            Product product = (Product) order[0];
//            if (product.getIdProduct() == id) {
//                int quantity = (int) order[1];
//                order[1] = quantity + number;  // Increase the quantity by the given number
//                productExists = true;
//                break;
//            }
//        }
//
//        // If the product is not yet in the order list, add it with the given quantity
//        if (!productExists) {
//            Product product = productService.getById(id);
//            Object[] order = {product, number};
//            orders.add(order);
//        }
//
//        // Redirect to the "productDetail" page with the saved "id" parameter
//        return "redirect:/productDetail?idProduct=" + id;
//    }

}
