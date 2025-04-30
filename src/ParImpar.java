import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numUsuario = teclado.nextInt();
        if (numUsuario % 2 == 0 ){
            System.out.println(numUsuario + " es un número par");
        } else{
            System.out.println(numUsuario + " es un número impar");
        }
        teclado.close();
    }
}
