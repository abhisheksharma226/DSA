public class find {
    static void searchArr(int arr[]){
        int find = 3;
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == find){
                ans = arr[i];
                break;
            }
        }
        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println(find + " found at index " + ans) ;
        }
    }
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 2, 3, 5};
       
        searchArr(arr);
        
    }
}
