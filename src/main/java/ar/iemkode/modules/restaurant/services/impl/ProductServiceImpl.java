package ar.iemkode.modules.restaurant.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.iemkode.modules.restaurant.model.Product;
import ar.iemkode.modules.restaurant.repository.ProductJpaRepository;
import ar.iemkode.modules.restaurant.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

   @Autowired
   private ProductJpaRepository productJpaRepository;

   @Override
   public Integer createProduct(Optional<String> name, Optional<Double> price, Optional<String> description) {
      productJpaRepository.save(new Product(null, (name.isPresent()) ? name.get() : null,
            (price.isPresent()) ? price.get() : null, (description.isPresent()) ? description.get() : null,
            null, null));
      return 1;
   }

   @Override
   public Integer updateProduct(Long productId, Optional<String> name, Optional<Double> price,
         Optional<String> description) {
      Optional<Product> product = productJpaRepository.findById(productId);
      if (product.isEmpty())
         throw new RuntimeException("Product not found");
      else {
         Product productToUpdate = product.get();
         name.ifPresent(productToUpdate::setName);
         price.ifPresent(productToUpdate::setPrice);
         description.ifPresent(productToUpdate::setDescription);
         productJpaRepository.save(productToUpdate);
      }
      return 1;
   }

   @Override
   public Integer deleteProduct(Long productId) {
      productJpaRepository.deleteById(productId);
      return 1;
   }

}
