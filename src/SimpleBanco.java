import java.util.Scanner;

public class SimpleBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int depositarDinero = 0;
        int retirarDinero = 0;
        int opcion = 0;

        while (opcion != 4){
            System.out.println("---------------------");
            System.out.println("        BBVA");
            System.out.println("---------------------");
            System.out.println("1. Mostrar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("---------------------");

            opcion = scanner.nextInt();
            System.out.println("Opción Elegida: " + opcion);

            switch (opcion) {
                case 1:
                    System.out.println("Actualmente tienes: " + saldo);
                    break;
                case 2:
                    System.out.println("Tu balace es de: " + saldo);
                    System.out.println("Ingresa la cantidad a depositar: ");
                    depositarDinero = scanner.nextInt();
                    if (depositarDinero <= saldo) {
                        System.out.println("Procesando tu deposito...");
                        System.out.println("Has depositado: " + depositarDinero + " con exito" +
                                "\nAhora tienes: " + (saldo + depositarDinero));
                    } else {
                        System.out.println("No tienes el dinero suficiente");
                    }
                    break;
                case 3:
                    System.out.println("Tu balace es de: " + saldo);
                    System.out.println("Ingresa la cantidad a retirar: ");
                    retirarDinero = scanner.nextInt();
                    if (retirarDinero <= saldo) {
                        System.out.println("Procesando tu deposito...");
                        System.out.println("Has retirado: " + retirarDinero + " con exito" +
                                "\nAhora tienes: " + (saldo - retirarDinero));
                    } else {
                        System.out.println("No tienes el dinero suficiente");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no valida, intente de nuevo");
            }
        }
        scanner.close();
    }
}