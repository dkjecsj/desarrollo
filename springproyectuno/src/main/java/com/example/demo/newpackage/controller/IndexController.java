package com.example.demo.newpackage.controller;

import com.example.demo.newpackage1.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {
    
    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;
    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;
    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("titulo",textoIndex);

        return "index";

    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("villamil");
        usuario.setEmail("andres@gmail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", textoListar);

        return "listar";

    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Andres", "Villamil", "andres@gmail.com"));
        usuarios.add(new Usuario("Paola", "Beltran", "paola@gmail.com"));
        usuarios.add(new Usuario("Julian", "Castillo", "julian@gmail.com"));

        return usuarios;
    }

}
