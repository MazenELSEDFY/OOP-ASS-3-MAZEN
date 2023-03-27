import java.util.ArrayList;
public class Grocerylist {
    GroceryItemOrder[] GO;
    int NUM;

    public Grocerylist() {
        GO = new GroceryItemOrder[10];
        NUM = 0;
    }

    public void add(GroceryItemOrder item) {
        if (NUM != 10) {
            this.GO[NUM] = item;
            this.NUM++;

        }
    }
    public double getTotalCost()
    {
        double total_cost=0;
        for(int i=0;i<this.NUM;i++)
        {
            total_cost+=this.GO[i].getCost();
        }
        return total_cost;

    }
}
