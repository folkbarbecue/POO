package br.com.aulaheranca;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Bem vindo às Lojas Americanas");
        System.out.println("Antes de começarmos, qual seu nome?");
        String nomeus = tec.nextLine();
        if (nomeus.equals("gerente")) {
        } else {
            System.out.println("Bem-vindo " + nomeus + "! Você gostaria de comprar alguns desses produtos abaixo?");
            comprar();
        }
    }

    public static void comprar() {
        Scanner tec = new Scanner(System.in);
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
        System.out.println("O que você gostaria de comprar");
        String comprando = tec.nextLine();
        if (comprando.equals("1")) {
            System.out.println("O estoque disponível do produto é: " + batata.quantidade + " quanto desse produto você gostaria de comprar?");
            batata.quantidade = tec.nextInt();
            if (batata.estoque == 0) {
                System.out.println("Compre outro produto então");
            } else if (batata.estoque > estoqueP) {
                System.out.println("Desculpe, temos apenas " + estoqueP + " unidades em estoque.");
            } else {
                estoqueP -= batata.estoque;
                total += batata.estoque * valorP;
                System.out.println("Você comprou " + batata.estoque + " unidade(s) de Batata Pringles. Total até agora: R$ " + total);
            }
        } else if (comprando.equals("2")) {
            System.out.println("O estoque disponível do produto é: " + estoqueC + " quanto desse produto você gostaria de comprar?");
            QuantidadeC = tec.nextInt();
            if (QuantidadeC == 0) {
                System.out.println("Compre outro produto então");
            } else if (QuantidadeC > estoqueC) {
                System.out.println("Desculpe, temos apenas " + estoqueC + " unidades em estoque.");
            } else {
                estoqueC -= QuantidadeC;
                total += QuantidadeC * valorC;
                System.out.println("Você comprou " + QuantidadeC + " unidade(s) de Barra de Chocolate. Total até agora: R$ " + total);
            }
        } else if (comprando.equals("3")) {
            System.out.println("O estoque disponível do produto é: " + estoqueF + " quanto desse produto você gostaria de comprar?");
            QuantidadeF = tec.nextInt();
            if (QuantidadeF == 0) {
                System.out.println("Compre outro produto então");
            } else if (QuantidadeF > estoqueF) {
                System.out.println("Desculpe, temos apenas " + estoqueF + " unidades em estoque.");
            } else {
                estoqueF -= QuantidadeF;
                total += QuantidadeF * valorF;
                System.out.println("Você comprou " + QuantidadeF + " unidade(s) de Fralda Huggies. Total até agora: R$ " + total);
            }
        } else if (comprando.equals("4")) {
            System.out.println("O estoque disponível do produto é: " + estoqueA + " quanto desse produto você gostaria de comprar?");
            QuantidadeA = tec.nextInt();
            if (QuantidadeA == 0) {
                System.out.println("Compre outro produto então");
            } else if (QuantidadeA > estoqueA) {
                System.out.println("Desculpe, temos apenas " + estoqueA + " unidades em estoque.");
            } else {
                estoqueA -= QuantidadeA;
                total += QuantidadeA * valorA;
                System.out.println("Você comprou " + QuantidadeA + " unidade(s) de Amendoim Japonês. Total até agora: R$ " + total);
            }
        } else if (comprando.equals("5")) {
            System.out.println("O estoque disponível do produto é: " + estoqueE + " quanto desse produto você gostaria de comprar?");
            QuantidadeE = tec.nextInt();
            if (QuantidadeE == 0) {
                System.out.println("Compre outro produto então");
            } else if (QuantidadeE > estoqueE) {
                System.out.println("Desculpe, temos apenas " + estoqueE + " unidade(s) em estoque.");
            } else {
                estoqueE -= QuantidadeE;
                total += QuantidadeE * valorE;
                System.out.println("Você comprou " + QuantidadeE + " unidade(s) de Fritadeira Air Fryer. Total até agora: R$ " + total);
            }
        } else {
            System.out.println("Número inválido, coloque uma numeração válida");
        }

    

        System.out.println("Você gostaria de comprar outro produto? (S para sim, N para não)");
        String continuar = tec.nextLine();
        if (continuar.equalsIgnoreCase("N")) {
            break; 
        }
    }


    System.out.println("O valor total da sua compra foi: R$ " + total);
    System.out.println("Volte sempre!");
}
}

    }
}
