package br.com.cf.bean;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private long id;
    private String nome;
    private String usuario;
    private String senha;
    private List<Despesa> despesas;

    public Usuario() {
    }

    public Usuario(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Usuario(long id, String nome, String usuario, String senha) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.despesas = new ArrayList<>();
    }
    
    public Usuario(String nome, String usuario, String senha, List<Despesa> despesas) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.despesas = despesas;
    }
    
    public Usuario(long id, String nome, String usuario, String senha, List<Despesa> despesas) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.despesas = despesas;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }
    
}
