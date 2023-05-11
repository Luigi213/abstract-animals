package org.animal.obj;

import org.animal.abs.Animal;

public class Delfino extends Animal{
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
}
