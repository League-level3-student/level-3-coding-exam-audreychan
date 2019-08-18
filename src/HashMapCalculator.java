import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashMap1, HashMap<String, String> hashMap2) {
		int numOfPairs = 0;
		Object[] keys1 = hashMap1.keySet().toArray();
		Object[] keys2 = hashMap2.keySet().toArray();
		
		for(int i  = 0; i < keys1.length; i++) {
			if(contains(keys2, keys1[i])) {
				if(hashMap1.get(keys1[i]) == hashMap2.get(keys1[i])) {
					numOfPairs ++;
				}
			}
		}
		
		return numOfPairs;
	}
	
	boolean contains(Object[] arr, Object value) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				return true;
			}
		}
		return false;
	}
	
}
