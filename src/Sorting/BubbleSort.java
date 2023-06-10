package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int elements[] = {1,4,6,3,2};


        printArray(elements);


        for (int turn=0;turn<elements.length;turn++){
            for (int j =0;j<elements.length - 1 - turn;j++){
                if (elements[j] > elements[j+1]){
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }

        printArray(elements);
    }

    public static void printArray(int[] arr){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
