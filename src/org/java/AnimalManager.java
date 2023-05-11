package org.java;

import org.animal.inter.AnimalSwim;
import org.animal.inter.AnimalVol;

public class AnimalManager {
	public void faiVolare(Object animal) {
		if ( animal instanceof AnimalVol) {		
			AnimalVol a = (AnimalVol) animal;
			a.vola();
			System.out.println("\n-----------------");
		} 
	}
	public void faiNuotare(Object animal) {
		if( animal instanceof AnimalSwim) {
			AnimalSwim a = (AnimalSwim) animal;
			a.nuota();
		}
	}
}