import java.util.Scanner;
public class MainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa nombre y apellido:");
            String nombre = sc.nextLine();
            String apellido = sc.nextLine();
            System.out.println("Ingresa edad:");
            int edad = sc.nextInt();
            System.out.println("Ingresa tu altura:");
            double altura = sc.nextDouble();
            Persona ps= new Persona();
            
            ps.nombre=nombre;
            ps.apellido=apellido;
            ps.edad=edad;
            ps.altura=altura;

            ps.mostrarNombreA();
            ps.mostrarEdad();
            ps.mostrarAltura();
            sc.close();

    }

        
}