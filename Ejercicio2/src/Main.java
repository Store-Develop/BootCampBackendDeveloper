import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es positivo o negativo.");
        int numeroIf = entreda.nextInt();
        //Estructura de control if
        if(numeroIf >= 0){
            System.out.println("El numero ingresado es: " + numeroIf +" positivo.");
        }else{
            System.out.println("El numero ingresado es: " + numeroIf +" negativo.");
        }

        //Estructura de control while
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("Ciclo While Numero: " + numeroWhile);
            numeroWhile ++;
        }

        do {

            System.out.println("Ciclo doWhile Numero: " + numeroWhile);
            numeroWhile += 3;
        }while (numeroWhile < 3);

        //estructura de control For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Estructura de control switch
        String estacion = "PRIMAVERA";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estacion del año en este momento es PRIMAVERA.");
                break;
            case "VERANO":
                System.out.println("La estacion del año en este momento es VERANO.");
                break;
            case "OTOÑO":
                System.out.println("La estacion del año en este momento es OTOÑO.");
                break;
            case "INVIERNO":
                System.out.println("La estacion del año en este momento es INVIERNO.");
                break;
            default:
                System.out.println("Estacion del año desconocida.");
        }
    }
}