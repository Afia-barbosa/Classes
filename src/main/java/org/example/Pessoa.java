package org.example;

public class Pessoa {

        float peso;
        float altura;

        public float calcularIMC() {
            float imc;
            imc = peso / (altura * altura);
            return imc;
        }

}
