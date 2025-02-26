package Arrays.DSA;

public class MaxProduct {
    public String maxProduct(int[] intArray) {
        int firstBig = Integer.MIN_VALUE;
        int secondBig = Integer.MAX_VALUE;
        for(int n : intArray){
            if(firstBig<n){
                secondBig = firstBig;
                firstBig = n;
            } else if(secondBig<n){
                secondBig = n;
            }
        }
        return firstBig +"," + secondBig;
    }
}
