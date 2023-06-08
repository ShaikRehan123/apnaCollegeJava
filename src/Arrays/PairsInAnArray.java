package Arrays;

public class PairsInAnArray {
    public static void main(String[] args){
        int[] elements = {2,4,6,8,10,12};
        int pairingNumberIndex  = 0;

        for(int i = pairingNumberIndex;i<elements.length;i++){
            int pairStartingIndex = pairingNumberIndex + 1;

            for (int j = pairStartingIndex;j<elements.length;j++){
                int pairingNumber = elements[pairingNumberIndex];
                int partnerPairNumber = elements[j];

                System.out.print("(" + pairingNumber + ", " + partnerPairNumber + ") "  );
            }

            System.out.println();

            pairingNumberIndex++;
        }
    }
}

