package com.jose;

public class MontaAulaNormal extends MontaAulaAbstrata {

    public MontaAulaNormal(IMontaAula montaAula) {
        super(montaAula);
    }

    @Override
    public void montarAula() {
        montarAula("Normal");
    }
}
