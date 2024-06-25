import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
   
    System.out.println("Login Admin:");
int Login = sc.nextInt ();
    int SenhaAdmin = 2020;
    int LoginA = 2121;
    if (Login == LoginA) {
      System.out.println("Coloque sua senha:");
      int senha = sc.nextInt();
      if(senha == SenhaAdmin);
      System.out.println("BEM-VINDO ADMIN");
    } else{
System.out.println("Acesso Negado");
    } 
    System.out.println(" ");
    System.out.println("Login Financeiro:");
    int Login2 = sc.nextInt ();
        int SenhaFinanceiro = 1919;
        int LoginB = 2000;
        if (Login2 == LoginB) {
          System.out.println("Coloque sua senha:");
          int senha = sc.nextInt();
          if(senha == SenhaFinanceiro);
          System.out.println("BEM VINDO FINANCEIRO");
        } else{
    System.out.println("Acesso Negado");
        } 
    System.out.println(" ");
    System.out.println("Login Cliente:");
    int Login3 = sc.nextInt ();
        int SenhaCliente = 1812;
        int LoginC = 2256;
        if (Login3 == LoginC) {
          System.out.println("Coloque sua senha:");
          int senha = sc.nextInt();
          if(senha == SenhaCliente);
          System.out.println("BEM VINDO AO SITE");
        } else{
    System.out.println("Acesso Negado");
        } 


    sc.close();
  }


}