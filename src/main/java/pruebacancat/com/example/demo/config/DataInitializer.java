package pruebacancat.com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pruebacancat.com.example.demo.entities.Categoria;
import pruebacancat.com.example.demo.entities.Producto;
import pruebacancat.com.example.demo.repositories.CategoriaRepository;
import pruebacancat.com.example.demo.repositories.ProductoRepository;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(ProductoRepository productoRepo, CategoriaRepository categoriaRepo) {
        return args -> {
            if (productoRepo.count() == 0) {

                Categoria catAlimentos = new Categoria();
                catAlimentos.setNombre("Alimentos");
                catAlimentos.setDescripcion("Comida para perros y gatos");
                categoriaRepo.save(catAlimentos);

                Producto p1 = new Producto();
                p1.setNombre("Alimento para perros");
                p1.setPrecio(85.00);
                p1.setStock(20);
                p1.setImagenUrl("/img/producto1.jpg");
                p1.setCategoria(catAlimentos);
                productoRepo.save(p1);

                Producto p2 = new Producto();
                p2.setNombre("Juguete para gatos");
                p2.setPrecio(18.00);
                p2.setStock(15);
                p2.setImagenUrl("/img/producto2.jpg");
                p2.setCategoria(catAlimentos);
                productoRepo.save(p2);

                System.out.println("Categorías y Productos insertados correctamente.");
            }
        };
    }
}