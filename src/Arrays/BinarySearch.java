package Arrays;

public class BinarySearch {

    public static int binarySearch(int[] elements,int target){
        int start=0,end=elements.length - 1;

        while (start<=end){
            int mid = (start + end) / 2;

            int mid_value = elements[mid];

            if(mid_value == target){
                return mid;
            } else if (mid_value < target) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return -1;
    }


    public static void main (String[] args){
        int[] elements = {5,7,9,47,87,589,987,12345,49213};
        System.out.println(binarySearch(elements , 589));
    }


}
