public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double price;

    public GroceryItemOrder (String name, double price,int quantity)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;

    }

    public double getCost()
    {
        return this.price*this.quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
}
