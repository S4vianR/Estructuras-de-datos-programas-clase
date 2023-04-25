package fila;

// Reuben Rhienhart 20112048
// Import JOptionPane
import javax.swing.JOptionPane;

public class AppFila {
    public static void main(String[] args) {
        boolean continuar = false;
        do {
            try {
                // TODO: try parsing the input
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Fila tipo Integer\n2. Fila tipo String\n3. Fila tipo Double\n4. Character\n5. Salir"));
                switch (opcion) {
                    case 1:
                        menuInt();
                        break;
                    case 2:
                        menuString();
                        break;
                    case 3:
                        menuDouble();
                        break;
                    case 4:
                        menuCharacter();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        break;
                }
                continuar = true;
            } catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, "Solo se aceptan numeros", "Error", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        } while (!continuar);

    }

    // Menu de Integer
    public static void menuInt() {
        int opcion = 0;
        int max = 0;
        Integer dato = 0;
        boolean continuar = false;
        do {
            try {
                max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la fila",
                        "Tamaño de la fila", JOptionPane.QUESTION_MESSAGE));
                continuar = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        } while (!continuar);
        Fila fila = new Fila(max);
        do {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento en la fila\n2. Eliminar un elemento de la fila\n3. Mostrar el elemento del frente de la fila\n4. Mostrar todos los elementos de la fila\n5. Salir",
                            "Menu de opciones", JOptionPane.QUESTION_MESSAGE));
                    switch (opcion) {
                        case 1:
                            dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar",
                                    "Insertar elemento", JOptionPane.QUESTION_MESSAGE));
                            fila.insert(dato);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + fila.remove(),
                                    "Eliminar elemento", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "El elemento del frente de la fila es: " + fila.peek(),
                                    "Mostrar elemento del frente", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, fila.toString(), "Mostrar elementos de la fila",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    continuar = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    continuar = false;
                }
            } while (opcion != 5);
        } while (!continuar);
    }

    // Menu de String
    public static void menuString() {
        int opcion = 0;
        int max = 0;
        String dato = "";
        boolean continuar = false;
        do {
            try {
                max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la fila",
                        "Tamaño de la fila", JOptionPane.QUESTION_MESSAGE));
                continuar = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        } while (!continuar);
        Fila fila = new Fila(max);
        do {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento en la fila\n2. Eliminar un elemento de la fila\n3. Mostrar el elemento del frente de la fila\n4. Mostrar todos los elementos de la fila\n5. Salir",
                            "Menu de opciones", JOptionPane.QUESTION_MESSAGE));
                    switch (opcion) {
                        case 1:
                            dato = JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar",
                                    "Insertar elemento", JOptionPane.QUESTION_MESSAGE);
                            fila.insert(dato);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + fila.remove(),
                                    "Eliminar elemento", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "El elemento del frente de la fila es: " + fila.peek(),
                                    "Mostrar elemento del frente", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, fila.toString(), "Mostrar elementos de la fila",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    continuar = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    continuar = false;
                }
            } while (opcion != 5);
        } while (!continuar);
    }

    // Menu de Double
    private static void menuDouble() {
        int opcion = 0;
        int max = 0;
        Double dato = 0.0;
        boolean continuar = false;
        do {
            try {
                max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la fila",
                        "Tamaño de la fila", JOptionPane.QUESTION_MESSAGE));
                continuar = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        } while (!continuar);
        Fila fila = new Fila(max);
        do {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento en la fila\n2. Eliminar un elemento de la fila\n3. Mostrar el elemento del frente de la fila\n4. Mostrar todos los elementos de la fila\n5. Salir",
                            "Menu de opciones", JOptionPane.QUESTION_MESSAGE));
                    switch (opcion) {
                        case 1:
                            dato = Double
                                    .parseDouble(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar",
                                            "Insertar elemento", JOptionPane.QUESTION_MESSAGE));
                            fila.insert(dato);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + fila.remove(),
                                    "Eliminar elemento", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "El elemento del frente de la fila es: " + fila.peek(),
                                    "Mostrar elemento del frente", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, fila.toString(), "Mostrar elementos de la fila",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    continuar = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    continuar = false;
                }
            } while (opcion != 5);
        } while (!continuar);
    }

    // Menu de Character
    private static void menuCharacter() {
        int opcion = 0;
        int max = 0;
        Character dato = ' ';
        boolean continuar = false;
        do {
            try {
                max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la fila",
                        "Tamaño de la fila", JOptionPane.QUESTION_MESSAGE));
                continuar = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        } while (!continuar);
        Fila fila = new Fila(max);
        do {
            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento en la fila\n2. Eliminar un elemento de la fila\n3. Mostrar el elemento del frente de la fila\n4. Mostrar todos los elementos de la fila\n5. Salir",
                            "Menu de opciones", JOptionPane.QUESTION_MESSAGE));
                    switch (opcion) {
                        case 1:
                            dato = JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar",
                                    "Insertar elemento", JOptionPane.QUESTION_MESSAGE).charAt(0);
                            fila.insert(dato);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + fila.remove(),
                                    "Eliminar elemento", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "El elemento del frente de la fila es: " + fila.peek(),
                                    "Mostrar elemento del frente", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, fila.toString(), "Mostrar elementos de la fila",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    continuar = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    continuar = false;
                }
            } while (opcion != 5);
        } while (!continuar);
    }
}