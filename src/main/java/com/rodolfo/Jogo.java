package com.rodolfo;

import java.util.Scanner;

public class Jogo {
    private int tentativa = 1;
    private String nomeJogador;
    private Rodolfo rodolfo = new Rodolfo();
    private Scanner entrada = new Scanner(System.in);
    private SoundPlayer soundPlayer = new SoundPlayer();
    private final int numMaxTentativas = FrasesUtils.frases.size();

    public Jogo() {
        comecar();
    }

    private void comecar() {
        perguntarNome();
        iniciarTentativas();
    }

    private void iniciarTentativas() {
        imprimirAviso();
        while(resultadoEhIndefinido() && entrada.nextLine().isBlank()) {
            imprimirFrase(FrasesUtils.frases.get(tentativa));
            tocarAudio(FrasesUtils.frases.get(tentativa));
            rodolfo.tentarAcordar();
            avaliarResultado();
        }
    }

    private void avaliarResultado() {
        if(rodolfo.estaAcordado()) {
            imprimirVitoria();
        }
        if(tentativa == numMaxTentativas && !rodolfo.estaAcordado()){
            imprimirDerrota();
        }
        tentativa++;
    }

    private void imprimirDerrota() {
        System.out.println("--");
        System.out.println("-------- R.I.P --------" );
        imprimirFrase(FrasesUtils.FRASE_TRISTE);
        tocarAudio(FrasesUtils.FRASE_TRISTE);
    }

    private void imprimirVitoria() {
        imprimirFrase(FrasesUtils.FRASE_ALIVIO);
        tocarAudio(FrasesUtils.FRASE_ALIVIO);
        System.out.println("--");
        System.out.println("Parabéns," + nomeJogador + " você acordou o Rodolfo na tentativa número" + tentativa);
    }

    private void tocarAudio(String s) {
        soundPlayer.play(new Audio(s.split("#")[1]));
    }

    private void imprimirFrase(String s) {
        System.out.println(s.split("#")[0]);
    }

    private boolean resultadoEhIndefinido() {
        return !rodolfo.estaAcordado() && tentativa <= numMaxTentativas;
    }

    private void imprimirAviso() {
        System.out.println("Aperte enter até acordar o Rodolfo");
        System.out.println("--");
    }

    private void perguntarNome() {
        System.out.println("Digite seu nome antes de começar.");
        while((nomeJogador = entrada.nextLine()).isBlank()) {
            System.out.println("O nome não pode ser deixado em branco!");
        }
        System.out.println("--");
        saudarJogador();
    }

    private void saudarJogador() {
        System.out.println("Bem-vindo, " + nomeJogador);
        System.out.println("--");
    }
}
