public class Arara {

    public static int hombre_soltero(Amante[] h) {
        for (int i = 0; i < h.length; i++) {
            if (!h[i].getEstatus()) {
                int sa = i;
                return sa;
            }
        }
        return 1;
    }

    public static int mujer_prefiere(Amante[] h, Amante[] m, int libre, int pos) {
        String[] areglo = h[libre].getPreferencias();
        for (int j = 0; j < m.length; j++) {
            if (m[j].getnombre().equals(areglo[pos])) {
                return j;
            }
        }
        return 1;
    }

    public static void union(Amante[] h, Amante[] m, int libre, int pos) {
        int index = mujer_prefiere(h, m, libre, pos);
        System.out.println("pretendiente " + h[libre].getnombre());
        System.out.println("mujer  " + m[index].getnombre());
        if (m[index].getPareja() == null) {
            System.out.println("no tiene novio");
            m[index].setPareja(h[libre].getnombre());
            h[libre].setEstatus(true);
        } else {
            int indexh = 0;
            int indexf = 0;
            String[] aregla = m[index].getPreferencias();
            System.out.println("rankin de " + m[index].getnombre());
            System.out.println(aregla[0]);
            System.out.println(aregla[1]);
            System.out.println(aregla[2]);
            System.out.println(aregla[3]);
            String actualCompañero = m[index].getPareja();
            System.out.println("novio actual  " + actualCompañero);
            for (int j = 0; j < aregla.length; j++) {
                System.out.println("entra al ciclo para desidir novio");
                if (aregla[j].equals(h[libre].getnombre())) {
                    indexf = j;
                    System.out.println("ranquin pretendiente" + " " + j);
                }
                if (aregla[j].equals(actualCompañero)) {
                    indexh = j;
                    System.out.println("ranquin novio actual " + " " + j);
                }
            }
            if (indexf < indexh) {
                m[index].setPareja(h[libre].getnombre());
                h[libre].setEstatus(true);
                h[indexh].setEstatus(false);
                System.out.println(h[libre].getnombre() + "  se robo a " + m[index].getnombre());
                System.out.println(h[indexh].getnombre() + " soltero");
            } else {
                System.out.println(h[libre].getnombre() + " no se robo a " + m[index].getnombre());
                int otra = pos + 1;
                union(h, m, libre, otra);
            }
        }
    }

    public static void emparejar(Amante[] h, Amante[] m) {
        int ContarCasado = 0;
        while (ContarCasado <= h.length) {
            int libre = hombre_soltero(h);
            union(h, m, libre, 0);
            System.out.println(m[0].toString());
            System.out.println(m[1].toString());
            System.out.println(m[2].toString());
            System.out.println(m[3].toString());
            System.out.println("---------------------------------------------------------------------");
            ContarCasado++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Algoritmo matrimonios estables\n");
        Amante[] hombres = new Amante[4];
        hombres[0] = new Amante("reina", "perla", "yasmin", "sara", false, "alonso");
        hombres[1] = new Amante("sara", "reina", "yasmin", "perla", false, "rafa");
        hombres[2] = new Amante("sara", "reina", "yasmin", "perla", false, "coria");
        hombres[3] = new Amante("perla", "reina", "sara", "yasmin", false, "sonic");
        Amante[] mujeres = new Amante[4];
        mujeres[0] = new Amante("coria", "rafa", "alonso", "sonic", false, "sara");
        mujeres[1] = new Amante("rafa", "coria", "alonso", "sonic", false, "perla");
        mujeres[2] = new Amante("sonic", "alonso", "rafa", "coria", false, "yasmin");
        mujeres[3] = new Amante("alonso", "sonic", "rafa", "coria", false, "reina");
        emparejar(hombres, mujeres);
    }
}