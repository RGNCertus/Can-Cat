package pruebacancat.com.example.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import pruebacancat.com.example.demo.entities.Producto;
import pruebacancat.com.example.demo.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
    
    private final ProductoRepository repository;

    public List<Producto> obtenerDestacados() {
        return repository.findAll(); 
    }
}