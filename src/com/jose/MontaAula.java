package com.jose;

public class MontaAula implements IMontaAula {

    @Override
    public void montarAula(String conteudoAula) {
        System.out.println("Aula " + conteudoAula + " montada com sucesso!");
    }
}
