package org.java;

import org.animal.abs.Animal;
import org.animal.obj.Aquila;
import org.animal.obj.Cane;
import org.animal.obj.Delfino;
import org.animal.obj.Passerotto;

public class Main {
	public static void main(String[] args) {
		Cane a1 = new Cane();
		
		Passerotto a2 = new Passerotto();

		Aquila a3 = new Aquila();

		Delfino a4 = new Delfino();
		
		AnimalManager anMan = new AnimalManager();
		Animal[] anArr = {a1, a2, a3, a4};
		for(int i=0; i<anArr.length; i++) {
			
			Animal a = anArr[i];
			a.dormi();
			a.verso();
			a.mangia();
			anMan.faiVolare(a);
			anMan.faiNuotare(a);
			System.out.println("\n-----------------");
		}
	}
}
