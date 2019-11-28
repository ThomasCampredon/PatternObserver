package fr.unilim.iut.telephone;

public class Bouton extends Thread{
	private boolean isPressed;

	public Bouton() {
		this.isPressed = false;
	}
	

	public boolean detecterPression() {
		return isPressed;
	}
	
	
	
	public void setIsPressed(boolean pressed) {
		this.isPressed = pressed;
	}
}
