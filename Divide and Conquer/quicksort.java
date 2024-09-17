public class quicksort {
    public static void sort(int arr[], int ei, int si) {
        if (si <= ei) {
            return;
        }
        // last element
        int pIndx = partition(arr, si, ei);
        sort(arr, si, pIndx -  1);// left
        sort(arr, pIndx + 1, ei);// right
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for els smaller than pivot
                for(int j=si;j<ei;j++){
                    if(arr[j]<=pivot){
                        i++;
                        //swap
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
       }
       i++;
    int temp = pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
}

             public static void main(String[] args){
                int arr[]={6,3,9,8,2,5};
                sort(arr, 0,arr.length-1);
                System.out.println(arr);
             }
}
