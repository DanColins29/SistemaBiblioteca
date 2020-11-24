package br.multitask.sistemabiblioteca;

public class Livro {
    String name;
    String desc;
    int cod;

    public Livro() {

    }

    public Livro(String _name, String _desc, int _cod) {
        this.name = _name;
        this.desc = _desc;
        this.cod = _cod;
    }

    public Livro(String _name, String _desc) {
        this.name = _name;
        this.desc = _desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
