package BankSystem;

import java.io.PrintStream;

public class ContaPj extends Conta{

    public ContaPj(String nome, String cpfCnpj, String senha, double valContaCorrente, double valContaPoupanca, double valContaInvestimento) {
        super(nome, cpfCnpj, senha, valContaCorrente, valContaPoupanca, valContaInvestimento);
    }

    public void Depositar(double valor) {
        this.valContaCorrente = this.valContaCorrente + valor;
    }

    public void Sacar(double valor) {
        if (valor > this.valContaCorrente) {
            System.err.println("Valor em conta corrente insuficiente");
        } else {
            this.valContaCorrente = this.valContaCorrente - (valor + (valor*0.005));
        }
    }

    public void TransferirPj(double valor, ContaPj conta) {
        if (valor > this.valContaCorrente) {
            System.err.println("Valor em conta corrente insuficiente");
        } else {
            this.valContaCorrente = this.valContaCorrente - (valor + (valor*0.005));
            conta.Depositar(valor);
        }
    }
    public void TransferirPf(double valor, ContaPf conta) {
        if (valor > this.valContaCorrente) {
            System.err.println("Valor em conta corrente insuficiente");
        } else {
            this.valContaCorrente = this.valContaCorrente - (valor + (valor*0.005));
            conta.Depositar(valor);
        }
    }


    public void Investir(double valor) {
        this.valContaCorrente = this.valContaCorrente - valor;
        this.valContaInvestimento = this.valContaInvestimento + valor + (this.valContaInvestimento + valor) * 0.03;
    }

    @Override
    public String toString() {
        return "nome=" + nome + "\n" +
                "Conta Corrente=" + valContaCorrente + "\n" +
                "Conta Investimento=" + valContaInvestimento;
    }
}



