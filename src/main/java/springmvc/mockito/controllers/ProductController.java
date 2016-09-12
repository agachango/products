package springmvc.mockito.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.mockito.services.ProductService;

/**
 * Created by anthony on 11/09/2016.
 */
@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping("/products")
    public  String listProducts(Model model){
        model.addAttribute("products",productService.listAllProducts());
        return "products";
    }

    @RequestMapping("/getproduct/{id}")
    public String getProduct(@PathVariable Integer id, Model model){
        model.addAttribute("viewproduct",productService.getProductById(id));
        return  "viewproduct";

    }
}
