package com.renzo.PjtDio.model;

public abstract class Personagem {

    private String nome;
    private String vida;
    private String ataque;

    public Personagem(String nome, String vida, String ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
}
