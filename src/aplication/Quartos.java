package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Quartos {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.print("Quantidade de quartos vagos: ");
	int n = sc.nextInt();
	Aluguel[] quartos = new Aluguel[n];
	int quarto = 1;
	do {
	    System.out.println(" ");
	    System.out.print("Informe o quarto à ser alugado: ");
	    quarto = sc.nextInt();
	    if (quartos[quarto == 0 ? quarto : quarto - 1] == null && quarto <= 10) {
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("e-mail: ");
		String email = sc.nextLine();
		quartos[quarto - 1] = new Aluguel(quarto, nome, email);
	    } else if (quarto > 0) {
		System.out.println(" ");
		System.out.println("Quanto informado nao esta disponivel!");
	    }
	} while (quarto > 0 && quarto <= 10);
	System.out.println(" ");
	System.out.println("Relatorio Quartos Alugados!");
	int i;
	for (i = 0; i < quartos.length; i++) {
	    if (quartos[i] != null) {
		System.out.println(quartos[i]);
	    }
	}

	System.out.println("---------------------------------------------------");

	for (Aluguel obj : quartos) {
	    if (obj != null) {
		System.out.println(obj);
	    }
	}
    }
}
