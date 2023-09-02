public class Swap{
    static void printArray(int arr[], int n){
        System.out.print("Elements of the array after swapping: ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static void rearrangeArray(int arr[], int n){
        int key, j;
        for(int i = 1; i < n; i++){
            key = arr[i];
            if (key > 0)
                continue;
            j = i - 1;
            while(j >= 0 && arr[j] > 0){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args){
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int n = arr.length;
        rearrangeArray(arr, n);
        printArray(arr, n);
    }
}