package com.jose;

public class MontaAulaProva extends MontaAulaAbstrata {

    public MontaAulaProva(IMontaAula montaAula) {
        super(montaAula);
    }

    @Override
    public void montarAula() {
        montarAula("Prova");
    }
}
