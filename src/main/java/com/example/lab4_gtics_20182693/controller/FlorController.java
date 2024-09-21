package com.example.lab4_gtics_20182693.controller;

import com.example.lab4_gtics_20182693.beans.Flor;
import com.example.lab4_gtics_20182693.repository.FlorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class FlorController {

    final FlorRepository florRepository;

    public FlorController(FlorRepository florRepository) {
        this.florRepository = florRepository;
    }

    @GetMapping(value = {"/catalogo", ""})
    public String listarFlores(Model model) {
        List<Flor> lista = florRepository.findAll();
        model.addAttribute("florList", lista);
        model.addAttribute("totalFlores", lista.size());
        return "catalogo";
    }





    @PostMapping("/agregarCarrito")
    public String agregarCarrito(@RequestParam("id") int id) {

        return "redirect:/catalogo";
    }

    @PostMapping("/quitarCarrito")
    public String quitarCarrito(@RequestParam("id") int id) {

        return "redirect:/catalogo";
    }

    @PostMapping("/comprar")
    public String comprar(@RequestParam("id") int id) {

        return "redirect:/catalogo";
    }
}

