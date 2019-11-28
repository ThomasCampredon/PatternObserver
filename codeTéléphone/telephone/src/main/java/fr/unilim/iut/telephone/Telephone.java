package fr.unilim.iut.telephone;

public class Telephone {
	private Ecran ecran;
	private Bouton bouton;
	private Batterie batterie;
	private boolean isOpen;
	
	
	public Telephone(Ecran ecran, Bouton bouton, Batterie batterie) {
		this.ecran = ecran;
		this.bouton = bouton;
		this.batterie = batterie;
		this.isOpen = false;
	}
	
	
	
	
}
