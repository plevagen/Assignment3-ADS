import java.util.Random;

public class Sorter {
    public void basicSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public void advancedSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public int[] generateRandomArray(int size){
        int[] arr = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    public int[] copyArray(int[] original){
        int[] copy = new int[original.length];
        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }
        return copy;
    }
}
