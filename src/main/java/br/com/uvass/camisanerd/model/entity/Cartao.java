package br.com.uvass.camisanerd.model.entity;

import java.time.LocalDate;

public class Cartao {
    private Integer id;
    private LocalDate dataCriacao;
    private Boolean excluido;
    private TipoCartao tipoCartao;

    public Cartao(Integer id, LocalDate dataCriacao, Boolean excluido, TipoCartao tipoCartao) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.excluido = excluido;
        this.tipoCartao = tipoCartao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
}