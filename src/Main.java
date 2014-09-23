import java.util.Scanner;


public class Main {

	private static Scanner clavier;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Initialisation de la saisie en mode console 
		clavier = new Scanner(System.in);
		
		int nb1, nb2;
		System.out.print("Entrez ton nom :"); //affiche à l'ecran le message
		String nom = clavier.nextLine(); //saisir une ligne au clavier 
		System.out.println("Bonjour " + nom);
		System.out.println("Quel age as tu ?");
		int age = clavier.nextInt();
		for(int i = 1 ; i <= 3 ; i++){
		   System.out.println(" En quelle classe es tu ?");
	       String classe = clavier.nextLine();
		   nb1 = (int) Math.round(Math.random()*10);
	       nb2 = (int) Math.round(Math.random()*10);
	       System.out.print("\nCalcule : " + nb1 + " + " + nb2 + " = ");
	       int result = clavier.nextInt();
	
	    if (result == (nb1 + nb2)){
	    	 System.out.print("Bravo toto pour un éléve de CE1 " + nom + " tu as trouvé la bonne réponse ! ");
	    }
	    else{
	    	System.out.print("Faux " + nom + " il fallait trouver " + (nb1 + nb2));
	    }
	}

} }
