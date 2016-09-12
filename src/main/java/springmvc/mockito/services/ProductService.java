package springmvc.mockito.services;

import springmvc.mockito.domain.Product;

import java.util.List;

/**
 * Created by anthony on 11/09/2016.
 */
public interface ProductService {
    List <Product> listAllProducts();
    Product getProductById(Integer id);
}
