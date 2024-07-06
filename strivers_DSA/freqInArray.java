import java.util.HashMap;
import java.util.Map;

public class freqInArray{

    public static void main (String [] args) {

        int [] array = {10,5,10,15,10,5};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            if(frequencyMap.containsKey(element)){
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }
} 