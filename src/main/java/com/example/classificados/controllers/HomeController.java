package com.example.classificados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.classificados.entities.Anuncio;
import com.example.classificados.repositories.AnuncioRepository;
import com.example.classificados.repositories.CategoriaRepository;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private AnuncioRepository anuncioRepository;
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public HomeController(AnuncioRepository anuncioRepository, CategoriaRepository categoriaRepository) {
        this.anuncioRepository = anuncioRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public String home(Model model) {
        //model.addAttribute("menuItens", this.categoriaRepository.findAll());
        model.addAttribute("categoriasPai", this.categoriaRepository.findCategoriaPaiAll());
        model.addAttribute("categoriasFilho", this.categoriaRepository.findCategoriasFilhoAll());
        model.addAttribute("destaques", this.anuncioRepository.findAllDestaques());
        return "home";
    }

    @GetMapping(value = "/anuncio-cadastrado")
    public String anuncioCadastrado() {
        return "anuncioCadastrado";
    }

    @GetMapping(value = "/anuncio-deletado")
    public String anuncioDeleado() {
        return "anuncioDeletado";
    }

    @RequestMapping(path = {"/","/pesquisa"})
    public String home(Model model, String keyword) {
        model.addAttribute("categoriasPai", this.categoriaRepository.findCategoriaPaiAll());
        model.addAttribute("categoriasFilho", this.categoriaRepository.findCategoriasFilhoAll());
        model.addAttribute("keyword", keyword);
        if(keyword!=null) {
            List<Anuncio> listAnuncios = this.anuncioRepository.findByTituloContainingIgnoreCase(keyword);
            model.addAttribute("anuncios", listAnuncios);
        } 
        return "resultadoPesquisa";
    }

}
