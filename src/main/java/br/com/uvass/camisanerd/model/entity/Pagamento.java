package br.com.uvass.camisanerd.model.entity;

import java.time.LocalDate;

public class Pagamento {
    private Integer id;
    private Float valorPago;
    private Cartao cartao;

    public Pagamento(Integer id, Float valorPago, Cartao cartao) {
        this.id = id;
        this.valorPago = valorPago;
        this.cartao = cartao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
