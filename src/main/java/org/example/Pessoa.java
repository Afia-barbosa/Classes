package org.example;

public class Pessoa {

       private float peso;
       private float altura;

        public float calcularIMC() {
            float imc;
            imc = peso / (altura * altura);
            return imc;
        }

        //metodo de acess

        public void setPeso(float peso) {
            this.peso = peso;
        }

        public float getpeso() {
            return peso;
        }

        public void setaltura(float altura) {
            this.altura = altura;
        }

        public float getAltura() {
            return altura;
        }

}
