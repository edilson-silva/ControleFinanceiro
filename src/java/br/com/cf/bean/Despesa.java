package br.com.cf.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Despesa {

    private long id;
    private Categoria categoria;
    private String descricao;
    private BigDecimal preco;
    private Date dataDespesa;

    public Despesa() {
    }

    public Despesa(Categoria categoria, String descricao, BigDecimal preco, Date dataDespesa) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.dataDespesa = dataDespesa;
    }

    public Despesa(long id, Categoria categoria, String descricao, BigDecimal preco, Date dataDespesa) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.dataDespesa = dataDespesa;
    }

    public long getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Date getDataDespesa() {
        return dataDespesa;
    }

}
