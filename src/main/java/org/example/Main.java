package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Pessoa objetoPessoa = new Pessoa();


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso da Pessoa: ");
        objetoPessoa.peso = leitor.nextFloat();
        System.out.println("Digite a altura da Pessoa: ");
        objetoPessoa.altura = leitor.nextFloat();

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}