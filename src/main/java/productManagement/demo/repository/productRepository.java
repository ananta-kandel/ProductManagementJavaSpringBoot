package productManagement.demo.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import productManagement.demo.model.ProductDetails;

@Repository
public interface productRepository extends JpaRepository<ProductDetails , Integer> {
}
