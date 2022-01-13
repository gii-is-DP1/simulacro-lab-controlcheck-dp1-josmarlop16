package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> p = productRepository.findAll();
        return p;
    }

    public List<Product> getProductsCheaperThan(double price) {
        List<Product> p = productRepository.findbyPriceLessThan(price);
        return p;
    }

    public ProductType getProductType(String typeName) {
        ProductType p = productRepository.findProductType(typeName);
        return p;
    }

    public Product save(Product p){
        return productRepository.save(p);      
    }

    public List<ProductType> findAllProductTypes() {
        List<ProductType> p = productRepository.findAllProductTypes();
        return p;
    }

    
}
