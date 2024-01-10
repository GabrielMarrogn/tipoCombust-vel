import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int gasolina = 0;
        int dissel = 0;
        int alcool = 0;

        for(;;){
            int a = sc.nextInt();

            if(a == 1){
                alcool++;
            }else if(a == 2){
                gasolina++;
            }else if(a== 3){
                dissel++;
            }else if(a == 4){
                break;
            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +alcool);
        System.out.println("Gasolina: " +gasolina);
        System.out.println("Diesel: " +dissel);
        sc.close();

    }
}
