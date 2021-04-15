package com.dam1.ejer_junit_4;

public class Mayor {
	int x,y,z;

	public Mayor(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public int calculaMayor(){
		int result = 0;
		if (x>y && x>z)
			result=x;
		if (x>y && x<=z)
			result=z;
		if (x<=y && y>z)
			result=y;
		if (x<=y && y<=z)
			result=z;
		return result;
		
	}

}
