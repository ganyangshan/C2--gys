package Task4;

public class Findnum {

    private static void quicksort(int[]arr,int start,int end){//快排
        int pa=an(arr,start,end);//an返回最小的值对应在数组中的位数
        if(pa>start+1){
            quicksort(arr,start,pa-1);
        }
        if(pa<end-1){
            quicksort(arr,pa+1,end);
        }
    }
    public static void sort(int[]arr){
        int n=arr.length;
        quicksort(arr,0,n-1);
    }
    private static int an(int[]arr,int low,int high){
        int tmp=arr[low];
        while (low<high){
            while ((low<high)&&arr[high]>=tmp){
                high--;
            }
            if(low>=high){
                break;
            }else {
                arr[low]=arr[high];
            }
            while ((low<high)&&arr[low]<=tmp){
                low++;
            }
            if(low>=high){
                break;
            }else {
                arr[high]=arr[low];
            }
        }
        arr[low]=tmp;
        return low;
    }
    public static int find(int arr[],int len,int k){
        Findnum.sort(arr);
        int i=arr[len-k];
        return i;
    }


}
