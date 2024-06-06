import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner valordigitado = new Scanner(System.in);
       System.out.println(" Digite a idade da pessoa");
       int idade = valordigitado.nextInt();
       int meses = idade*12;
       int dias =  idade*365;
       System.out.println("Sua idade é: "+idade);
       System.out.println("Sua idade em meses é : "+meses);
       System.out.println("Sua idade em dias é :"+dias);
   }
}
