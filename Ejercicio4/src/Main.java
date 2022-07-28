public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setEdad(23);
        cliente1.setNombre("Juan Pérez");
        cliente1.setTelefono(10124455);
        cliente1.setCredito(10000);

        System.out.println("Nombre Cliente: " + cliente1.getNombre() + " Edad: " + cliente1.getEdad() + " Telefono Contacto: " + cliente1.getTelefono() + " Saldo Credito: "+ cliente1.getCredito() + ".");


        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(22);
        trabajador1.setNombre("Ana patricia");
        trabajador1.setTelefono(5234877);
        trabajador1.setSalario(500);

        System.out.println("Nombre trabajador: " + trabajador1.getNombre() + " Edad: " + trabajador1.getEdad() + " Telefono Contacto: " + trabajador1.getTelefono() + " Salario: "+ trabajador1.getSalario() + ".");
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(){

    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public Cliente(){

    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public Trabajador(){

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}