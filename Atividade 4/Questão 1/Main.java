package br.com.aulaheranca;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		
		Scanner tec = new Scanner(System.in);
    System.out.println("Bem vindo as lojas americanas");
    System.out.println("Antes de começarmos, qual seu nome?");
    String nomeus = tec.nextLine();
    if (nomeus.equals("gerente")) {
    } else {
        System.out.println("Bem-vindo " + nomeus + "! Você gostaria de comprar alguns desses produtos abaixo?");
        comprar();
    }

	}

	public static void comprar() {
		Produto prod = new Produto();
System.out.println(prod.batata.nome" | ");
	}

}
