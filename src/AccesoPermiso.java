import java.util.Scanner;

public class AccesoPermiso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese el código de acceso:");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el nivel de permiso:");
        int nivelPermiso = teclado.nextInt();

        if (codigo == 2023 && (nivelPermiso == 1 || nivelPermiso == 2 || nivelPermiso == 3)) {
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        } else{
            System.out.println("Acceso denegado");
            if (codigo != 2023 ){
                System.out.println("Motivo: Código de acceso incorrecto.");
            }
            if (nivelPermiso != 1 && nivelPermiso != 2 && nivelPermiso != 3 ){
                System.out.println("Motivo: Nivel de permiso inválido.");
            }
        }
        teclado.close();
    }
}
