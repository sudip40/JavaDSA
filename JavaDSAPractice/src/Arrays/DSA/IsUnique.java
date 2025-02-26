package Arrays.DSA;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public boolean isUnique(int[] intArray) {
        Set<Integer> set = new HashSet<>();
        for(int n : intArray){
            set.add(n);
        }
        if(set.size() == intArray.length){
            return true;
        }
        return false;
    }
}
