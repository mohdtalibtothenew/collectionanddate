import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSum {

    public static void main(String[] args) {
        float sum =0f;
        ArrayList<Float> arrayList = new ArrayList<>();
        arrayList.add(3f);
        arrayList.add(3f);
        arrayList.add(3f);
        arrayList.add(3f);
        arrayList.add(3f);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
             sum  = (Float)(iterator.next()) + sum;
        }
        System.out.println(sum);
    }
}
