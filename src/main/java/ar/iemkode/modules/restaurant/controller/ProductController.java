package ar.iemkode.modules.restaurant.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import ar.iemkode.modules.restaurant.services.ProductService;

@Controller
public class ProductController {

   @Autowired
   private ProductService productService;

   @MutationMapping("cProduct")
   public Integer createProduct(@Argument Optional<String> name, @Argument Optional<Double> price,
         @Argument Optional<String> description) {
      return productService.createProduct(name, price, description);
   }

   @MutationMapping("uProduct")
   public Integer updateProduct(@Argument Long productId, @Argument Optional<String> name,
         @Argument Optional<Double> price, @Argument Optional<String> description) {
      return productService.updateProduct(productId, name, price, description);
   }

   @MutationMapping("dProduct")
   public Integer deleteProduct(@Argument Long productId) {
      return productService.deleteProduct(productId);
   }
}
