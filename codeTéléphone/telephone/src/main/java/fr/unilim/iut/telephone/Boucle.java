package fr.unilim.iut.telephone;

public class Boucle extends Thread{
	Thread thread;
	
	public Boucle () {
		super("boucle");
		this.thread.start();
	}
	
	public Boucle(Thread t){
	    super("trueBoucle");
	    this.thread = t;
	    this.start();
	  }
	
	public void run() {
		while (true) {
			System.out.println("bouton ?");
			if (1==2) {
				System.out.println("bouton appuyé !");
			}
		}
	}
}
	
