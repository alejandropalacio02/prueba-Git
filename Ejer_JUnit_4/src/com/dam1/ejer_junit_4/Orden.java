package com.dam1.ejer_junit_4;

public class Orden {
	int x,y,z,m;
	public Orden(int x,int y, int z, int m) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.m=m;
	}

	public char devuelveOrden(){
		char r;
		if (m==x)
			r='P';
		else{
			if (m==y)
				r='S';
			else
				r='T';
		}
		return r;
	}
}
