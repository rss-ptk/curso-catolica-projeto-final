package com.example.classificados.entities;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "autor", nullable = false)
    private long autor;

    @Column(name = "anuncio", nullable = false)
    private long anuncio;

    @Column(name = "comentario", nullable = false)
    private String comentario;

    @Column(name = "comentarioPai", nullable = true)
    private long comentarioPai;

    @Column(name = "dataComentario", nullable = false)
    private Date dataComentario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAutor() {
        return autor;
    }

    public void setAutor(long autor) {
        this.autor = autor;
    }

    public long getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(long anuncio) {
        this.anuncio = anuncio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public long getComentarioPai() {
        return comentarioPai;
    }

    public void setComentarioPai(long comentarioPai) {
        this.comentarioPai = comentarioPai;
    }

    public Date getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
    }    
    
}
