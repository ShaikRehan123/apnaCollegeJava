public class Main {
    public static int getLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main (String[] args){
        int numbers[] = {28 , 19, 90, 100, 2113};
        System.out.println(getLargest(numbers ));
     }
}
