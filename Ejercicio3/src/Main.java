public class Main {
    public static void main(String[] args) {
        //Instancia y creación de un objeto de tipo Persona.
        Persona persona1 = new Persona();
        persona1.setEdad(23);
        persona1.setNombre("Juan camilo");
        persona1.setTelefono(225544886);
        System.out.println("Nombre: " + persona1.getNombre() + " Edad: " + persona1.getEdad() + " Contacto: " + persona1.getTelefono() + ".");
    }
}
//Creación clase Persona{}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(){

    }
//Encapsulamiento de propiedades de la clase Persona
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}