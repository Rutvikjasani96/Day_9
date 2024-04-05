public class Question2 {
//    Given a binary array,we are allowed to replace at most one 0 with a 1. return length of max consecutive 1's.
    public static void main(String[] args) {
        int[] array = {1,1,1,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,1};
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
            ans = Math.max(ans,lone+rone+1);
        }
        return ans;
    }
}
