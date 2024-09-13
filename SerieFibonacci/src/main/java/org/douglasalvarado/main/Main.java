package org.douglasalvarado.main;

import org.douglasalvarado.clases.SerieFigonachi;

public class Main {
    public static void main(String[] args) {
        SerieFigonachi serieFigonachi = new SerieFigonachi();
        System.out.println(serieFigonachi.solucion(10));
        System.out.println(serieFigonachi.solucion(20));
        System.out.println(serieFigonachi.solucion(8));
        System.out.println(serieFigonachi.solucion(25));
    }
}