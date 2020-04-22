package com.fit;

import java.util.LinkedList;
import java.util.Stack;

public class ServicePuzzleQ {
	static LinkedList<Position> position=new LinkedList<Position>();
	static Stack<Position> invalidPos= new Stack<Position>();
	
	
	// print console the matrix 1 is queen  
	static void printMatriz(String[][] matriz) {
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
        System.out.println("------------------------------");
    }
	
	//Verify the if position is correct, avoid the exception  
	//index of bound
	public static boolean verifyPos(String[][] matriz ,int i, int j) {
		if(i<0 || i>=matriz.length || j<0 || j>=matriz.length) {
			return false;
		}
		return true;
	}
	
	//principal method, recursive and iterative
	static boolean puzzel(String [][] matriz, int i, int j,int N) {
		
		//find solution
		if (position.size()==N) {
			printMatriz(matriz);
			return true;
		}
		
		if (!verifyPos(matriz,i, j)) {
			return false;
		}		
	
		//iterate columns 
		for (int k=0;k<N;k++) {				
			if(invalidPos.contains(new Position(i, k)))
				continue;
					
			position.add(new Position(i, k));
			matriz[i][k]="1";
			markAdj(i,k,N);			
				
			if(!puzzel(matriz,i+1,0,N)) {
				position.remove(new Position(i, k));
				desMarkAdj(i, k);
				matriz[i][k]="0";					
			}								
		}	
		
		return false;
	}
	
	static void markAdj(int i, int j, int n) {
		
		int val = i+j;
		int val2 = i-j;
		
		for(int k=0; k<n; k++) {
			for (int l=0; l<n; l++) {
				if(k+l==val || k-l==val2) {
					if(!invalidPos.contains(new Position(k,l))) {
						//matriz[k][l]="X";					
						invalidPos.push(new Position(k,l));	
					}					   				
				}
				if(k==i || l==j) {
					if(!invalidPos.contains(new Position(k,l))){
						//matriz[k][l]="X";					
						invalidPos.push(new Position(k,l));	
					}
									
				}
			}
		}	
		
		//imprimirMatriz(matriz);	
	}
	
	static void desMarkAdj(int i, int j) {
		int index = invalidPos.size()-1;
		while(!(invalidPos.get(index).getI()==i && invalidPos.get(index).getJ()==j)) {
			invalidPos.pop();
			index --;
		}
		invalidPos.pop();
		
	}

	public static void main(String[] args) {
		String[][] matriz = {
				{"0","0","0","0"},
				{"0","0","0","0"},
				{"0","0","0","0"},
				{"0","0","0","0"}
		};
		
	
		
		
		 puzzel(matriz,0,0, 4);
		 
	}
}
