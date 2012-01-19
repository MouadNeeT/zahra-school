package m1.moduleProjet.vue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import m1.moduleProjet.traitement.Additionneur;
import m1.moduleProjet.traitement.Diviseur;
import m1.moduleProjet.traitement.Multiplicateur;
import m1.moduleProjet.traitement.Soustracteur;

public class Calculette {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/**
		 * 
		 */
		float op1, op2;
		
		while (true) {
			
			System.out.println("Veuillez introduire la valeur de l'opérande 1\n");
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			op1 = Integer.parseInt(keyboard.readLine());
			
			
			System.out.println("Veuillez introduire la valeur de l'opérande 2\n");
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			op2 = Integer.parseInt(keyboard.readLine());
			
			System.out.println("Veuillez choisir l'opération que vous desirez faire\n");
			System.out.println("1. Addition\n");
			System.out.println("2. Soustraction\n");
			System.out.println("3. Multiplication\n");
			System.out.println("4. Division\n");
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			String reponse = keyboard.readLine();
			int cas = Integer.parseInt(reponse); 
			
			
			switch (cas) {
			case 1:
				System.out.println("\nrésultat +"+new Additionneur(op1,op2).addition()); 
				break;
			case 2:
				System.out.println("\nrésultat -"+new Soustracteur(op1,op2).soustraction());
				break;
			case 3:
				System.out.println("\nrésultat *"+new Multiplicateur(op1,op2).multiplication());
				break;
			case 4:
				System.out.println("\nrésultat /"+new Diviseur(op1,op2).division());
				break;
			default:
				System.err.println("\nVeuillez choisir entre une des valeur cité ci-dessus ");
				break;
			}
			
		}
	
	}
	
}
