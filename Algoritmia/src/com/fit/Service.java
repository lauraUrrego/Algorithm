package com.fit;

import java.util.LinkedList;

public class Service {
	
	static int[][] islandGrid= {
			{1,1,1,1,0},
			{1,1,0,1,0},
			{1,1,1,0,0},
			{0,0,0,1,0}			
	};
	

	
	static LinkedList<Position> position=new LinkedList<Position>();

	
	public static void main(String[] args) {
		
		System.out.println(findIsland(0,0,3,1));
		
	}
	
	public static Boolean findIsland(int i, int j, int l, int m) {
		Position pos = new Position(i, j);
		
		if (!verifyPos(i, j)) {
			return false;
		}
		if (position.contains(pos)) {
			return false;
		}		
		if (islandGrid[i][j] == 0) {
			return false;
		}
		if (i == l && j == m) {
			return true;
		}
		position.push(pos);
		// down
		if (findIsland(i + 1, j, l, m)) {
			System.out.println("move down");
			return true;
		}

		// right

		if (findIsland(i, j + 1, l, m)) {
			System.out.println("move right");
			return true;

		}

		// left

		if (findIsland(i, j - 1, l, m)) {
			System.out.println("move left");
			return true;
		}

		// up

		if (findIsland(i - 1, j, l, m)) {
			System.out.println("move up");
			return true;
		}

		return false;
	}
	
	static void imprimirMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        System.out.println("--------------");
    }
	
	public static boolean verifyPos(int i, int j) {
		if(i<0 || i>=islandGrid[i].length || j<0 || j>=islandGrid.length) {
			return false;
		}
		return true;
	}
}
