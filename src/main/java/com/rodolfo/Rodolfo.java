package com.rodolfo;

import java.util.Random;

public class Rodolfo {

    private static final int RODOLFO_ESTA_ACORDADO = 4;
    private boolean acordado = false;

    public boolean estaAcordado() {
        return acordado;
    }

    public void tentarAcordar() {
        int numGerado = new Random().nextInt(6);
        acordado = numGerado == RODOLFO_ESTA_ACORDADO;
    }
}
