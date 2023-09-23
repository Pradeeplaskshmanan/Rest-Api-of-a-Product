package entity;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	private String id;
	private String name;
	private String language;
	private String framework;
	
	
	public String getProductById() {
		// TODO Auto-generated method stub
		return id;
	}
	

}
