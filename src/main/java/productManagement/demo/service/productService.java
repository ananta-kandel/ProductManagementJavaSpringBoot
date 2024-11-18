package productManagement.demo.service;

import productManagement.demo.model.ProductDetails;

import java.util.List;

public interface productService {
    public ProductDetails saveProduct(ProductDetails product);
    public List<ProductDetails> getAllProduct();
    public ProductDetails getProductById(Integer id);
    public String deleteById(Integer id);
    public ProductDetails updateProduct(Integer id , ProductDetails product);

}
