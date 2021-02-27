package BankSystem;

public class Aplicacao {
    public static void main(String[] args) {
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.Iniciar();
    }

    private void Iniciar() {
        
        ContaPf contaPf = new ContaPf("Kleber", "47328807888", "123456", 0.00, 0.00, 0.00);
        ContaPf contaPfSegunda = new ContaPf("Neide", "47325207188", "123456", 0.00, 0.00, 0.00);

        contaPf.Depositar(10000);
        contaPf.DepositarPoup(2000);
        contaPf.TransferirPf(1000,contaPfSegunda);
        contaPf.Sacar(1000);
        contaPf.SacarPoup(1000);
        contaPf.Investir(1000);

        /* VALOR ESPERADO
        nome=Kleber
        Conta Corrente=7000.0
        Conta Poupança=1000.0
        Conta Investimento=1010.0
        nome=Neide
        Conta Corrente=1000.0
        Conta Poupança=0.0
        Conta Investimento=0.0
        */

        System.out.println(contaPf.toString());
        System.out.println(contaPfSegunda.toString());

        ContaPj contaPj = new ContaPj("Eduardo", "47326607888", "123456", 0.00, 0.00, 0.00);
        ContaPj contaPjSegunda = new ContaPj("Bruna", "47321537888", "123456", 0.00, 0.00, 0.00);

        contaPj.Depositar(20000);
        contaPj.Sacar(1000);
        contaPj.TransferirPj(1000,contaPjSegunda);
        contaPj.Investir(2000);

        /* VALOR ESPERADO
        nome=Eduardo
        Conta Corrente=15990.0
        Conta Investimento=2060.0
        nome=Bruna
        Conta Corrente=1000.0
        Conta Investimento=0.0
        */
        System.out.println(contaPj.toString());
        System.out.println(contaPjSegunda.toString());
    }
}
