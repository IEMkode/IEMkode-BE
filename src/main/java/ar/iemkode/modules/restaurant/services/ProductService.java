package ar.iemkode.modules.restaurant.services;

import java.util.Optional;

/**
 * Esta interface contiene las obligaciones quede implementar la clase
 * ProductServiceImpl.
 * 
 * @author Igirod0
 * @version 1.0.0
 */
public interface ProductService {

   /**
    * Este método tiene la obligación de crear un nuevo producto.
    *
    * @param name
    * @param price
    * @param description
    * @return Integer
    */
   public Integer createProduct(Optional<String> name, Optional<Double> price, Optional<String> description);

   /**
    * Este método tiene la obligación de actualizar un producto existente.
    *
    * @param productId
    * @param name
    * @param price
    * @param description
    * @return Integer
    */
   public Integer updateProduct(Long productId, Optional<String> name, Optional<Double> price,
         Optional<String> description);

   /**
    * Este método tiene la obligación de eliminar un producto existente.
    *
    * @author Igirod0
    * @version 1.0.0
    * @param productId
    * @return Integer
    */
   public Integer deleteProduct(Long productId);
}
