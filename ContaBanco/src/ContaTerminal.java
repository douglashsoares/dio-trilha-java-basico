import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        int numero;
        String agencia;
        double saldo = 50.00;
        String entrada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para criar uma conta no Banco precisamos que preencha os seguintes dados");
        System.out.println("Digite por favor o Nome do Cliente: ");
        nomeCliente = scanner.next();

        while (true){
            System.out.println("Digite o seu Número \"Ex:(1213)\": ");
            entrada = scanner.next();

            if (entrada.matches("\\d{4}")){
                numero = Integer.parseInt(entrada);
                break;
            }else {
                System.out.println("Digite Somente 4 números");
            }
        }

        while (true){
            System.out.println("Por favor, Digite o número da sua Agência \"Ex:(067-8)\" ");
            entrada = scanner.next();

            if (entrada.matches("\\d{3}-\\d{1}")){
                agencia = entrada;
                break;
            }else{
                System.out.println("Formato inválido! Por favor, digite no formato NNN-N, por exemplo, 067-8.");
            }
        }

        System.out.println("Conta Criada com Sucesso !!!!");

        System.out.println("----------------------------------------------");
        System.out.println("Olá " +nomeCliente+ ",\n" +
                "Obrigado por criar uma conta em nosso banco,\n" +
                "Sua Agência é: " +agencia+ ",\n" +
                "Conta Número " +numero+ " e seu Saldo são de " +saldo+ " Reais" +
                " \nQue estão já estão disponíveis para o saque");
        System.out.println("----------------------------------------------");
    }
}