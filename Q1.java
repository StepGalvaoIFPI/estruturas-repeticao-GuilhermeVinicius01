import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int velocidade = Integer.valueOf(entrada.nextLine());

        if(velocidade>80){
            System.out.println("Vermelho");
        }else{
            System.out.println("Verde");
        }

    }
}
