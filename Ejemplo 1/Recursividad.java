public class Recursividad {
    
    void recorrer (int [] a, int j){

        if (j > -1){
            recorrer (a, j-1);
        }
        System.out.println (a[j+1]);
    }
}