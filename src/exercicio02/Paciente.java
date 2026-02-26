package exercicio02;

public class Paciente {

    String nome;
    int idade;

    public int frequenciaMax(){
        return 220-idade;
    }

    public double [] frequenciaIdeal(){
        double[]alvo = new double[2];
        int fm=frequenciaMax();
        alvo[0]= (fm/100)*50;
        alvo[1]= (fm/100)*85;

        return alvo;
    }



}
