package easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
       int[] flowerbed ={0,0,1,0,1};//
//        int[] flowerbed = {1,0,0,0,0,1};
       int n = 2;

        System.out.println(canPlaceFlowers(flowerbed,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i=0;i<flowerbed.length;i+=2){
            if(flowerbed[i]==1)
                continue;
            if(i+1<flowerbed.length && flowerbed[i+1]==1){
                i++;
            }
            else{
                n--;
            }
            if(n<=0)return true;
        }
        return n<=0;
    }
}
