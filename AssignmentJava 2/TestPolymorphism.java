package GROUPASSIGNMENT;


public class TestPolymorphism {
// summary of every item in stock
    public static void itemInstance(StockItem s){
        System.out.println("Printing item stock information: ");
System.out.println("..........................................");
        System.out.println(s);
        

        // addStock: test add function and print
System.out.println("..........................................");
        System.out.println("------> Increasing 7 more units");
        s.addStock(7);
        System.out.println(s);

        // soldStock: test remove function and print
System.out.println("..........................................");
        System.out.println("------> Selling 3 units");
        s.sellStock(3);
        System.out.println(s);

        // setnewPric: test new price function and print
System.out.println("..........................................");        
        System.out.println("------> Set new price 9.99 per units");
        s.setStockItemPrice(9.99);
        System.out.println(s);

    }
    
    public static void main(String[] args) {
        StockItem[] s = new StockItem[4];
        
        BrakePad brakePad = new BrakePad("BP10", 20, 25.99);
        Exhaust exhaust = new Exhaust("E10", 10, 30.99);
        Tyre tyre = new Tyre("T10", 10, 40.99);
        NavSys nS = new NavSys("NS101",10,99.99);
        
        s[0] = brakePad;
        
        // ADD NEW ITEMS TO ARRAY 
        s[1] = exhaust;
        s[2] = tyre;
        s[3] = nS;
//For loop calling arrays 
        for(int i=0; i<4; i++) {
            System.out.println("----------------------------------------------Start "+(i+1)+" Loop");
            itemInstance(s[i]);
            System.out.println("----------------------------------------------End "+(i+1)+" Loop");
        }



    }
    
}
