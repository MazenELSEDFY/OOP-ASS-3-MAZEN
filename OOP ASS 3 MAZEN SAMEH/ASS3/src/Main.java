import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//  Q2 -------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(16);
        list.add(3);
        list.add(23);
        list.add(68);
        int MAX= max(list);

        System.out.println("Maximum Number is "+MAX);

    }

    static int max(ArrayList list){
        int Max=0, x;
        int size= list.size();
        for(int i=0;i<size;i++)
        {
            x=(int)list.get(i);
            if(Max<x)
            {
                Max=x;
            }
        }
        return Max;
    }


}