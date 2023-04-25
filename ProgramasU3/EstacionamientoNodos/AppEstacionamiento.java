import java.util.InputMismatchException;
import java.util.Scanner;

public class AppEstacionamiento {
    public static void main(String[] args) {
        int opcion = 0;
        boolean continuar = false;
        Scanner sc = new Scanner(System.in);
        Estacionamiento estacionamiento = new Estacionamiento();
        do {
            try {
                do {
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 1. Ingresar automovil - Push ------------");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 2. Sacar automovil - Pop ----------------");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 3. Ver el ultimo automovil - Peek -------");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 4. Verificar si esta vacio - isEmpty ----");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 5. Verificar si esta lleno - isFull -----");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 6. Ver el numero de automoviles - size---");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 7. Ver todos los automoviles - toString--");
                    System.out.println("---------------------------------------------");
                    System.out.println("--- 8. Salir --------------------------------");
                    System.out.println("---------------------------------------------");
                    System.out.print("Opcion: ");
                    opcion = sc.nextInt();
                    try {
                        switch (opcion) {
                            case 1:
                                boolean c1continuar = true;
                                do {
                                    try {
                                        // Push
                                        System.out.println("Ingresar automovil");
                                        System.out.print("Placa: ");
                                        String placa = sc.next();
                                        System.out.print("Marca: ");
                                        String marca = sc.next();
                                        System.out.print("Modelo: ");
                                        String modelo = sc.next();
                                        System.out.print("Color: ");
                                        String color = sc.next();
                                        Automovil automovil = new Automovil(placa, marca, modelo, color);
                                        estacionamiento.push(automovil);
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c1continuar = false;
                                    }
                                } while (!c1continuar);
                                break;
                            case 2:
                                boolean c2continuar = true;
                                do {
                                    try {
                                        // Pop
                                        System.out.println("Sacar automovil");
                                        Automovil automovilSacado = estacionamiento.pop();
                                        if (automovilSacado != null) {
                                            System.out.println("Automovil sacado: " + automovilSacado);
                                        } else {
                                            System.out.println("No hay automoviles en el estacionamiento");
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c2continuar = false;
                                    }
                                } while (!c2continuar);
                                break;
                            case 3:
                                boolean c3continuar = true;
                                do {
                                    try {
                                        // Peek
                                        System.out.println("Ver el ultimo automovil");
                                        Automovil automovilUltimo = estacionamiento.peek();
                                        if (automovilUltimo != null) {
                                            System.out.println("Ultimo automovil: " + automovilUltimo);
                                        } else {
                                            System.out.println("No hay automoviles en el estacionamiento");
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c3continuar = false;
                                    }
                                } while (!c3continuar);
                                break;
                            case 4:
                                boolean c4continuar = true;
                                do {
                                    try {
                                        // isEmpty
                                        System.out.println("Verificar si esta vacio");
                                        if (estacionamiento.isEmpty()) {
                                            System.out.println("El estacionamiento esta vacio");
                                        } else {
                                            System.out.println("El estacionamiento no esta vacio");
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c4continuar = false;
                                    }
                                } while (!c4continuar);
                                break;
                            case 5:
                                boolean c5continuar = true;
                                do {
                                    try {
                                        // isFull
                                        System.out.println("Verificar si esta lleno");
                                        if (estacionamiento.isFull()) {
                                            System.out.println("El estacionamiento esta lleno");
                                        } else {
                                            System.out.println("El estacionamiento no esta lleno");
                                        }
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c5continuar = false;
                                    }
                                } while (!c5continuar);
                                break;
                            case 6:
                                boolean c6continuar = true;
                                do {
                                    try {
                                        // size
                                        System.out.println("Ver el numero de automoviles");
                                        System.out.println("Numero de automoviles: " + estacionamiento.size());
                                        break;
                                    } catch (InputMismatchException e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c6continuar = false;
                                    }
                                } while (!c6continuar);
                                break;
                            case 7:
                                boolean c7continuar = true;
                                do {
                                    try {
                                        // toString
                                        System.out.println("Ver todos los automoviles");
                                        System.out.println(estacionamiento.toString());
                                        break;
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                        System.err.println("Error: " + e.getMessage());
                                        sc.nextLine();
                                        c7continuar = false;
                                    }
                                } while (!c7continuar);
                                break;
                            case 8:
                                System.out.println("Salir");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        continuar = true;
                    } catch (InputMismatchException e) {
                        System.err.println(e.getMessage());
                        System.out.println("\nPresione enter para continuar:");
                        sc.nextLine();
                    }
                } while (opcion != 8);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Error: " + e.getMessage());
                sc.nextLine();
                continuar = false;
            }
        } while (!continuar);
    }
}