package org.animal.obj;

import org.animal.abs.Animal;
import org.animal.inter.AnimalVol;

public class Aquila extends Animal implements AnimalVol{
	@Override
	public void dormi() {
		System.out.println("ZZZ");
		
	}
	@Override
	public void verso() {
		System.out.println("Ca ca!!");
		
	}
	@Override
	public void mangia() {
		System.out.println("Mangia carne");
		
	}
	public void vola() {
		System.out.println("Sto volando");
	}

}
