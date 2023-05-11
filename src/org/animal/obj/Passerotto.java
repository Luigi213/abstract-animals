package org.animal.obj;

import org.animal.abs.Animal;
import org.animal.inter.AnimalVol;

public class Passerotto extends Animal implements AnimalVol{
	@Override
	public void dormi() {
		System.out.println("ZZZ");
		
	}
	@Override
	public void verso() {
		System.out.println("Cip cip!!");
		
	}
	@Override
	public void mangia() {
		System.out.println("Mangia carne");
		
	}
	@Override
	public void vola() {
		System.out.println("Sto volando");
	}
}
