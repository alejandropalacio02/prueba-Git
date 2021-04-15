package com.dam1.ejer_junit_4;

public class Iguales {
	int x, y, z;

	public Iguales(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String miraIguales() {
		String result = "Dos iguales";
		if (x == y && x == z)
			result = "Tres iguales";
		if (x!=y && x!=z && y!=z)
			result="Distintos";
		return result;
	}

}
