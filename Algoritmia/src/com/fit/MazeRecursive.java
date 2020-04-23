package com.fit;

import java.util.Stack;

public class MazeRecursive {
	
	static int [][] mazeGraph = new int [][]{
			{0,0,0,1,1},
			{0,0,1,0,1},
			{0,0,0,0,1},
			{1,1,1,0,0},
			{1,2,0,0,1},
			{1,0,0,0,1}
	};
	
	static Stack<Position> way= new Stack<Position>();
	
	// 1: means that there is not way
	// 0: means that there is way
	static boolean Maze(int i,int j) {
		
		if(!validPos(i,j)) {
			return false;
		}
		if(mazeGraph[i][j]==1) {
			return false;
		}
		
		if(mazeGraph[i][j]==2) {
			System.out.println(way);
			System.out.println("Found at pos: "+i+","+j);
			return true;
		}
		
		if(way.contains(new Position(i, j))) {
			return false;
		}
		
		way.push(new Position(i,j));
		
		//Rigth
		if(Maze(i,j+1)) 
			return true;
		
			
		//Down		
		if(Maze(i+1,j)) 		
			return true;
		//Left
		if(Maze(i,j-1))		
			return true;
		//Up
		if(Maze(i-1,j)) 
			return true;
		
		way.pop();
		if(way.size()==0) {		
			return false;
		}
		return false;
		
	}
	
	
	
	
	
	
	
	

	private static boolean validPos(int i, int j) {
		if(i<0 || i>=mazeGraph.length || j<0 || j>=mazeGraph[i].length) 
			return false;
		
		return true;
	}









	public static void main(String[] args) {
		
		Maze(0, 0);
		//boolean x=validPos(3, 5);

	}

}
