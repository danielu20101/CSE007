public class swapcount {


    public static void main(String[] args) {

        int SComparison = 0;
         int SSwaps = 0;
         int totalSwap=0;
        int min = 0;
        int temp = 0;
        int SorBag[] = { 1, 4, 3 };

        for (int i = 0; i < SorBag.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < SorBag.length; j++) {
                SComparison++;

                if (SorBag[j] < SorBag[min]) {
                    min = j;
                    temp = SorBag[i];
                    SorBag[i] = SorBag[min];
                    SorBag[min] = temp;
                    SSwaps++;
                    totalSwap+=SSwaps;
                    System.out.println("swap count at "+j+" pass : "+SSwaps);
                }
            }
            SSwaps=0;


        }
        for (int i = 0; i < SorBag.length; i++) 
            System.out.print(SorBag[i]+" ");

        System.out.println("\nTotal swap count :"+totalSwap);
    }


}