public class AnalizadorCalificaciones {

    // Arreglo que contiene dentro las calificaciones
    private int[] calificaciones = { 78, 92, 55, 88, 70, 95, 61 };

    // Metodo para mostrar las calificaciones que estan dentro del arreglo
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones:");
        for (int nota : calificaciones) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    // Metodo para calcular el promedio de calificaciones
    public double calcularPromedio() {
        int suma = 0;
        for (int nota : calificaciones) {
            suma += nota;
        }
        return (double) suma / calificaciones.length;
    }

    // Metodo para la nota mayor
    public int obtenerNotaMayor() {
        int mayor = calificaciones[0];
        for (int nota : calificaciones) {
            if (nota > mayor) {
                mayor = nota;
            }
        }
        return mayor;
    }

    // Metodo para la nota menor
    public int obtenerNotaMenor() {
        int menor = calificaciones[0];
        for (int nota : calificaciones) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    // Metodo main principal para analizar calificaciones
    public static void main(String[] args) {
        AnalizadorCalificaciones analizador = new AnalizadorCalificaciones();

        analizador.mostrarCalificaciones();

        double promedio = analizador.calcularPromedio();
        System.out.printf("Promedio: %.2f%n", promedio);

        System.out.println("Nota mayor: " + analizador.obtenerNotaMayor());
        System.out.println("Nota menor: " + analizador.obtenerNotaMenor());
    }
}
