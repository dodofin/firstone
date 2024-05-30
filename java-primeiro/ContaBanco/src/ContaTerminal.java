import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        double saldo = 251.50;
    
        System.out.println("Por favor, digite  o seu nome: ");
            String nomeusuario = scanner.nextLine();
            

        System.out.println("Por favor, agora digite sua agência: ");    
            String agencia = scanner.nextLine();
            
        
   
        System.out.println("Digite sua conta: ");
            int contausuario = scanner.nextInt();
            
            
        
        
        
        System.out.println("Olá " + nomeusuario + ", obrigado por criar uma conta  em nosso banco ! sua agência é " + agencia + ", conta  " + contausuario + " e o seu saldo no valor de " + saldo + ", ja está disponível para saque.");
   
   
            scanner.close();

        }









}
