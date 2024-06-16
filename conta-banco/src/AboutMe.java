public class ContaTerminal {
    public static void main(String[] args)  {

        int numero = Integer.valueOf(args [0]);
        String agencia = args [1];
        String nomeCliente = args[2];
        double saldo = Double.valueOf(args[3]);
    }
}  

        //TODO: Conhecer e importar a classe Scanner

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //TODO: Exibir as mensagens para o nosso usuário

        System.out.println("Qual é o seu Nome?");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta:");
        int numero = scanner.next();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Qual o valor do seu depósito?");
        double saldo = scanner.nextDouble();
    }
    
    
        //TODO: Obter, pela classe Scanner, os valores digitados no terminal


        //TODO: Exibir a mensagem da conta criada

        System.out.println( "Olá, "" + nomeCliente + "" obrigado por criar uma conta em nosso banco,"); 
        System.out.println(" sua agência é "" + agencia + "", conta "" + numero + "" e seu saldo "" + saldo + ");
        System.out.println(" já está disponível para saque. Parabéns!");



    }
}
