package productManagement.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productManagement.demo.model.ProductDetails;
import productManagement.demo.repository.productRepository;

import java.util.List;
@Service
public class productServiceImp implements productService{

    @Autowired
    private productRepository productRepo;

    @Override
    public ProductDetails saveProduct(ProductDetails product) {
        return productRepo.save(product);
    }

    @Override
    public List<ProductDetails> getAllProduct() {
        return  productRepo.findAll();
    }

    @Override
    public ProductDetails getProductById(Integer id) {
        return  productRepo.findById(id).get();
    }

    @Override
    public String deleteById(Integer id) {
        ProductDetails product = productRepo.findById(id).get();
        if(product != null){
            productRepo.delete(product);
        }
        return "deleted";
    }

    @Override
    public ProductDetails updateProduct(Integer id, ProductDetails product) {
        ProductDetails products = productRepo.findById(id).get();
        products.setProductName(product.getProductName());
        products.setDescription(product.getDescription());
        return  productRepo.save(products);
    }
}
