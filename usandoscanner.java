import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua idade:");
    int idade =sc.nextInt();

    System.out.println("Digite seu peso:");
    double peso =sc.nextDouble();

    System.out.println("Idade:" + idade);
    System.out.println("Peso:"+ peso);
    
  }
}