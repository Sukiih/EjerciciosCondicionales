import java.util.Scanner;

public class DonarSangre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la edad del donante:");
        int edad = teclado.nextInt();
        System.out.println("Ingrese el peso del donante (en kg):");
        int peso = teclado.nextInt();

        if (edad >= 18 && edad <= 65 && peso > 50) {
            System.out.println("Usted puede donar");
        } else {
            System.out.println("El donante no es compatible.");
            if(edad < 18 || edad > 65) {
                System.out.println("Motivo: Debe tener entre 18 y 65 años");
            }
            if(peso < 50) {
                System.out.println("Motivo: Debe pesar más de 50kgs");
            }
        }
        teclado.close();
    }
}
