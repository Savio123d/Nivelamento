import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("1-Moto \n2-Caminhoes. ");
        int s=leitor.nextInt();
        if(s==1){
            Veiculo moto = new Moto();

        }else if(s==2){
            Veiculo moto = new Caminhoes();

        }

        System.out.printf("Modelo: ");




    }
}