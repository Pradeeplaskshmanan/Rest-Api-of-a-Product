package controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import service.ProductService;

@RestController
@RequestMapping("/product/")
public class Controller {
	@Autowired
	ProductService m;
	@PostMapping("/save/")
	public ResponseEntity<String> createproduct(@RequestBody Product product ){
		return new ResponseEntity<String>(m.saveProduct(product),HttpStatus.OK);
	}
	@GetMapping("/getall/")
	public ResponseEntity<List<Product>> readAllProduct(){
		return new ResponseEntity<List<Product>>(m.getAllProduct(),HttpStatus.OK);
	}
	

}
