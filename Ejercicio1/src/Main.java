public class Main {
    public static void main(String[] args) {
        //Primera parte.
        //Llamado a la función en el main y darle valores.
        int resultado;
        resultado = suma(1, 2, 3);
        System.out.println("El resultado es: " + resultado);

        //Segunda parte.
        Coche miCoche = new Coche();
        miCoche.colocarPuertas();
        System.out.println("Su coche tiene: " + miCoche.puertas + " Puerta(s).");
    }
    // Creación de función con tres parametros que sean números que se suman entre sí.
    public static int suma(int operandoA, int operandoB, int operandoC){
        return operandoA + operandoB + operandoC;
    }
}
//Creación clase coche.
class Coche{
    //Variable numérica que almacena el número de puertas que tiene.
    public int puertas = 0;

    //Función que incrementa el número de puertas que tiene el coche.
    public void colocarPuertas(){
        this.puertas ++;
    }
}