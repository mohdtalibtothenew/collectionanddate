//Question 3 Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.HashMap;
import java.util.Map;
public class CharacterOccurence {

    public static void main(String...args){
        String inputString = "kdjgfuydg";
        char[] stringCharArray = inputString.toCharArray();
        int length = stringCharArray.length;

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<length;i++){
            if(!map.containsKey(stringCharArray[i])){
                map.put(stringCharArray[i],0);
            }
            if(map.containsKey(stringCharArray[i])){
                map.put(stringCharArray[i],map.get(stringCharArray[i])+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                System.out.println("Character :" + entry.getKey()+ "  Occurence :"+entry.getValue() );

        }

    }
}
