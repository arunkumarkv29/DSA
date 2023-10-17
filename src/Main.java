import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int [] A = {5,8,1,15,7,6,2} ;
        int N = A.length ;

        for(int i=0 ; i<N ; i++){
            for(int j=1; j<N-i ; j++){
                if(A[j-1]>A[j]){
                    int temp = A[j-1] ;
                    A[j-1] = A[j] ;
                    A[j] = temp ;
                }
            }
        }

        for(int i=0 ; i<N; i++){
            System.out.print(A[i] + " ");
        }
    }
}