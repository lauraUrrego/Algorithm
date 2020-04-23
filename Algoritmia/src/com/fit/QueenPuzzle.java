package com.fit;

import java.util.ArrayList;
import java.util.List;

public class QueenPuzzle {

	  static boolean calcularReinas(int[][] matriz, int fila, int columna, List<Position> solucion) {
	        for (int j = columna; j < matriz.length; j++) {
	            boolean hayColicion = false;
	            Position Position = new Position(fila, j);
	            // Valida si hay coliciones con cada uno de los puntos que se han agregado a la solución
	            for (Position PositionAnterior : solucion) {
	                if (Position.estaEnLaColumnaOFila(PositionAnterior) || Position.estaEnLasDiagonal(
	                        PositionAnterior)) {
	                    hayColicion = true;
	                    break;
	                }
	            }
	            if (hayColicion) {
	                continue;
	            }
	            solucion.add(Position);
	            if (solucion.size() == matriz.length) {
	                return true;
	            }
	            if (!calcularReinas(matriz, fila+1, 0, solucion)) {
	                solucion.remove(Position);
	                continue;
	            } else {
	                System.out.println("solucion");
	                System.out.println(solucion);
	                break;
	            }
	        }
	        if (solucion.size() == matriz.length) {
	            return true;
	        }
	        return false;
	    }
	  
	  public static void main(String[] args) {
		   calcularReinas(new int[5][5], 0, 0, new ArrayList<Position>());
	}
}
