package com.restservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class ProductController {
	@Autowired
    private ProductRepository productRepository;
	
	//retrieve all products
	@GetMapping
    public List<Product> findAllProducts() {
		return (List<Product>) productRepository.findAll();
    }
	
	//retrieve products by ID
	@GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable(value = "id") long id) {
		Optional<Product> user = productRepository.findById(id);
		 
	    if(user.isPresent()) {
	        return ResponseEntity.ok().body(user.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
    }
	
	//add a new product
    @PostMapping
    public Product saveUser(@Validated @RequestBody Product product) {
    	return productRepository.save(product);
    }
    
    //update a product
    @PutMapping("/edit/{id}")
    public String updateProduct( @RequestBody Product updateProduct, @PathVariable long id) {
    	return productRepository.findById(id).map(product ->
    	{
            product.setName(updateProduct.getName());
            product.setPrice(updateProduct.getPrice());
            productRepository.save(product);
            return "Product details have been successfully updated!";
      }).orElseGet(() -> {
            return "This product doesn't exist";
      });
    }
    //delete product
    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable("id")long id) {
        productRepository.deleteById(id); 
        return "Product has been successfully deleted!";
    }
}
