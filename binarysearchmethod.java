public class binarysearchmethod {
    public static int binarySearch(int[] list, int key) { int index = -1;
        int low = 0, high = list.length-1;
        int mid;
        while(high >= low){
        mid = (low+high)/2;
        if(list[mid] > key){
        high = mid -1;
        }else if (list[mid] < key){
        low = mid+1; }else{
        index = mid; break;
        }
        }
        return index;
    }
}
