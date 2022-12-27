package com.example.demo.newpackage.controller;

import com.example.demo.newpackage1.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("titulo", "hola Spring Framework!");

        return "index";

    }
    
    @GetMapping("/perfil")
    public String perfil (Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        usuario.setApellido("villamil");
        
        model.addAttribute("Usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario:  ".concat(usuario.getNombre()));
        return "perfil";
}
    

}
