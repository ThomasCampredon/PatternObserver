package fr.unilim.iut.telephone;

public class TheObserv {

	public static void main(String[] args) {
		Boucle boucle = new Boucle();
		Boucle boucle2 = new Boucle(boucle);
		Bouton bouton = new Bouton();
		Telephone telephone = new Telephone(new Ecran(8.1), bouton, new Batterie(10));

		bouton.setIsPressed(true);
	}
}
