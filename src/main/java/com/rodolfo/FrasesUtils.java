package com.rodolfo;

import java.util.HashMap;
import java.util.Map;

public class FrasesUtils {
    public static final String FRASE_ALIVIO =
            "Rodolfo!!! Ahhhh!! Estava dormindo, ai que susto, que susto em, que susto!#12_Alivio.wav";
    public static final String FRASE_TRISTE = "Ôh não, Rudi morreu!!!#13_Triste.wav";

    public static Map<Integer, String> frases = new HashMap<>();
    static {
        frases.put(1, "Rodolfo!#1_Rodolfo.wav");
        frases.put(2, "RRodolfoo!!#2_RRodolfoo.wav");
        frases.put(3, "RRRodolfooo!!!!!!!#3_RRRodolfooo.wav");
        frases.put(4, "Que te passa?!#4_Que_te_passa.wav");
        frases.put(5, "Rudi!, Rudi!#5_Rudi_Rudi.wav");
        frases.put(6, "Rodolfin!!#6_Rodolfin.wav");
        frases.put(7, "Rodolfin!!!#7_Rodolfin.wav");
        frases.put(8, "Ãhuuu!! Rodolfo!!#8_Ahuuu_Rodolfo.wav");
        frases.put(9, "Rodolfo!! Rodolfoôô!!!#9_Rodolfo_Rodolfooo.wav");
        frases.put(10, "Está morto! Não respira!#10_Esta_morto_Nao_respira.wav");
        frases.put(11,
                "Não respi... acho que respira... respira... será que está vivo?#11_Nao_respi_acho_que_Respira_respira_sera_que_esta_vivo.wav");
    }


}
