import java.util.Scanner;


public class Calculette {
	
	private static Scanner clavier;
	
	
	public static void main(String[] args){
		
		clavier = new Scanner(System.in);

	/**
	 * @param args
	 */
	
		int nb1;
		int nb2;
		float resultat;
		String operateur;
		
		System.out.print(" saisir le premier nombre : ");
		nb1 = clavier.nextInt();
		
		clavier.nextLine();
		
		System.out.print(" saisir l'opertateur : ");
		operateur = clavier.nextLine();
		
		System.out.print(" saisir le deuxieme nombre : ");
		nb2 = clavier.nextInt();
		
	    if (operateur.equals("+") ) { 
	    	resultat = nb1 + nb2;
	    	System.out.println(resultat);
	    }
	    else {
	    	if (operateur.equals("-") ) {
	    		resultat = nb1 - nb2;
	    		System.out.println(resultat);
	    	}
	    	else {
	    		if ( operateur.equals("*") ) {
	    			resultat = nb1 * nb2;
	    			System.out.println(resultat);
	    		}
	    		else {
	    			if ( operateur.equals("/") & nb2 == 0){
	    				System.out.println("Division par 0 impossible");
	    			}
	    			else
	    				if ( operateur.equals("/") & nb2 != 0 ){
	    					resultat = nb1 / nb2 ;
	    					System.out.println(resultat);
	    				}
	    			
	    			}
	    		}
	    	
	    	}
	    }
	    	
		
		// TODO Auto-generated method stub

	}


