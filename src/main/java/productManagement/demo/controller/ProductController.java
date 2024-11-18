package productManagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import productManagement.demo.model.ProductDetails;
import productManagement.demo.service.productService;

@RestController
public class ProductController {

    @Autowired
    public productService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<?> saveProduct(@RequestBody ProductDetails product){
          System.out.println(product);
          return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/getProduct")
    public  ResponseEntity<?> getAllProduct(){
        return  new ResponseEntity<>(productService.getAllProduct(),HttpStatus.CREATED);
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id){
        return new ResponseEntity<>(productService.getProductById(id),HttpStatus.ACCEPTED);
    }

    @GetMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        return new ResponseEntity<>(productService.deleteById(id),HttpStatus.OK);
    }

    @PostMapping("/editProduct/{id}")
        public ResponseEntity<?> updateProduct(@PathVariable Integer id, @RequestBody  ProductDetails product){
          return new ResponseEntity<>(productService.updateProduct(id, product),HttpStatus.CREATED);
    }
}
