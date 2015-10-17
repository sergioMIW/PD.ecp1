package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    public VisitorMain() {
        coleccion.add(new Circle(12));
        coleccion.add(new Triangle(2,3));
        coleccion.add(new Square(2));
        
    }

    public void visitador() {
        VisitorFigure v1 = new VisitorFigure();
        for (Figure elemento : coleccion) {
            elemento.accept(v1);
        }
    }

    public static void main(String[] args) {
        IO.getIO().addView(new VisitorMain());
    }
}