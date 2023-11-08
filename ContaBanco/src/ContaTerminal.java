import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // atributos:
        int agencia;
        String conta;
        String nome;
        double saldo = 0;

        // programa
        System.out.println("""
                ||||       SEJA BEM-VINDO(A) AO BANCO DEV        ||||
                Digite seus dados abaixo para abrir sua conta conosco
                """);
        System.out.print("Agência sem o digito: ");
        agencia = sc.nextInt();
        System.out.print("Conta com o digito: ");
        conta = sc.next();
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Saldo: R$");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo R$" +
                "%.2f já está disponível para saque. ", nome, agencia, conta, saldo);
    }
}
