package ar.iemkode.modules.restaurant.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.iemkode.modules.restaurant.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Esta clase representa un data transfer object (DTO) para la entidad Product.
 * 
 * @author Igirod0
 * @version 1.0.0
 */
@AllArgsConstructor
@Data
public class ProductDTO {
   @JsonProperty
   private Long id;
   @JsonProperty
   private String name;
   @JsonProperty
   private Double price;
   @JsonProperty
   private String description;
   @JsonProperty
   private String frontPage;
   @JsonProperty
   private String createdAt;

   public ProductDTO() {
   }

   /**
    * Constructor personalizado utilizado en diferentes servicios.
    *
    * @author Igirod0
    * @version 1.0.0
    */
   public ProductDTO(Product product) {
      super();
      this.id = (product.getId() != null) ? product.getId() : null;
      this.name = (product.getName() != null) ? product.getName() : null;
      this.price = (product.getPrice() != null) ? product.getPrice() : null;
      this.description = (product.getDescription() != null) ? product.getDescription() : null;
      this.frontPage = (product.getFrontPage() != null) ? product.getFrontPage() : null;
      this.createdAt = (product.getCreatedAt() != null) ? product.getCreatedAt() : null;
   }
}
