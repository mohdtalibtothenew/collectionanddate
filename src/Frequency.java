//Question 6
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,42,3,43,2,2,2};
        Map<Integer,Integer> map=new HashMap();

        for(int i=0; i<arr.length; i++)
        {
            if(!map.containsKey(arr[i])){

                map.put(arr[i],0);
            }

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }

        }

        System.out.println("Unsorted array: ");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("key: "+ entry.getKey()+ " occurance : "+ entry.getValue());
        }
        List<Map.Entry<Integer,Integer>> sortedList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        sortedList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
                if (t1.getValue() < t2.getValue())
                    return 1;
                else if (t1.getValue() > t2.getValue())
                    return -1;
                else
                    return t2.getKey().compareTo(t1.getKey());
            }
        });
        System.out.println("After sorting : ");
        for (Map.Entry<Integer,Integer> integerEntry: sortedList){
            System.out.println("Key : " + integerEntry.getKey() + " Occurances : " + integerEntry.getValue());
        }
    }
}