package Java_Exceptions_Books;

import java.util.Scanner;



public class catalogo {

	public static void main(String[] args) {
		
		String[] Array = new String[4];
		
		
		// TODO Auto-generated method stub
		libro book = new libro ("titolo", 30, "Autore", "Editore");
		
		
		Scanner s = new Scanner (System.in);
		
		//chiedo titolo
		System.out.println("Inserisci il titolo del libro = ");
		Array[0] =s.nextLine();
		
		//chiedo pagine
		System.out.println("Inserisci le pagine del libro = ");
		Array[1] =s.nextLine();
		
		//chiedo autore
		System.out.println("Inserisci l'autore del libro = ");
		Array[2] =s.nextLine();
		
		//chiedo editore
		System.out.println("Inserisci l'editore del libro = ");
		Array[3] =s.nextLine();
		
		
		libro info = new libro (Array[0], Integer.parseInt(Array[1]), Array[2], Array[3]);
		System.out.println(info);
		
	}

}
