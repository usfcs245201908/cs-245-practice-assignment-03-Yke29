public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "BinaryIterativeSearch";
    }

    @Override
    public int search(int[] arr, int target) {
        int begin;
        int end = arr.length;
        int mid;
        for(begin = 0; begin < end ; begin++, end --){
            mid =(begin+end)/2;
            if(mid == target){
                return mid;
            }
            else if(mid < target){
                begin = mid +1;
            }
            else if(mid > target){
                end = mid -1;
            }
        }
        return -1;
    }
}
