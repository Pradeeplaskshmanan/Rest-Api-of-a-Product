package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Product;
import repo.ProductRepository;
@Service
public class ProductImplem implements ProductService {
	
	ProductRepository repository;


	@Override
	public String saveProduct(Product product) {
		repository.save(product);
		return "product id:"+product.getProductById()+"success";
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Product deleteProductById(String id) {
		// TODO Auto-generated method stub
		Product t=repository.findById(id).get();
	    return t;
	}

}
