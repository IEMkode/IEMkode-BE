package ar.iemkode.modules.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Table(name = "products")
@Entity
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;
   @Column(name = "name")
   private String name;
   @Column(name = "price")
   private Double price;
   @Column(name = "description")
   private String description;
   @Column(name = "front_page")
   private String frontPage;
   @Column(name = "created_at")
   private String createdAt;

   public Product() {
   }
}
