public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "BinaryRecursiveSearch";
    }

    @Override
    public int search(int[] arr, int target) {
        int begin = 0;
        int end = arr.length;
        int mid = (begin + end)/2;
        if(arr[mid]==target){
            return arr[mid];
        }
        else if (arr[mid]<target){
            begin = mid +1;
            return search(arr,target,begin,end);

        }
        else if(arr[mid]>target){
            end = mid -1;
            return search(arr,target,begin,end);
        }

        return -1;
    }
    public int search(int[]arr, int target, int begin, int end){
        int key = (begin + end)/2;
        if(arr[key]==target){
            return arr[key];
        }
        else if(arr[key] < target){
            begin = key+1;
        }
        else if (arr[key]>target){
            end = key-1;
        }
        return -1;
    }
}
