package Arrays;

public class SubArrays {
    public static void main(String[] args){
        int[] elements = {2,4,6,8,10,12};

        for(int i=0;i<elements.length;i++){
            for(int j=i;j<elements.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(elements[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

