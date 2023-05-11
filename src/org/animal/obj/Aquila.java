package org.animal.obj;

import org.animal.abs.Animal;

public class Aquila extends Animal{
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
}
