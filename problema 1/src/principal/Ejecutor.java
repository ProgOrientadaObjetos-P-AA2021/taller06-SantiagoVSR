
package principal;
import entidades.Ciudad;
import entidades.Enfermeros;
import entidades.Hospital;
import entidades.Medicos;
import java.util.Scanner;
public class Ejecutor {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args){
        System.out.println("Ingrese el nombre de la Ciudad: ");
        String nombredelaCiudad = sc.nextLine();

        System.out.println("Ingrese el nombre de la provincia: ");
        String nombredelaProvincia = sc.nextLine();
        
        Ciudad city =new Ciudad(nombredelaCiudad, nombredelaProvincia);
        
        System.out.println("Ingrese el nombre del hospital: ");
        String nombredelHospital = sc.nextLine();

        System.out.println("Ingrese la dirección: ");
        String direccion = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de especialidades: ");
        int cantidadEspecialidades = Integer.parseInt(sc.nextLine());
        
        Hospital hosp1= new Hospital(nombredelHospital,direccion
                ,cantidadEspecialidades,city);
        
        System.out.println("Cantidad médicos a ingresar: ");
        int cantidadMedicos = Integer.parseInt(sc.nextLine());
        System.out.println("Cantidad enfermeros a ingresar: ");
        int cantidadEnfermeros = Integer.parseInt(sc.nextLine());
        
        createMedicos(hosp1, cantidadMedicos);
        createEnfermeros(hosp1, cantidadEnfermeros);
        
        hosp1.establecerSueldoTotal();
        
        System.out.println(hosp1);
    }
    
    public static void createMedicos(Hospital hospital, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del médico " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Especialidad: ");
            String especialidad = sc.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = sc.nextDouble();

            Medicos medico = new Medicos(nombre, especialidad, sueldo);
            hospital.addMedicos(medico);
        }
    }

    public static void createEnfermeros(Hospital hospital, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del enfermero " +(i + 1)+ ": ");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Tipo contrato: ");
            String contrato = sc.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = sc.nextDouble();

            Enfermeros enfermero = new Enfermeros(nombre, contrato, sueldo);
            hospital.addEnfermeros(enfermero);
        }

    }
   
}
