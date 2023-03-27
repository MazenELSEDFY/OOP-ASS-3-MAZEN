public class Main {
    // Q6 --------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Grocerylist GLIST=new Grocerylist();
        GroceryItemOrder GITEM1 =new GroceryItemOrder("CAKE",12,1);
        GITEM1.setQuantity(2);
        System.out.println("The cost is "+GITEM1.getCost());
        GLIST.add(GITEM1);
        GroceryItemOrder GITEM2 = new GroceryItemOrder("COFFEE", 6, 4);
        GLIST.add( GITEM2 );
        System.out.println("The total cost of groceries is => "+ GLIST.getTotalCost() );
    }
}