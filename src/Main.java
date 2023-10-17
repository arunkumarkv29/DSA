import javax.swing.undo.AbstractUndoableEdit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.*;

public class Main {
    public static void Merge(int[] A , int s , int mid, int e){
        int N = mid-s+1 ;
        int M = e-mid ;
        int[] first = new int[N] ;
        int[] second = new int[M] ;
        int i=0 ;
        int j=0 ;
        int k=s ;
        while(i<N){
            first[i] = A[k] ;
            i++ ;
            k++ ;
        }
        k=mid+1 ;
        while(j<M){
            second[j] = A[k] ;
            j++ ;
            k++ ;
        }
        i=0 ;j=0 ; k=s ;
        while(i<N && j<M){
            if(first[i]<second[j]){
                A[k] = first[i] ;
                i++ ;
                k++ ;
            }
            else{
                A[k] = second[j] ;
                j++ ;
                k++ ;
            }
        }
        while(i<N){
            A[k] = first[i] ;
            i++ ;
            k++ ;
        }
        while(j<M){
            A[k] = second[j] ;
            j++ ;
            k++ ;
        }
    }
    public static void Divide(int[] A, int s , int e){
        if(s>=e){
            return ;
        }

        int mid = (s+e)/2 ;

        Divide(A,s,mid);
        Divide(A,mid+1,e);
        Merge(A,s,mid,e) ;
    }
    public static void main(String[] args) {
        int[] A = {38,27,43,3,9,82,10} ;
        int N = A.length ;
        Divide(A,0,N-1);
        for(int i=0 ; i<N;  i++){
            System.out.print(A[i]+" ");
        }
    }
}