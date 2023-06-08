package Arrays;

import org.jetbrains.annotations.NotNull;

public class ReverseAnArray {
    public static void main(String[] args){
        int[] elements = new int[10000000];

        for(int i=0;i<elements.length;i++){
            elements[i] = i;
        }

        long start = System.currentTimeMillis();



        reverseAnArray(elements);

        long end = System.currentTimeMillis();

        System.out.println(end - start + " ms");

    }

    public static void reverseAnArray(int @NotNull [] numbers){
        int first = 0,last=numbers.length-1;

        while (first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
}
