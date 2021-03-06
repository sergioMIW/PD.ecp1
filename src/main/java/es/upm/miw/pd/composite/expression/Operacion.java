package es.upm.miw.pd.composite.expression;

import es.upm.miw.pd.composite.expression.ExpresionMain;

public abstract class Operacion extends ExpresionMain {

    private ExpresionMain expresion1, expresion2;

    public Operacion(ExpresionMain expresion1, ExpresionMain expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    public ExpresionMain getExpresion1() {
        return expresion1;
    }

    public ExpresionMain getExpresion2() {
        return expresion2;
    }

}
