package com.exercise;

import java.util.LinkedList;

public class Backtraking {

	//0 = wall
	//1 = path
	//2 = destination
	static int[][] maze={
		{2,1,1,1},
		{0,0,1,1},
		{0,0,0,1}
	};
	
	static LinkedList<Position> path = new LinkedList<Position>();
		
	public static boolean isValid(int x, int y) {
		if(x<0 || x>maze.length || y<0 || y>=maze.length) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Position pos = new Position(2,3);		
		path.push(pos);
		
		
		
		while (true) {
			int x= path.peek().x;
			int y=path.peek().y;
			maze[x][y]=0;
			//down
			if(isValid(x+1, y)) {
				if(maze[x+1][y]==2) {
					System.out.println("move down, you Win!!");
					return;
				}else if(maze[x+1][y]==1) {
					System.out.println("move down");
					path.push(new Position(x+1, y));
					continue;
				}
			}
			
			//left
			if(isValid(x, y-1)) {
				if(maze[x][y-1]==2) {
					System.out.println("move left,you Win!!");
					return;
				}else if(maze[x][y-1]==1) {
					System.out.println("move left");
					path.push(new Position(x, y-1));
					continue;
				}
			}
			
			
			//up
			if(isValid(x-1, y)) {
				if(maze[x-1][y]==2) {
					System.out.println("move up, you Win!!");
					return;
				}else if(maze[x-1][y]==1) {
					System.out.println("move up");
					path.push(new Position(x-1, y));
					continue;
				}
			}
			
			
			//rigth
			if(isValid(x, y+1)) {
				if(maze[x][y+1]==2) {
					System.out.println("move rigth, you Win!!");
					return;
				}else if(maze[x][y+1]==1) {
					System.out.println("move right");
					path.push(new Position(x, y+1));
					continue;
				}
			}
			
			path.pop();
			System.out.println("Move back");
			if(path.size()<=0) {
				System.out.println("No path");
				return;
			}
		}
		
		
		
	}
}
