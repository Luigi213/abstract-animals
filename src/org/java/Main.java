package org.java;

import org.animal.abs.Animal;
import org.animal.obj.Aquila;
import org.animal.obj.Cane;
import org.animal.obj.Delfino;
import org.animal.obj.Passerotto;

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Cane();
		a1.dormi();
		a1.verso();
		a1.mangia();
		
		Animal a2 = new Passerotto();
		a2.dormi();
		a2.verso();
		a2.mangia();

		Animal a3 = new Aquila();
		a3.dormi();
		a3.verso();
		a3.mangia();

		Animal a4 = new Delfino();
		a4.dormi();
		a4.verso();
		a4.mangia();
	}
}
