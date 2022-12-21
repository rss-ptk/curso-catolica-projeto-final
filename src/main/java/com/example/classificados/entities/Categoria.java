package com.example.classificados.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "categoriaPai", nullable = false)
    private Categoria categoriaPai;

    @Column(name = "url", nullable = false)
    private String url;

    @OneToMany(mappedBy = "categoriaPai")
    private List<Categoria> subCategorias = new ArrayList<>();

    public Categoria(){

    }

    public Categoria(String nome, Categoria categoriaPai) {
        this.nome = nome;
        this.categoriaPai = categoriaPai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoriaPai() {
        return categoriaPai;
    }

    public void setCategoriaPai(Categoria categoriaPai) {
        this.categoriaPai = categoriaPai;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
}
