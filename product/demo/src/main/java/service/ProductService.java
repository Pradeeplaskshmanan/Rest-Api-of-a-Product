package service;

import entity.Product;
import java.util.*;

public interface ProductService {
	String saveProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(String id);
	Product deleteProductById(String id);

}
