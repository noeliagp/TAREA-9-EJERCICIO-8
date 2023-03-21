package org.example;

public class Main {

    public static void main(String[] args) {
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(0,1);
        Punto punto3 = new Punto(1,1);
        Punto punto4 = new Punto(1,0);

        Poligono triangulo = new Poligono(punto1,punto2,punto3);

        Poligono cuadrado = new Poligono(punto1,punto2,punto3);
        cuadrado.AgregarPuntos(punto4);
        System.out.println("La Lista de puntos del cuadrado: \n" + cuadrado.toString() + "\n" + "La Lista de puntos del triángulo: \n" + triangulo.toString());
    }
}