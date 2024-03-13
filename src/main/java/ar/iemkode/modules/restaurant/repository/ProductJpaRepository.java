package ar.iemkode.modules.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.iemkode.modules.restaurant.model.Product;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}
