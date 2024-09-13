package org.douglasalvarado.clases;

public class SerieFigonachi {
    public SerieFigonachi(){};

    public StringBuilder solucion(Integer numeroMaximo){
        StringBuilder  resultado =  new StringBuilder();
        resultado.append("1, ");
        Integer vueltas = 1;
        Integer cambio = 0;
        while(vueltas + cambio < numeroMaximo){
            vueltas = vueltas + cambio;
            cambio = vueltas - cambio;
            resultado.append(vueltas+", ");
        }
        resultado.deleteCharAt(resultado.length()-2);
        return resultado;
    }
}
