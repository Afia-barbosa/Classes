package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Pessoa objetoPessoa = new Pessoa();


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso da Pessoa: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da Pessoa: ");
        objetoPessoa.setaltura(leitor.nextFloat());

        objetoPessoa.getpeso();
        objetoPessoa.getAltura();

        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}