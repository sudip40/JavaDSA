package Arrays.DSA;

public class FindANumber {
    public int searchInArray(int[] intArray, int valueToSearch) {
        for(int i=0; i<intArray.length; i++){
            if(intArray[i] == valueToSearch){
                return i;
            }
        }
        return -1;
    }
}
