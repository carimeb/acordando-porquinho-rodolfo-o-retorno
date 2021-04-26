package com.rodolfo;

public class Audio {
    private final String nome;

    public Audio(String nome) {
        this.nome = nome;

    }

    public String getPath() {
        return this.getClass().getResource("/" + nome).getPath();
    }
}
