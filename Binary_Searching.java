public class Binary_seaching {
    public static void main(String[] args) {
        int arr[]=new int []{1,2,3,4,5,6,7,8,9,10,11};
        int element=6;
        int size= arr.length;
        SEARCH obj=new SEARCH();
      obj.search(element,size,arr);

    }
}
class SEARCH{
    public void search(int element,int size,int arr1[]){
        int low=0;
        int high=size;
        while(low<=high){
        int mid=(low+high)/2;
        if(arr1[mid]==element){
            System.out.println("the index is "+mid);
        }
        if(arr1[mid]<element)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        }
    }
}
