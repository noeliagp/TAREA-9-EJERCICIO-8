package org.example;

import java.util.*;


/**
 * Class Poligono
 */
public class Poligono {
  private ArrayList<Punto> ArrayDePuntos ;
  //
  // Fields
  //

  //
  // Constructors
  // minimo tiene 3 puntos
  public Poligono (Punto punto_1,Punto punto_2,Punto punto_3) {
    ArrayDePuntos = new ArrayList<>();
    ArrayDePuntos.add(punto_1);
    ArrayDePuntos.add(punto_2);
    ArrayDePuntos.add(punto_3);
  };
  
  //
  // Methods
  //
// un metodo para agregar mas punto con add
  public void AgregarPuntos(Punto nuevoPunto){
    ArrayDePuntos.add(nuevoPunto);

  }

  //
  // Accessor methods
  //

  @Override
  public String toString() {
    return "Poligono {" +
            "Lista de puntos= " + ArrayDePuntos +
            "} ";
  }

  //
  // Other methods
  //

}
