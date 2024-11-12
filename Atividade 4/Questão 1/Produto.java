package br.com.aulaheranca;
import java.util.Scanner;

public class Produto {
	String nome;
    int codigo;
    double preco;
    int quantidade;
	public Object batata;{}
	public static void main(String[] args) {
		
	}
	
      public void addProduto() {
    	  Produto batata = new Produto();
    	  batata.nome = "Batata";
    	  batata.codigo = 1;
    	  batata.preco = 9.99;
    	  batata.quantidade = 7;
    	  Produto Fralda = new Produto();
    	  Fralda.nome = "Fralda";
    	  Fralda.codigo = 2;
    	  Fralda.preco = 20.90;
    	  Fralda.quantidade = 5;
    	  Produto chocolate = new Produto();
    	  chocolate.nome = "Chocolate";
    	  chocolate.codigo= 3;
    	  chocolate.preco=2.99;
    	  chocolate.quantidade = 9;
    	  Produto amendoim = new Produto();
    	  amendoim.nome = "Amendoim";
    	  amendoim.codigo = 4;
    	  amendoim.preco = 1.99;
    	  amendoim.quantidade = 12;
    	  Produto celular = new Produto();
    	  celular.nome = "Celular";
    	  celular.codigo = 5;
    	  celular.preco = 999.80;
    	  celular.quantidade = 2;
    	  
      }

}
