public class Sort {
    public static void main(String[] args){
        int[] arr = {15, 54, 5, 16, 52, 4, 6};
        printArray(arr);
        //insertSort(arr);
        //bubbleSort(arr);
        //mergeSort(arr,0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);

    }

    private static void insertSort(int[] arr){
        for(int i= 1; i< arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j +1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    private static void bubbleSort(int[] arr){
        for(int i = 0; i< arr.length -1; i++){
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] arr, int left, int right){
        if(left< right){
            int middle = (left + right)/2 ;
            mergeSort(arr, left, middle);
            mergeSort(arr,middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left,  int middle, int right){
        int lsize = middle - left +1;
        int rsize = right - middle;
        int leftArr[]= new int[lsize];
        int rightArr[] = new int[right];
        for(int i = 0; i<lsize; i++){
            leftArr[i] = arr[left +i];
        }
        for(int j = 0; j <rsize; j++){
            rightArr[j] = arr[middle + 1+j];
        }


        int i=0;
        int j=0;
        int k=left;

        while( i<  lsize && j< rsize){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < lsize){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rsize){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static void quickSort(int[] arr, int low , int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivotValue = arr[high];
        int i = low -1;
        for (int j=low; j< high; j++){
            if(arr[j] <= pivotValue){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }
}
