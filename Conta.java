package BankSystem;

public class Conta {

    public String nome;
    public String CpfCnpj;
    public String senha;
    public double valContaCorrente;
    public double valContaPoupanca;
    public double valContaInvestimento;

    public Conta(String nome, String cpfCnpj, String senha, double valContaCorrente, double valContaPoupanca, double valContaInvestimento) {
        this.nome = nome;
        this.CpfCnpj = cpfCnpj;
        this.senha = senha;
        this.valContaCorrente = valContaCorrente;
        this.valContaPoupanca = valContaPoupanca;
        this.valContaInvestimento = valContaInvestimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return CpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        CpfCnpj = cpfCnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValContaCorrente() {
        return valContaCorrente;
    }

    public void setValContaCorrente(double valContaCorrente) {
        this.valContaCorrente = valContaCorrente;
    }

    public double getValContaPoupanca() {
        return valContaPoupanca;
    }

    public void setValContaPoupanca(double valContaPoupanca) {
        this.valContaPoupanca = valContaPoupanca;
    }

    public double getValContaInvestimento() {
        return valContaInvestimento;
    }

    public void setValContaInvestimento(double valContaInvestimento) {
        this.valContaInvestimento = valContaInvestimento;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", CpfCnpj='" + CpfCnpj + '\'' +
                ", valContaCorrente=" + valContaCorrente +
                ", valContaPoupanca=" + valContaPoupanca +
                ", valContaInvestimento=" + valContaInvestimento +
                '}';
    }
}
