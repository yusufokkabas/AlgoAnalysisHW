import java.io.IOException;
import java.util.Random;

public class SortingClass {
    static HeapSort hs = new HeapSort();
    static Introsort is = new Introsort();
    static ShellSort ss = new ShellSort();
    static int[] arrayToSort1 = new int[1000];
    static int[] arrayToSort10 = new int[10000];
    static int[] arrayToSort100 = new int[100000];
    public static void main(String args[]) throws IOException {
       /* //equal integers
        Random rn = new Random();
        int number =rn.nextInt();
        for(int i=0;i>arrayToSort1.length;i++){
            arrayToSort1[i]= number;
        }
        for(int i=0;i>arrayToSort10.length;i++){
            arrayToSort10[i]= number;
        }
        for(int i=0;i>arrayToSort100.length;i++) {
            arrayToSort100[i] = number;
        }
        int[] temp;
        temp = arrayToSort100;
        long startTimehs = System.nanoTime();
        hs.sort(temp);
        long estimatedTimehs = System. nanoTime() - startTimehs;
        System.out.println("Estimated time for heapSort(Equal Integers):   "+ estimatedTimehs);
        temp = arrayToSort100;
        long startTimess = System. nanoTime();
        ss.sort(temp);
        long estimatedTimess = System. nanoTime() - startTimess;
        System.out.println("Estimated time for shellSort(Equal Integers):  "+ estimatedTimess);
        temp = arrayToSort100;
        long estimatedTimeis = is.ISort(temp);
        System.out.println("Estimated time for introSort(Equal Integers):  "+ estimatedTimeis);*/
        //random integers
     /*   Random rn = new Random();

        for(int i=0;i<arrayToSort1.length;i++){
            int number =rn.nextInt();
            arrayToSort1[i]= number;
        }
        for(int i=0;i<arrayToSort10.length;i++){
            int number =rn.nextInt();
            arrayToSort10[i]= number;
        }
        for(int i=0;i<arrayToSort100.length;i++) {
            int number =rn.nextInt();
            arrayToSort100[i] = number;
        }
        int[] temp;
        temp = arrayToSort100;
        long startTimehs = System.nanoTime();
        hs.sort(temp);
        long estimatedTimehs = System. nanoTime() - startTimehs;
        System.out.println("Estimated time for heapSort(Random Integers):   "+ estimatedTimehs);
        temp = arrayToSort100;
        long startTimess = System. nanoTime();
        ss.sort(temp);
        long estimatedTimess = System. nanoTime() - startTimess;
        System.out.println("Estimated time for shellSort(Random Integers):  "+ estimatedTimess);
        temp = arrayToSort100;
        long estimatedTimeis = is.ISort(temp);
        System.out.println("Estimated time for introSort(Random Integers):  "+ estimatedTimeis);*/


       //increasing integers
/*
        for(int i=0;i<arrayToSort1.length;i++){
            arrayToSort1[i]= i;
        }
        for(int i=0;i<arrayToSort10.length;i++){
            arrayToSort10[i]= i;
        }
        for(int i=0;i<arrayToSort100.length;i++) {
            arrayToSort100[i] = i;
        }
        int[] temp;
        temp = arrayToSort100;
        long startTimehs = System.nanoTime();
        hs.sort(temp);
        long estimatedTimehs = System. nanoTime() - startTimehs;
        System.out.println("Estimated time for heapSort(Increasing Integers):   "+ estimatedTimehs);
        temp = arrayToSort100;
        long startTimess = System. nanoTime();
        ss.sort(temp);
        long estimatedTimess = System. nanoTime() - startTimess;
        System.out.println("Estimated time for shellSort(Increasing Integers):  "+ estimatedTimess);
        temp = arrayToSort100;
        long estimatedTimeis = is.ISort(temp);
        System.out.println("Estimated time for introSort(Increasing Integers):  "+ estimatedTimeis);*/
        //decreasing Integers
        for(int i=arrayToSort1.length-1;i>=0;i--){
            arrayToSort1[i]= i;
        }
        for(int i=arrayToSort10.length-1;i>=0;i--){
            arrayToSort10[i]= i;
        }
        for(int i=arrayToSort100.length-1;i>=0;i--){
            arrayToSort100[i]= i;
        }
        int[] temp;
        temp = arrayToSort100;
        long startTimehs = System.nanoTime();
        hs.sort(temp);
        long estimatedTimehs = System. nanoTime() - startTimehs;
        System.out.println("Estimated time for heapSort(Decreasing Integers):   "+ estimatedTimehs);
        temp = arrayToSort100;
        long startTimess = System. nanoTime();
        ss.sort(temp);
        long estimatedTimess = System. nanoTime() - startTimess;
        System.out.println("Estimated time for shellSort(Decreasing Integers):  "+ estimatedTimess);
        temp = arrayToSort100;
        long estimatedTimeis = is.ISort(temp);
        System.out.println("Estimated time for introSort(Decreasing Integers):  "+ estimatedTimeis);
    }
    }


