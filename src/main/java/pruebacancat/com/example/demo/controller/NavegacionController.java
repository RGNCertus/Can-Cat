package pruebacancat.com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pruebacancat.com.example.demo.services.ProductoService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class NavegacionController {

    private final ProductoService productoService;

    @GetMapping("/catalogo")
    public String catalogo(Model model) {
        model.addAttribute("listaProductos", productoService.obtenerDestacados()); 
        return "catalogo"; 
    }

    @GetMapping("/carrito")
    public String carrito() {
        return "carrito"; 
    }

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro"; 
    }

    @GetMapping("/mis_pedidos")
    public String misPedidos() {
        return "mis_pedidos"; 
    }

    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }

    @GetMapping("/direccion")
    public String direccion() {
        return "direccion";
    }

    @GetMapping("/confirmacion")
    public String confirmacion() {
        return "confirmacion";
    }

    @GetMapping("/producto/detalle/{id}")
    public String detalleProducto(@PathVariable("id") Integer id) {
        return "detalle_producto";
    }
}