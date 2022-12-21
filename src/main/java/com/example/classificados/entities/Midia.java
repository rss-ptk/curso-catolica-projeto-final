package com.example.classificados.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "midias")
public class Midia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "idAnuncio", nullable = false)
    private long idAnuncio;

    @Column(name = "url", nullable = false)
    private String url;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(long idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }    

}
