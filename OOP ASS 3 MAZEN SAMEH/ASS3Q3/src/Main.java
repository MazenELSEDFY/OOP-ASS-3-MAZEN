import java.util.ArrayList;
import java.util.Collections;
//  Q3 ------------------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(3);
        list.add(7);
        list.add(13);
        sort(list);

        System.out.println(list);
    }

    static void sort(ArrayList list)
    {
        Collections.sort(list);
    }
}