package com.exemplo.dineup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int estrelas;
    private String faixaPreco;
    private String detalhes;
    private String foto;
    private String telefone;
    private String horario;
    private String foto1;
    private String foto2;
    private String foto3;
    private String foto4;
    private String qtdAvaliacao;    
    private String nomeAvaliador; 
    private String estrelasAvaliacao;
    private String avaliacao;
    private String fotoAvaliador; 

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }
    
    public String getQtdAvaliacao() {
        return qtdAvaliacao;
    }

    public void setQtdAvaliacao(String qtdAvaliacao) {
        this.qtdAvaliacao = qtdAvaliacao;
    }

    public String getFaixaPreco() {
        return faixaPreco;
    }

    public void setFaixaPreco(String faixaPreco) {
        this.faixaPreco = faixaPreco;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setfoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getfoto1() {
        return foto1;
    }
    public void setfoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getfoto2() {
        return foto2;
    }

    public void setfoto3(String foto3) {
        this.foto3 = foto3;
    }

    public String getfoto3() {
        return foto3;
    }

    public void setfoto4(String foto4) {
        this.foto4 = foto4;
    }

    public String getfoto4() {
        return foto4;
    }

    public String getNomeAvaliador() {
        return nomeAvaliador;
    }

    public void setNomeAvaliador(String nomeAvaliador) {
        this.nomeAvaliador = nomeAvaliador;
    }

    public String getEstrelasAvaliacao() {
        return estrelasAvaliacao;
    }

    public void setEstrelasAvaliacao(String estrelasAvaliacao) {
        this.estrelasAvaliacao = estrelasAvaliacao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getFotoAvaliador() {
        return fotoAvaliador;
    }

    public void setFotoAvaliador(String fotoAvaliador) {
        this.fotoAvaliador = fotoAvaliador;
    }
}
