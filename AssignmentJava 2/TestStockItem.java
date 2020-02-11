
package GROUPASSIGNMENT;

public class TestStockItem {

    public static void main(String[] args) {
  
        StockItem stkItem = new StockItem();
        
        // start print default
        System.out.println("Creating a stock with 10 units Unknown item, price 99.99 each, and item code W101");
System.out.println("..........................................");        
        System.out.println(stkItem);
        
System.out.println("..........................................");
   
        //add 10
        System.out.println("------> When incresing 10 more units");
        stkItem.addStock(10);        
        System.out.println(stkItem);
        
System.out.println("..........................................");
        
        //sell 2
        System.out.println("------> When sold 2 units");
        stkItem.sellStock(2);
        System.out.println(stkItem);
        
System.out.println("..........................................");
        
        // set new price
        System.out.println("------> When set new price 100.99 per units");
        stkItem.setStockItemPrice(100.99);
        System.out.println(stkItem);

System.out.println("..........................................");        
        // add 0 will error 
        System.out.println("------> When incresing 0 more units");
        stkItem.addStock(0);
        
        
    }
    
}
