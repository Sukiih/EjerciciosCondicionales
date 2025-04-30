import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer digito");
        int numUsuario1 = teclado.nextInt();
        System.out.println("Ingrese el segundo digito");
        int numUsuario2 = teclado.nextInt();

        if (numUsuario1 > numUsuario2){
            System.out.println("El numero mayor es " + numUsuario1);
        } else if (numUsuario1 == numUsuario2){
            System.out.println("ambos números son iguales!");
        } else {
        System.out.println("El numero mayor es " + numUsuario2);
      }
    }
}
