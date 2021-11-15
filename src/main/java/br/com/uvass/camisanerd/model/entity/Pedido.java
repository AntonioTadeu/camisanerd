package br.com.uvass.camisanerd.model.entity;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private Integer id;
    private LocalDate data;
    private Float valorTotal;
    private List<ItemPedido> listaItemPedido;
    private List<Pagamento> listaPagamento;
    private Cliente cliente;

    public Pedido(Integer id, LocalDate data, Float valorTotal, List<ItemPedido> listaItemPedido, List<Pagamento> listaPagamento, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.listaItemPedido = listaItemPedido;
        this.listaPagamento = listaPagamento;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemPedido> getListaItemPedido() {
        return listaItemPedido;
    }

    public void setListaItemPedido(List<ItemPedido> listaItemPedido) {
        this.listaItemPedido = listaItemPedido;
    }

    public List<Pagamento> getListaPagamento() {
        return listaPagamento;
    }

    public void setListaPagamento(List<Pagamento> listaPagamento) {
        this.listaPagamento = listaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
