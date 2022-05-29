public class Recursividad2 {

    void recorrer(int[] a, int j) {

        if (j > -1) {
            System.out.println(a[j]);
            recorrer(a, j - 1);

        }
    }
}
