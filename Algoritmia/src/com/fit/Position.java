package com.fit;

public class Position {

	private int i;
	private int j;
	
	public Position(int i, int j) {
		this.i=i;
		this.j=j;
	}
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	 public boolean estaEnLaColumnaOFila(Position Position) {
	        if (j == Position.j || i == Position.i) {
	            return true;
	        }
	        return false;
	    }
	    public boolean estaEnLasDiagonal(Position Position) {
	        if (i - j == (Position.i - Position.j) || i + j == (Position.i + Position.j)) {
	            return true;
	        }
	        return false;
	    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Position [i=" + i + ", j=" + j + "]";
	}
	
	
	
	
}
