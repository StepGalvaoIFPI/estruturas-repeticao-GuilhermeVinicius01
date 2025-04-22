import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu salario:");
        double salario = Double.valueOf(entrada.nextLine());

        if (salario > 2000){
            double imposto = (0.15 * salario);
            double inss = (0.10 * salario);
            System.out.println("Salario: " +salario);
            System.out.println("Imposto: " +imposto);
            System.out.println("Inss: " +inss);
        }else{
            System.out.println("Salario: " +salario);
            System.out.println("Imposto: 0");
            System.out.println("Inss: 0");
        }
    }
}