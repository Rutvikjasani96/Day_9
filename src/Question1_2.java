public class Question1_2 {
//    Given N array elements, find maximum subarray sum of length k.
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        int k=4;
        int s=0,e=k-1;
        int maxSum=0;
        int[] ps = new int[array.length];
//        buildPSArray(array,ps);
//        maxSum = maxSumSubarray(array,s,e,k,ps); // using Prefix Sum
        maxSum = maxSumSubarrayOptimized(array,k,s,e);
        System.out.println("Maxsum of Subarray : "+maxSum);
    }
    static int maxSumSubarrayOptimized(int[] array,int k,int s,int e){
        int sum=0,maxSum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum = sum + array[i];
        }
        s=1;
        e=k;
        while(s<= array.length-k){
            sum = sum - array[s-1] + array[e];
            s++;
            e++;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    static void buildPSArray(int[] array,int[] ps){
        ps[0]=array[0];
        for(int i=1;i<array.length;i++){
            ps[i] = ps[i-1] + array[i];
        }
    }
    static int maxSumSubarray(int[] array,int s,int e,int k,int[] ps){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        while(s<= array.length-k){
            sum=0;
//            for(int i=s;i<=e;i++){
//                sum = sum + array[i];
//            }
//            Let's Optimises
            if(s!=0) {
                sum = ps[e] - ps[s - 1];
            }else{
                sum = ps[e];
            }
            maxSum = Math.max(maxSum,sum);
            s++;
            e++;
        }
        return maxSum;
    }
}
