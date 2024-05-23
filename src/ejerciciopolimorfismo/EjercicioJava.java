package ejerciciopolimorfismo;

import java.util.Scanner;

public class EjercicioJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione una opción (1. Futbolista, 2. Entrenador, 3. Masajista)");

        int opcion = entrada.nextInt();
        Padre Futbolista = null;

        switch (opcion) {
            case 1:
            System.out.println("Escribe el Id de un Futbolista");
            int id = entrada.nextInt();
            entrada.next();
            System.out.println("Escribe el nombre del Futbolista");
            String nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Escribe el apellido del Futbolista");
            String apellido = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Escribe la edad del Futbolista");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Escribe el dorsal del Futbolista");
            String dorsal = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Escribe la marcación del Futbolista");
            String demarcacion = entrada.nextLine();
            Futbolista = new Futbolista(id, nombre, apellido, edad, dorsal, demarcacion);
            break;

            case 2:
            System.out.println("Escribe el Id de un Entrenador");
            id = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Escribe el nombre de un entrenador");
            nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Escribe el apellido del entrenado");
            apellido = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Escribe la edad del entrenador");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Escribe el Id de la federación");
            String idFederacion = entrada.nextLine();
            Futbolista = new Entrenador(id, nombre, apellido, edad, idFederacion);
            break;

            case 3:
            System.out.println("Escribe el Id de una masajista");
            id = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Escribe el nombre de la masajista");
            nombre = entrada.nextLine();
            System.out.println("Escribe el apellido de la masajista");
            apellido = entrada.nextLine();
            System.out.println("Escribe la edad de la masajista");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Escribe la titulación de la masajista");
            String titulacion = entrada.nextLine();
            System.out.println("Escribe los años de experiencia de la masajista");
            String aniosExperiencia = entrada.nextLine();

            Futbolista = new Masajista(id, nombre, apellido, edad, titulacion, aniosExperiencia);
            break;

            default:
            System.out.println("Error, datos incorrectos");
            entrada.close();;
            return;
        }

        if (Futbolista != null){
            Futbolista.mostrarInformacion();
            Futbolista.concentrarse();
            Futbolista.Viajar();
        }
    }
}
class Padre{
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Padre(){}

    public Padre(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void mostrarInformacion(){
        System.out.println("DATOS GENERALES");
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public void concentrarse(){
        System.out.println("Soy una clase Padre..");
    }
    public void Viajar(){
        System.out.println("Soy una clase Padre2...");
    }
}

class Futbolista extends Padre{
    private String dorsal;
    private String demarcacion ;

    public Futbolista(){}

    public Futbolista(int id, String nombre, String apellido, int edad, String dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    @Override
    public void concentrarse(){
        System.out.println("Soy una futbolista y me concentro a la hora de jugar futbol");
    }
    @Override
    public void Viajar(){
        System.out.println("Soy una futbolista y me gusta viajar");
    }

    public void jugarPartido(){
        System.out.println("Soy un futbolista y juego futbol");
    }
    public void entrenar(){
        System.out.println("Soy un futbolista y entreno futbol todos los días");
    }
}

class Entrenador extends Padre{
    private String idFederacion;

    public Entrenador(){}

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    @Override
    public void concentrarse(){
        System.out.println("Soy el entrenador del equipo");
    }
    @Override
    public void Viajar(){
        System.out.println("Soy el entrenador y viajo junto con el equipo");
    }
    public void dirijerPartido(){
        System.out.println("Soy el entrenador y dirijo el equipo");
    }
    public void dirijirEntrenamiento(){
        System.out.println("Soy el entrenador y dirijo el entrenamiento");
    }
}
class Masajista extends Padre{
    private String titulacion;
    private String aniosExperiencia;

    public Masajista(){}

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, String aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public void concentrarse(){
        System.out.println("Soy la masajista del equipo");
    }
    @Override
    public void Viajar(){
        System.out.println("Soy la masajista del equipo");
    }
    public void darMasaje(){
        System.out.println("Soy la masajista del equipo");
    }
}