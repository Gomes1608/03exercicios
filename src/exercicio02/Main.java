package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        paciente.nome = sc.nextLine();
        System.out.println("Olá "+paciente.nome+", digite sua idade por favor: ");
        paciente.idade = sc.nextInt();
        double[] alvo = paciente.frequenciaIdeal();


        System.out.println(paciente.nome+", sua frequência máxima é de "+ paciente.frequenciaMax()+" bpm");
        System.out.println("Sua frequência ideal é entre "+alvo[0]+" bpm e "+alvo[1]+" bpm");

    }
}
