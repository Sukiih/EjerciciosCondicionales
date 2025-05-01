import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer lado:");
        int primerLado = teclado.nextInt();
        System.out.println("Ingrese el segundo lado:");
        int segundoLado = teclado.nextInt();
        System.out.println("Ingrese el tercer lado:");
        int tercerLado = teclado.nextInt();

        if (primerLado + segundoLado > tercerLado && segundoLado + tercerLado > primerLado
                && primerLado + tercerLado > segundoLado){
            System.out.println("Los lados pueden formar un triangulo");
        } else {
            System.out.println("Los lados no pueden formar un triángulo");
            if (primerLado + segundoLado <= tercerLado) {
                System.out.println("La suma del primer lado (" + primerLado + ") y del segundo lado (" + segundoLado +
                        ") es menor o igual al tercer lado (" + tercerLado + ").");
            }
            if (segundoLado + tercerLado <= primerLado) {
                System.out.println("La suma del segundo lado (" + segundoLado + ") y del tercer lado (" + tercerLado +
                        ") es menor o igual al primer lado (" + primerLado + ").");
            }
            if (primerLado + tercerLado <= segundoLado) {
                System.out.println("La suma del primer lado (" + primerLado + ") y del tercer lado (" + tercerLado +
                        ") es menor o igual al segundo lado (" + segundoLado + ").");
            }
        }
        teclado.close();
    }
}
