public class Question2_1 {
//    Given a binary array, array[] we can at most swap single 0 with 1. find max consecutive 1's we can set in the array.
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,1,1,0,0};
        int ans = consecutive1s(array);
        System.out.println("ans : "+ans);
    }
    static int consecutive1s(int[] array){
        int lone=0,rone=0,ans=0,cnt=0;
        for(int i=0;i< array.length;i++){
//            cnt=cnt+array[i];
            if(array[i]==1){
                cnt++;
            }
        }
        if(cnt== array.length){
            return cnt;
        }
        for(int i=0;i< array.length;i++){
            lone=0;
            rone=0;
            if(array[i]==0){
                for(int j=i-1;j>=0;j--){
                    if(array[j]==0){
                        break;
                    }
                    lone++;
                }
                for(int j=i+1;j< array.length;j++){
                    if(array[j]==0){
                        break;
                    }
                    rone++;
                }
            }
            if(cnt>=lone+rone+1) {
                ans = Math.max(ans, lone + rone + 1);
            }else{
                ans = Math.max(ans, lone + rone);
            }
        }
        return ans;
    }
}
