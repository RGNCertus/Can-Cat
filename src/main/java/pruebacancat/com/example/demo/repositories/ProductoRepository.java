package pruebacancat.com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pruebacancat.com.example.demo.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}