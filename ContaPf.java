package BankSystem;

import java.io.PrintStream;

public class ContaPf extends Conta {

    public ContaPf(String nome, String cpfCnpj, String senha, double valContaCorrente, double valContaPoupanca, double valContaInvestimento) {
        super(nome, cpfCnpj, senha, valContaCorrente, valContaPoupanca, valContaInvestimento);
    }

    public void Depositar(double valor) {
            this.valContaCorrente = this.valContaCorrente + valor;
    }

    public void Sacar(double valor) {
        if (valor > this.valContaCorrente) {
            System.err.println("Valor em conta corrente insuficiente");
        } else {
            this.valContaCorrente = this.valContaCorrente - valor;
        }
    }

    public void TransferirPf(double valor, ContaPf conta) {
        if (valor > this.valContaCorrente) {
            System.err.println("Valor em conta corrente insuficiente");
        } else {
            this.valContaCorrente = this.valContaCorrente - valor;
            conta.Depositar(valor);
        }
    }
    public void TransferirPj(double valor, ContaPj conta) {
        if (valor > this.valContaCorrente) {
            System.err.println("Valor em conta corrente insuficiente");
        } else {
            this.valContaCorrente = this.valContaCorrente - valor;
            conta.Depositar(valor);
        }
    }


    public void DepositarPoup(double valor) {
            this.valContaPoupanca = this.valContaPoupanca + valor;
    }

    public void SacarPoup(double valor) {
        if (valor > this.valContaPoupanca) {
            System.err.println("Valor em conta poupança insuficiente");
        } else {
            this.valContaPoupanca = this.valContaPoupanca - valor;
        }
    }

    public void Investir(double valor) {
            this.valContaCorrente = this.valContaCorrente - valor;
            this.valContaInvestimento = this.valContaInvestimento + valor + (this.valContaInvestimento + valor) * 0.01;
    }

    @Override
    public String toString() {
        return "nome=" + nome + "\n" +
                "Conta Corrente=" + valContaCorrente + "\n" +
                "Conta Poupança=" + valContaPoupanca + "\n" +
                "Conta Investimento=" + valContaInvestimento;
    }
}



