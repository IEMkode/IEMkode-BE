package ar.iemkode.modules.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

   @GetMapping("/test")
   public String test() {
      return "Prueba de conexion exitosa!";
   }
}
