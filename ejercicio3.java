import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args) {
        double t1, g1, t2, g2, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la latitud de la primera ciudad: ");
        Scanner teclado = new Scanner(System.in);
        t1 = teclado.nextDouble();
        
        System.out.print("Digite la longitud de la primera ciudad: ");
        g1 = teclado.nextDouble();
        
        System.out.print("Digite la latitud de la segunda ciudad: ");
        t2 = teclado.nextDouble();
        
        System.out.print("Digite la longitud de la segunda ciudad: ");
        g2 = teclado.nextDouble();
        
        resultado = 6371.07 * Math.acos(Math.sin(t1) * Math.sin(t2) + Math.cos(t1) * Math.cos(t2) * Math.cos(g1 - g2));
        System.out.print("La distancia entre las dos ciudades es: " +  String.format("%.4f", resultado) + " Kilometros ");
        
    }
}

