package br.com.cf.bean;

public class Categoria {
    
    private long id;
    private String nome;

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public Categoria(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
}
