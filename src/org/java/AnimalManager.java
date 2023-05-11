package org.java;

import org.animal.inter.AnimalSwim;
import org.animal.inter.AnimalVol;

public class AnimalManager {
	public void faiVolare(AnimalVol animal) {
		animal.vola();
	}
	public void faiNuotare(AnimalSwim animal) {
		animal.nuota();
	}
}
