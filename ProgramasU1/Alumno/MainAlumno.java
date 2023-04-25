public class MainAlumno {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            int semestre = 1;
            Alumno A20112048 = new Alumno("Reuben Allen Rhienhart Perez", 20112048,semestre);
            System.out.println(A20112048);
            System.out.print("Stack: " + System.identityHashCode(semestre));
            System.out.println("\tHeap: " + System.identityHashCode(A20112048));
        }
    }
}
 