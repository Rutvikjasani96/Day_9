public class Question1 {
//    Given N array elements, print start and end index of all subarrays of size k. k<=n
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        int k = 4;
        int s = 0, e = k -1;
        while(s<=array.length-k){
            System.out.println(s+" "+e);
            s++;
            e++;
        }
    }
}
