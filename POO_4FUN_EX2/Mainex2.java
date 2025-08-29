package POO_4FUN_EX2;
import java.util.Scanner;
public class Mainex2 {

    public static void main(String[] args) {
          lampada lamp1 = new lampada(estado.apagada);
          Scanner scanner = new Scanner(System.in);
          int opcao = 0;
       while(opcao != 4){
          System.out.println("bem vindo ao sistema de lampadas, segue as seguintes opções: \n");
       System.out.println("1-de um click \n 2-checar o estado \n 3- saber a quantidade de acendimentos \n 4- sair");
    opcao = scanner.nextInt();
switch (opcao){
        case 1:
        lamp1.click();
        break;
        case 2:
        System.out.println( lamp1.checaEstado());
        break;
        case 3:
        System.out.println( lamp1.qtdAcendimentos());
        break;
        case 4:
        opcao = 4;
        return;
        default:
        System.out.println("numero errado, por favor retornar denovo");
        break;
}
       }
    }
}