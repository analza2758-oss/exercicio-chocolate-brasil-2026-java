import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String tipoChocolate;
        int quantidadeGramas;
        double ovoPascoa;
        int notaPureza;

        System.out.println("--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---");

        System.out.print("Informe a porcentagem de teor de gordura: ");
        Double teorGordura = sc.nextDouble();

        if (teorGordura < 25) {
            System.out.println("ALERTA: Produto 'Fake' \nClassificar como 'Sabor Chocolate'.");
        } else if (teorGordura > 25 && teorGordura < 35) {
            System.out.println("Chocolate Comum (Padrão Nacional Atual).");
        } else if (teorGordura > 35) {
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE).");
        } 

        System.out.print("Qual o tipo de chocolate (AO_LEITE ou AMARGO): ");
        tipoChocolate = sc.nextLine();

        sc.nextLine();
        
          System.out.print("Informe a quantidade de gramas de açúcar por porção: ");
            quantidadeGramas = sc.nextInt();


        do {

        if (tipoChocolate.equalsIgnoreCase("AO_LEITE") && quantidadeGramas > 15) {
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
        } else {
            System.out.println("Classificação: Chocolate balanceado");
        }
        } while (tipoChocolate.equalsIgnoreCase("AO_LEITE") && quantidadeGramas > 15);

        do {
            System.out.print("Informe o preço do ovo de Páscoa: ");
            ovoPascoa = sc.nextDouble();

            System.out.print("Nota de pureza (0 a 10): ");
            notaPureza = sc.nextInt();

            if (ovoPascoa > 100 || notaPureza < 5) {
                System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões.");
            } else {
                System.out.println("APROVADO: Produto competitivo para o mercado externo.");
            } break;
        } while (ovoPascoa > 100 || notaPureza < 5);

        sc.close();


        }
    }

