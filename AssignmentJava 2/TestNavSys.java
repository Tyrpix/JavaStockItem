
package GROUPASSIGNMENT;

public class TestNavSys {

    public static void main(String[] args) {
        
        NavSys nS = new NavSys();
        System.out.println("Creating a stock with 10 units Unknown item, price 99.99 each, and item code W101");
System.out.println("..........................................");        

        System.out.println(nS);
        
System.out.println("..........................................");        
        System.out.println("---> Increasing 10 more units");
        nS.addStock(10);
        System.out.println(nS);
        
System.out.println("..........................................");        
        System.out.println("--->Selling 2 units");
        nS.sellStock(2);
        System.out.println(nS);    
        
System.out.println("..........................................");                
        System.out.println("--->Set new price to 100.99 per unit");        
        nS.setStockItemPrice(100.99);
        System.out.println(nS);
        
System.out.println("..........................................");                
        System.out.println("---> Incresing 0 more units");
        nS.addStock(0);
        
        
    }
    
}
