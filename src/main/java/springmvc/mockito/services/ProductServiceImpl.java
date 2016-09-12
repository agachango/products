package springmvc.mockito.services;

import org.springframework.stereotype.Service;
import springmvc.mockito.domain.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anthony on 11/09/2016.
 */
@Service
public class ProductServiceImpl implements ProductService {



    private Map<Integer,Product> products;

    public ProductServiceImpl(){
        loadProducts();
    }

    @Override
    public Product getProductById(Integer id) {
        return products.get(id);
    }


    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }

    private  void loadProducts(){
      products = new HashMap<>();

        Product product1=new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.88"));
        product1.setImageurl("http://example.com/product1");
        products.put(1,product1);

        Product product2=new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("15.45"));
        product2.setImageurl("http://example.com/product2");
        products.put(2,product2);

        Product product3=new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("4.98"));
        product3.setImageurl("http://example.com/product3");
        products.put(3,product3);

    }


}
