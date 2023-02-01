package Java_Exceptions_Books;

import java.util.Scanner;



public class catalogo {

	public static void main(String[] args) {
		
		String[] Array = new String[4];
		
		
		// TODO Auto-generated method stub
		
		
		
		
		Scanner s = new Scanner (System.in);
		
		//chiedo titolo
		System.out.println("Inserisci il titolo del libro = ");
		
		Array[0] = s.nextLine();
		int i = 0;
		while (Array[0] == null || Array[0].isEmpty()) {
			
			if (Array[0] == null || Array[0].isEmpty()) {
			    System.out.println("Non puoi lasciare il campo vuoto  RIPROVA");
			    Array[0] = s.nextLine();
			}
		
		}
		
		//chiedo pagine
		System.out.println("Inserisci le pagine del libro = ");
		Array[1] =s.nextLine();
		
		while (true) {
            try {
                int pageCount = Integer.parseInt(Array[1]);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un NUMERO non lettere");
                Array[1] = s.nextLine();
            }
        }
		
		
		
		//chiedo autore
		System.out.println("Inserisci l'autore del libro = ");
		Array[2] =s.nextLine();
		while (Array[2] == null || Array[2].isEmpty() || i < Array.length && (Array[2] == null)) {
			
			if (Array[2] == null || Array[2].isEmpty() || i < Array.length && (Array[2] == null) ) {
			    System.out.println("Non puoi lasciare il campo vuoto  RIPROVA");
			    Array[2] = s.nextLine();
			}
		
		}
		
		//chiedo editore
		System.out.println("Inserisci l'editore del libro = ");
		Array[3] =s.nextLine();
		
		while (Array[3] == null || Array[2].isEmpty()) {
			
			if (Array[3] == null || Array[3].isEmpty()) {
			    System.out.println("Non puoi lasciare il campo vuoto  RIPROVA");
			    Array[3] = s.nextLine();
			}
		
		}
		
		
		libro info = new libro (Array[0], Integer.parseInt(Array[1]), Array[2], Array[3]);
		System.out.println(info);
		
	}

}