package Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] elements = {1,3,5,6 ,4,2};
        for (int i =1;i<elements.length;i++){
            int current = elements[i];
            int j = i-1;
            while (j>=0 && elements[j] > current){
                elements[j+1] = elements[j];
                j--;
            }
            elements[j+1] = current;
        }
    }
}
