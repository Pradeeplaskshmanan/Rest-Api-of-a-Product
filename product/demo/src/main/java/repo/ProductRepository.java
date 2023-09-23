package repo;
import org.springframework.data.mongodb.repository.MongoRepository;

import entity.Product;
public interface ProductRepository extends MongoRepository<Product,String>{

}
