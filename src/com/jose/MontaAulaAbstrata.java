package com.jose;

public abstract class MontaAulaAbstrata {

    protected IMontaAula montaAula;

    public MontaAulaAbstrata(IMontaAula montaAula) {
        this.montaAula = montaAula;
    }

    public void montarAula(String conteudoAula) {
        montaAula.montarAula(conteudoAula);
    }

    public abstract void montarAula();
}
