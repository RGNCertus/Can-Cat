package pruebacancat.com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pruebacancat.com.example.demo.services.ProductoService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ProductoService productoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productosDestacados", productoService.obtenerDestacados());
        return "index"; 
    }
}