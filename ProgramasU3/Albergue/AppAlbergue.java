/*
 * - Se requiere realizar un programa para un albergue de mascotas que acepta perros y gatos.
 * Existen varias reglas en el albergue
 * 
 * - El primer animalito que llegue es el primer animalito que se da en adopción.
 * 
 * - Si la persona que va a adoptar le toca adoptar un perro y no tiene espacio en su casa para el perro
 * le podemos dar el siguiente gato disponible.
 * 
 * - Si la persona que va a adoptar le toca adoptar un gato y es alérgica a los gatos le podemos dar el
 * siguiente perro disponible.
 * 
 * - Todos los animalitos deben de guardarse ya sea en la fila de Perros o fila de Gatos (2 Queue)
 * 
 * - Se le debe dar una numeración consecutiva de manera automática para que no se repita el lugar
 * de ingreso en la lista
 * 
 * Ambas clases heredan de Mascota, ya que es necesario guardar la numeración consecutiva de
 * cada mascota (perro o gato ) que entra al albergue, es decir en el constructor de Mascota se debe
 * incrementar el dato estático y asignar a posición, las clases Perro y Gato solo tienen el constructor   
 * que manda llamar al constructor de la clase padre.
 */

// Import for java option pane
import javax.swing.JOptionPane;
// Import for Stack
import java.util.Stack;

public class AppAlbergue {
    public static void main(String[] args) {
        // Creamos los perros
        Perro perro1 = new Perro("Firulais", 2, "Pastor Aleman");
        Perro perro2 = new Perro("Rex", 3, "Chihuahua");

        // Creamos los gatos
        Gato gato1 = new Gato("Garfield", 1, "Siames");
        Gato gato2 = new Gato("Tom", 2, "Persa");

        // Pila de mascotas en adopcion
        Stack<Mascota> mascotas = new Stack<>();

        // Agregamos los perros a la pila de mascotas
        mascotas.push(perro1);
        mascotas.push(perro2);

        // Agregamos los gatos a la pila de mascotas
        mascotas.push(gato1);
        mascotas.push(gato2);

        boolean salir = false;
        do {
            // Atributos de la persona que va a adoptar
            String nombre = null;
            int edad = 0;

            // Pedimos los datos de la persona que va a adoptar con trycatch
            try {
                nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
                return;
            }

            // Mensaje de bienvenida
            JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + " al albergue de mascotas");

            // Menu
            int opcion;
            String[] opciones = { "Dar en adopción", "Adoptar", "Mostrar el siguiente en adopción",
                    "Mostrar todas las mascotas en adopción", "Salir" };
            do {
                // Menu de opciones con botones
                opcion = JOptionPane.showOptionDialog(null, "Elige una opción", "Menu", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                // Switch para las opciones
                switch (opcion) {
                    case 0:
                        // Dar en adopcion a una mascota, agregar a la pila de mascotas en adopcion y
                        // preguntar si es perro o gato
                        String[] opcionesMascota = { "Perro", "Gato" };
                        int opcionMascota = JOptionPane.showOptionDialog(null, "Elige una opción", "Menu",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMascota,
                                opcionesMascota[0]);

                        // Switch para las opciones
                        switch (opcionMascota) {
                            case 0:
                                // Dar en adopcion un perro
                                try {
                                    // Pedimos los datos del perro con trycatch
                                    String nombrePerro = JOptionPane.showInputDialog("Ingresa el nombre del perro");
                                    int edadPerro = Integer
                                            .parseInt(JOptionPane.showInputDialog("Ingresa la edad del perro"));
                                    String razaPerro = JOptionPane.showInputDialog("Ingresa la raza del perro");
                                    // Creamos el perro
                                    Perro perro = new Perro(nombrePerro, edadPerro, razaPerro);

                                    // Agregamos el perro a la pila de mascotas
                                    mascotas.push(perro);

                                } catch (Exception e) {
                                    // TODO: handle exception
                                    JOptionPane.showMessageDialog(null, "Error al ingresar los datos", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                            case 1:
                                // Dar en adopcion un gato
                                try {
                                    // Pedimos los datos del gato con trycatch
                                    String nombreGato = JOptionPane.showInputDialog("Ingresa el nombre del gato");
                                    int edadGato = Integer
                                            .parseInt(JOptionPane.showInputDialog("Ingresa la edad del gato"));
                                    String razaGato = JOptionPane.showInputDialog("Ingresa la raza del gato");
                                    // Creamos el gato
                                    Gato gato = new Gato(nombreGato, edadGato, razaGato);

                                    // Agregamos el gato a la pila de mascotas
                                    mascotas.push(gato);

                                } catch (Exception e) {
                                    // TODO: handle exception
                                    JOptionPane.showMessageDialog(null, "Error al ingresar los datos", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                                }
                                break;
                        }
                        break;
                    case 1:
                        // Pedir si es alergico a los gatos con JOptionPane con botones
                        String[] opcionesAlergia = { "Si", "No" };
                        int opcionAlergia = JOptionPane.showOptionDialog(null, "¿Eres alergico a los gatos?",
                                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                opcionesAlergia, opcionesAlergia[0]);

                        // Pedir si tiene espacio para un perro con JOptionPane con botones
                        String[] opcionesEspacio = { "Si", "No" };
                        int opcionEspacio = JOptionPane.showOptionDialog(null, "¿Tienes espacio para un perro?",
                                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                opcionesEspacio, opcionesEspacio[0]);
                        // Adoptar a una mascota dependiendo si es alergica o no a los gatos y mostrar a
                        // que animal adopto y si es perro o gato.
                        if (opcionAlergia == 0) {
                            // Si es alergica a los gatos
                            if (opcionEspacio == 1) {
                                // Si tiene espacio en casa
                                if (mascotas.peek() instanceof Perro) {
                                    // Si el siguiente en adopcion es un perro
                                    JOptionPane.showMessageDialog(null,
                                            "Adoptaste a " + mascotas.peek().getNombre() + " un perro");
                                    mascotas.pop();
                                } else if (mascotas.peek() instanceof Gato) {
                                    // Si el siguiente en adopcion es un gato
                                    JOptionPane.showMessageDialog(null,
                                            "No puedes adoptar a " + mascotas.peek().getNombre()
                                                    + " un gato porque eres alergico a los gatos tendras que esperar a que se adopte un perro");
                                }
                            } else {
                                // Si no tiene espacio en casa
                                if (mascotas.peek() instanceof Perro) {
                                    // Si el siguiente en adopcion es un perro
                                    JOptionPane.showMessageDialog(null,
                                            "No puedes adoptar a " + mascotas.peek().getNombre()
                                                    + " un perro porque no tienes espacio en casa tendras que esperar a que se adopte un gato");
                                } else if (mascotas.peek() instanceof Gato) {
                                    // Si el siguiente en adopcion es un gato
                                    JOptionPane.showMessageDialog(null, "No puedes adoptar a "
                                            + mascotas.peek().getNombre()
                                            + " un gato porque eres alergico a los gatos y no tienes espacio en casa, una disculpa no puedes adoptar a ninguno de las mascotas");
                                }
                            }
                        } else {
                            // Si no es alergica a los gatos
                            if (opcionEspacio == 0) {
                                // Si tiene espacio en casa
                                if (mascotas.peek() instanceof Perro) {
                                    // Si el siguiente en adopcion es un perro
                                    JOptionPane.showMessageDialog(null,
                                            "Adoptaste a " + mascotas.peek().getNombre() + " un perro");
                                    mascotas.pop();
                                } else if (mascotas.peek() instanceof Gato) {
                                    // Si el siguiente en adopcion es un gato
                                    JOptionPane.showMessageDialog(null,
                                            "Adoptaste a " + mascotas.peek().getNombre() + " un gato");
                                    mascotas.pop();
                                }
                            } else if (opcionEspacio == 1) {
                                // Si no tiene espacio en casa
                                if (mascotas.peek() instanceof Perro) {
                                    // Si el siguiente en adopcion es un perro
                                    JOptionPane.showMessageDialog(null,
                                            "No puedes adoptar a " + mascotas.peek().getNombre()
                                                    + " un perro porque no tienes espacio en casa");
                                }
                            }
                        }
                        break;
                    case 2:
                        // Mostrar el siguiente en adopcion
                        JOptionPane.showMessageDialog(null, mascotas.peek());
                        break;
                    case 3:
                        // Mostrar todas las mascotas en adopcion
                        JOptionPane.showMessageDialog(null, mascotas);
                        break;
                    case 4:
                        // Salir
                        JOptionPane.showMessageDialog(null, "Gracias por visitar el albergue de mascotas", "Gracias",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } while (opcion != 4);
            String[] opcionesRegistro = { "Si", "No" };
            int opcionRegistro = JOptionPane.showOptionDialog(null, "¿Desea registrarse?",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesRegistro,
                    opcionesRegistro[0]);
            if (opcionRegistro == 0) {
                // Si desea registrarse
                salir = false;
            } else {
                // Si no desea registrarse
                salir = true;
            }
        } while (!salir);
    }
}