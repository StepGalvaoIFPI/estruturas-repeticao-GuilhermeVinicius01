import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu salario:");
        double salario = Double.valueOf(entrada.nextLine());

        if (salario > 1250){
        double total = (0.10 * salario);
        double salario_final = (total + salario);
        System.out.println("Aumento: " +total);
        System.out.println("Salario Final: " +salario_final);
        
        }else{
            double total = (0.15 * salario);
            double salario_final = (total + salario);
            System.out.println("Aumento: " +total);
            System.out.println("Salario Final: " +salario_final);}
    }
}
