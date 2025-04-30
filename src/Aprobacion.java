public class Aprobacion {
    public static void main(String[] args) {
        double notaAprobado = 7.0;
        double promedioAlumno = 8.2;
        double alumnoRecuperacion = 5.8;
        double notaReprobado = 5.0;
        double alumnoReprobado = 4.3;
        if(promedioAlumno >= notaAprobado){
            System.out.println("El estudiante tuvo un promedio de " + promedioAlumno + " y fue aprobado");
        } else if (alumnoRecuperacion >= 5.0 && alumnoRecuperacion < 7.0){
            System.out.println
                ("El estudiante obtuvo un promedio de " + alumnoRecuperacion + " y está en recuperación");
        } else {
                System.out.println("El estudiante tuvo un promedio de " + alumnoReprobado + " y fue reprobado.");
            }
        }
}
