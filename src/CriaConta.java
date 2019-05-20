public class CriaConta {
    public static void main(String[] args) {
        Conta primeriaConta = new Conta();
        primeriaConta.saldo = 300;

        System.out.println("Saldo da Primeira conta " + primeriaConta.saldo);

        Conta segundaConta = primeriaConta;
    }
}
