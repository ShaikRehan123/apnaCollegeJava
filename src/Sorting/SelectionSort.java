package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] elements = {1,3,5,6 ,4,2};
        for (int i =0;i<elements.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<elements.length;j++){
                if(elements[minPos] > elements[j]){
                    minPos = j;
                }
            }

            int temp = elements[minPos];
            elements[minPos] = elements[i];
            elements[i] = temp;
        }
    }
}
