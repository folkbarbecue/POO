package br.com.aulaheranca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Bem-vindo às Lojas Americanas");
        System.out.println("Antes de começarmos, qual seu nome?");
        String nomeus = tec.nextLine();
        if (nomeus.equals("gerente")) {
            // Implementar lógica do gerente se necessário
        } else {
            System.out.println("Bem-vindo " + nomeus + "! Você gostaria de comprar alguns desses produtos abaixo?");
            comprar(tec);
        }
    }

    public static void comprar(Scanner tec) {
        Produto batata = new Produto("Batata", 1, 9.99, 7);
        Produto fralda = new Produto("Fralda", 2, 20.90, 5);
        Produto chocolate = new Produto("Chocolate", 3, 2.99, 9);
        Produto amendoim = new Produto("Amendoim", 4, 1.99, 12);
        Produto celular = new Produto("Celular", 5, 999.80, 2);
        System.out.println(batata.nome + " | R$" + batata.preco + " | Código: " + batata.codigo);
        System.out.println(fralda.nome + " | R$" + fralda.preco + " | Código: " + fralda.codigo);
        System.out.println(chocolate.nome + " | R$" + chocolate.preco + " | Código: " + chocolate.codigo);
        System.out.println(amendoim.nome + " | R$" + amendoim.preco + " | Código: " + amendoim.codigo);
        System.out.println(celular.nome + " | R$" + celular.preco + " | Código: " + celular.codigo);
        
        double total = 0;  // Variável para armazenar o total da compra
        String continuar;

        do {
            System.out.println("O que você gostaria de comprar?");
            String comprando = tec.nextLine();

            if (comprando.equals("1")) {
                System.out.println("O estoque disponível do produto é: " + batata.quantidade + ". Quantas unidades você gostaria de comprar?");
                int quantidade = tec.nextInt();
                tec.nextLine(); // Limpar o buffer do scanner
                if (quantidade == 0) {
                    System.out.println("Compre outro produto então.");
                } else if (quantidade > batata.quantidade) {
                    System.out.println("Desculpe, temos apenas " + batata.quantidade + " unidades em estoque.");
                } else {
                    batata.quantidade -= quantidade;
                    total += quantidade * batata.preco;
                    System.out.println("Você comprou " + quantidade + " unidade de " + batata.nome + ". Total até agora: R$ " + total);
                }
            } else if (comprando.equals("2")) {
                System.out.println("O estoque disponível do produto é: " + chocolate.quantidade + ". Quantas unidades você gostaria de comprar?");
                int quantidade = tec.nextInt();
                tec.nextLine();
                if (quantidade == 0) {
                    System.out.println("Compre outro produto então.");
                } else if (quantidade > chocolate.quantidade) {
                    System.out.println("Desculpe, temos apenas " + chocolate.quantidade + " unidades em estoque.");
                } else {
                    chocolate.quantidade -= quantidade;
                    total += quantidade * chocolate.preco;
                    System.out.println("Você comprou " + quantidade + " unidade de " + chocolate.nome + ". Total até agora: R$ " + total);
                }
            } else if (comprando.equals("3")) {
                System.out.println("O estoque disponível do produto é: " + fralda.quantidade + ". Quantas unidades você gostaria de comprar?");
                int quantidade = tec.nextInt();
                tec.nextLine();
                if (quantidade == 0) {
                    System.out.println("Compre outro produto então.");
                } else if (quantidade > fralda.quantidade) {
                    System.out.println("Desculpe, temos apenas " + fralda.quantidade + " unidades em estoque.");
                } else {
                    fralda.quantidade -= quantidade;
                    total += quantidade * fralda.preco;
                    System.out.println("Você comprou " + quantidade + " unidade  de " + fralda.nome + ". Total até agora: R$ " + total);
                }
            } else if (comprando.equals("4")) {
                System.out.println("O estoque disponível do produto é: " + amendoim.quantidade + ". Quantas unidades você gostaria de comprar?");
                int quantidade = tec.nextInt();
                tec.nextLine();
                if (quantidade == 0) {
                    System.out.println("Compre outro produto então.");
                } else if (quantidade > amendoim.quantidade) {
                    System.out.println("Desculpe, temos apenas " + amendoim.quantidade + " unidades em estoque.");
                } else {
                    amendoim.quantidade -= quantidade;
                    total += quantidade * amendoim.preco;
                    System.out.println("Você comprou " + quantidade + " unidade  de " + amendoim.nome + ". Total até agora: R$ " + total);
                }
            } else if (comprando.equals("5")) {
                System.out.println("O estoque disponível do produto é: " + celular.quantidade + ". Quantas unidades você gostaria de comprar?");
                int quantidade = tec.nextInt();
                tec.nextLine();
                if (quantidade == 0) {
                    System.out.println("Compre outro produto então.");
                } else if (quantidade > celular.quantidade) {
                    System.out.println("Desculpe, temos apenas " + celular.quantidade + " unidade  em estoque.");
                } else {
                    celular.quantidade -= quantidade;
                    total += quantidade * celular.preco;
                    System.out.println("Você comprou " + quantidade + " unidade  de " + celular.nome + ". Total até agora: R$ " + total);
                }
            } else {
                System.out.println("Número inválido, coloque uma numeração válida.");
            }

            System.out.println("Você gostaria de comprar outro produto? (S para sim, N para não)");
            continuar = tec.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("O valor total da sua compra foi: R$ " + total);
        System.out.println("Volte sempre! as lojas amerocanas");
    }
}
