package br.multitask.sistemabiblioteca;

public class Usuario {
    String name;
    String senha;
    int cod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
