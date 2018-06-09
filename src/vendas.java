import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class vendas {
    public static void main(String[] args) {


      double saldo = 1500;
      double total = 0;

        System.out.println("Olá seu saldo atual é de R$ " + saldo );
        System.out.println("escolha sua opção de compra: ");


        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] FERRAMENTAS");
        System.out.println("[2] PEÇAS");
        System.out.println("[3] ACESSORIOS");
        System.out.print("OPÇÃO : ");

        int opcao1 = scanner.nextInt();

        switch (opcao1) {

            case 1:
                System.out.println("FERRAMENTAS DISPONÍVEIS EM ESTOQUE :");
                System.out.println("[1] CHAVE DE FENDA : R$ 100,00");
                System.out.println("[2] CHAVE DE BOCA 10 : R$ 150,00");
                System.out.println("[3] CHAVE DE BOCA 13 : R$ 200,00");
                System.out.println("[4] CHAVE DE INGLESA : R$ 500,00");
                System.out.println("[5] CHAVE DE BOCA 21 : R$ 600,00");
                System.out.print("OPÇÃO :");
                opcao1 = scanner.nextInt();

                switch (opcao1){
                    case 1:
                        total = saldo - 100.00;
                        break;

                    case 2:
                        total = saldo - 150.00;
                        break;
                    case 3:
                        total = saldo - 200.00;
                        break;
                    case 4:
                        total = saldo - 500.00;
                        break;
                    case 5:
                        total = saldo - 600.00;
                        break;

                }
                System.out.println("SEU SALDO ATUAL É : R$" + total);


        }
    }


}
