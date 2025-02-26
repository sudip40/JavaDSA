package Arrays.DSA;

import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public boolean permutation(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : array1){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }

        for(int n : array2){
            if(map.containsKey(n)){
                if(map.get(n) == 0){
                    return false;
                }
                else{
                    map.put(n, map.get(n)-1);
                }
            }
            else{
                return false;
            }
        }

        return true;
    }
}
