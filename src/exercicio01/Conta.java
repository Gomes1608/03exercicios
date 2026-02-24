package exercicio01;

public class Conta {

    String correntista;
    int nmr;
    double saldo;



    //metodo para depositar um valor na conta
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    //metodo para sacar um valor da conta

    public void sacar(double valor){
        saldo = saldo - valor;
    }

}
