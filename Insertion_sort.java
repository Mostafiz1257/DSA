/**
 * Insertion_sort
 */
public class Insertion_sort {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 3, 5, 2, 1 };
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
              arr[j + 1]=  arr[j]  ;
                j--;
            }
            arr[j + 1] = temp;
        }
        printArray(arr);
    
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}