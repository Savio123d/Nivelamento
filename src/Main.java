import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAtual = LocalDate.now().format(formatter);

        System.out.printf("1-Moto \n2-Caminhoes. ");
        int s=leitor.nextInt();
        switch (s){
            case 1:
                Moto moto = new Moto();
                moto.anodFB = dataAtual;
                System.out.println("Digite o modelo do moto: ");
                moto.modelo = leitor.next();
                System.out.println("Digite o placa do moto: ");
                moto.placa = leitor.next();
                System.out.println("Digite kilometragem do moto: ");
                moto.km = leitor.nextFloat();
                System.out.println("Digite numero cilindrada do moto: ");
                moto.cilindrada = leitor.nextInt();
                System.out.println("Digite o preço da moto: ");
                moto.preco = leitor.nextFloat();

                if(moto.km >=  3.000){
                    System.out.println("⚠️ Veículo precisa de revisão!");
                }
                break;

            case 2:
                Caminhoes caminhoes = new Caminhoes();
                caminhoes.anodFB = dataAtual;
                System.out.println("Digite o modelo do Caminho: ");
                caminhoes.modelo = leitor.next();
                System.out.println("Digite o placa do Caminho: ");
                caminhoes.placa = leitor.next();
                System.out.println("Digite kilometragem do Caminho: ");
                caminhoes.km = leitor.nextFloat();
                System.out.println("Digite numero de eixos: ");
                caminhoes.eixo = leitor.nextInt();
                System.out.println("Digite o numero de toneladas: ");
                caminhoes.tonelados = leitor.nextInt();
                System.out.println("Digite o numero preço do caminhão: ");
                caminhoes.preco =  leitor.nextFloat();


                if (caminhoes.tonelados >= 500 || caminhoes.km >= 10000) {
                    System.out.println("⚠️ Veículo precisa de revisão!");
                }
                break;
        }

    }
}