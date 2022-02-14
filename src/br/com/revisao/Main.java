package br.com.revisao;

public class Main {

    public static void main(String[] args) {


        //Retornos

        System.out.println("Exercícios de Retorno");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado = " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,6);
        System.out.println("Área do retângulo = " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(6, 3, 8);
        System.out.println("Área do trapézio = " + areaTrapezio);

    }
}
