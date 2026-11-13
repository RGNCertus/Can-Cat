package pruebacancat.com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pruebacancat.com.example.demo.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}