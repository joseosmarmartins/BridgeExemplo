package com.jose;

public class Main {

    public static void main(String[] args) {
        MontaAulaAbstrata aulaNormal = new MontaAulaNormal(new MontaAula());
        aulaNormal.montarAula();

        MontaAulaAbstrata aulaProva = new MontaAulaProva(new MontaAula());
        aulaProva.montarAula();
    }
}
