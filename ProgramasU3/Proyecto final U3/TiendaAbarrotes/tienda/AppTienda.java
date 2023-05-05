package tienda;

// Import of JOptionPane
import javax.swing.JOptionPane;

// Import of linked list
import java.util.LinkedList;

public class AppTienda {
    public static void main(String[] args) {
        // Linked list
        LinkedList<Tienda> lista = new LinkedList<Tienda>();

        // Variables
        int opcion = 0;
        int numParte = 0;
        double precioUnitario = 0;
        String descripcion = "";
        int cantidadInventario = 0;
        int cantidadComprar = 0;
        int cantidadSurtir = 0;
        boolean encontrado = false;

        // Menu
        do {
            String menu = "Menú\n" +
                    "1. Registrar producto\n" +
                    "2. Mostrar lista de productos\n" +
                    "3. Comprar producto\n" +
                    "4. Surtir producto\n" +
                    "5. Salir\n" +
                    "Opción: ";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    // Register product
                    numParte = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Número de parte: ",
                            "Registrar producto",
                            JOptionPane.QUESTION_MESSAGE));
                    precioUnitario = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Precio unitario: ",
                            "Registrar producto",
                            JOptionPane.QUESTION_MESSAGE));
                    descripcion = JOptionPane.showInputDialog(null,
                            "Descripción: ",
                            "Registrar producto",
                            JOptionPane.QUESTION_MESSAGE);
                    cantidadInventario = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Cantidad en inventario: ",
                            "Registrar producto",
                            JOptionPane.QUESTION_MESSAGE));

                    // Create object
                    Tienda tienda = new Tienda(numParte, precioUnitario, descripcion, cantidadInventario);

                    // Insert object
                    if (lista.isEmpty()) {
                        lista.add(tienda);
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getNumParte() == numParte) {
                                JOptionPane.showMessageDialog(null,
                                        "El número de parte ya existe",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            lista.add(tienda);
                        }
                    }
                    break;
                case 2:
                    // Show list
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "No hay productos registrados",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        String listaProductos = "";
                        for (int i = 0; i < lista.size(); i++) {
                            listaProductos += lista.get(i).toString();
                        }
                        JOptionPane.showMessageDialog(null,
                                listaProductos,
                                "Lista de productos",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    // Buy product
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "No hay productos registrados",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        numParte = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Número de parte: ",
                                "Comprar producto",
                                JOptionPane.QUESTION_MESSAGE));
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getNumParte() == numParte) {
                                cantidadComprar = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Cantidad a comprar: ",
                                        "Comprar producto",
                                        JOptionPane.QUESTION_MESSAGE));
                                if (lista.get(i).getCantidadInventario() >= cantidadComprar) {
                                    lista.get(i).setCantidadInventario(
                                            lista.get(i).getCantidadInventario() - cantidadComprar);
                                    JOptionPane.showMessageDialog(null,
                                            "Compra realizada con éxito",
                                            "Comprar producto",
                                            JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "No hay suficiente producto en inventario",
                                            "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                }
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null,
                                    "El número de parte no existe",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 4:
                    // Supply product
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "No hay productos registrados",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        numParte = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Número de parte: ",
                                "Surtir producto",
                                JOptionPane.QUESTION_MESSAGE));
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getNumParte() == numParte) {
                                cantidadSurtir = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Cantidad a surtir: ",
                                        "Surtir producto",
                                        JOptionPane.QUESTION_MESSAGE));
                                lista.get(i)
                                        .setCantidadInventario(lista.get(i).getCantidadInventario() + cantidadSurtir);
                                JOptionPane.showMessageDialog(null,
                                        "Surtido realizado con éxito",
                                        "Surtir producto",
                                        JOptionPane.INFORMATION_MESSAGE);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null,
                                    "El número de parte no existe",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 5:
                    // Exit
                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar el programa",
                            "Salir",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    // Default
                    JOptionPane.showMessageDialog(null,
                            "Opción inválida",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;

            }
        } while (opcion != 5);
    }
}