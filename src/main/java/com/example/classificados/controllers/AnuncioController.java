package com.example.classificados.controllers;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.classificados.entities.Anuncio;
import com.example.classificados.entities.Categoria;
import com.example.classificados.entities.Usuario;
import com.example.classificados.repositories.AnuncioRepository;
import com.example.classificados.repositories.CategoriaRepository;
import com.example.classificados.repositories.UsuarioRepository;

@Controller
@RequestMapping(value = "anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public AnuncioController(AnuncioRepository anuncioRepository, CategoriaRepository categoriaRepository, UsuarioRepository usuarioRepository) {
        this.anuncioRepository = anuncioRepository;
        this.categoriaRepository = categoriaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping(value = "/{categoriaId}/{anuncioId}/{anuncioTitulo}")
    public String detAnuncio(@PathVariable Long categoriaId, @PathVariable Long anuncioId, Model model) {
        
        Optional<Categoria> catDet =  this.categoriaRepository.findById(categoriaId);
        if(catDet.isPresent()){        
            model.addAttribute("categoria", catDet.get());
        }

        Optional<Anuncio> anuncioDet =  this.anuncioRepository.findById(anuncioId);
        if(anuncioDet.isPresent()){        
            model.addAttribute("anuncioDet", anuncioDet.get());

            Optional<Usuario> usuarioDet =  this.usuarioRepository.findById(anuncioDet.get().getUsuario().getId());
            if(usuarioDet.isPresent()){        
                model.addAttribute("usuarioDet", usuarioDet.get());
            }
        }

        return "anuncioDet";
    }

    @GetMapping(value = "/categoria/{categoriaId}/{categoriaNome}")
    public String findByCategoria(@PathVariable Long categoriaId, Model model) {        
        model.addAttribute("categoriasPai", this.categoriaRepository.findCategoriaPaiAll());
        model.addAttribute("categoriasFilho", this.categoriaRepository.findCategoriasFilhoAll());
        model.addAttribute("anuncios", this.anuncioRepository.findByCategoria(categoriaId));
        Optional<Categoria> catDet =  this.categoriaRepository.findById(categoriaId);
        if(catDet.isPresent()){        
            model.addAttribute("categoria", catDet.get());
        }
        return "anunciosCategoria";
    }

    @GetMapping(value = "/cadastrar")
    public String cadastrarAnuncio(Model model) {
        model.addAttribute("categoriasPai", this.categoriaRepository.findCategoriaPaiAll());
        model.addAttribute("categoriasFilho", this.categoriaRepository.findCategoriasFilhoAll());
        return "cadastrarAnuncio";
}

    @PostMapping(value = "/cadastrar")
    public String adicionarAutor(@ModelAttribute("anuncio") Anuncio anuncio) {
        
        Optional<Usuario> usuarioDet =  this.usuarioRepository.findById(Long.parseLong("1"));
        if(usuarioDet.isPresent()){        
            anuncio.setUsuario(usuarioDet.get());
        }
        
        anuncio.setDataAnuncio(new Date());
        anuncioRepository.save(anuncio);
        return "redirect:/anuncio-cadastrado";
    }

    @GetMapping(value = "/deletar/{anuncioId}")
    public String deleteAnuncio(@PathVariable Long anuncioId) {
        this.anuncioRepository.deleteById(anuncioId);
        return "redirect:/anuncio-deletado";
    }

}
