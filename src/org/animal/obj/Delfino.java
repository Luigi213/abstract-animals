package org.animal.obj;

import org.animal.abs.Animal;
import org.animal.inter.AnimalSwim;

public class Delfino extends Animal implements AnimalSwim{
	@Override
	public void dormi() {
		System.out.println("ZZZ");
		
	}
	@Override
	public void verso() {
		System.out.println("coff coff!!");
		
	}
	@Override
	public void mangia() {
		System.out.println("Mangia pesce");
		
	}
	public void nuota() {
		System.out.println("Sto nuotando");
	}
}
