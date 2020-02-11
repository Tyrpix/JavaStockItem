package GROUPASSIGNMENT;

public class StockItem {
        
    //Objects,intergers-declaring varibles.
        String  fixStockCode;
        int     quantityInStock;
        double  stockItemPrice;
        
        //default constructor ---->cif we didint have this we would input it in
        //string in teststockitem class.
        
        StockItem(){
            fixStockCode    = "W101";
            quantityInStock = 10;
            stockItemPrice  = 99.99;
        }
        
        //constructor---> intialized objects ----> overide default 
        StockItem(String newStockCode, int newQuantityInStock, double newStockItemPrice){
            this.fixStockCode    = newStockCode;
            this.quantityInStock = newQuantityInStock;
            this.stockItemPrice  = newStockItemPrice;           
        }
//getter and setter methods ----> returning is overiding.
        public String getStockCode(){
            return this.fixStockCode;
        }
      
        public int getQuantityInStock(){
            return this.quantityInStock;
        }
        
        public void setStockItemPrice(double newStockItemPrice){
            this.stockItemPrice = newStockItemPrice;
            
        }
        public double getStockItemPrice(){
            return this.stockItemPrice;
        }

        public String getStockName(){
            return "Unknown Stock Name";        
        }

        public String getStockDescription(){
            return "Unknown Stock Description";
        }
        
        public double getVAT()
        {
            return 0.175;
        }
        
        public double getPriceWithoutVAT(){   
            return stockItemPrice;
        }
        
        public double getPriceWithVAT(){   
            return getPriceWithoutVAT() + (getPriceWithoutVAT() * getVAT());
        }
        
        
        //Adding stock via if else statement less than 1 print error more than 100 print error
        public boolean addStock(int aStock){
            
            if(aStock<1){
                System.out.println("The ERROR was: Increased item must be greater than or equal to one !");
                return false;
            }
            else if((this.quantityInStock + aStock)>100){ 
                System.out.println("The ERROR was: total stock greater than 100");
                return false;
            }
            else
            {
                this.quantityInStock += aStock;  // +=(operator) adding onto total
            }
            return true;
        }
        
   
    //  selling stock 
        public boolean sellStock(int sStock){
            
            if(sStock<1){
                System.out.println("The ERROR was: Increased item must be greater than or equal to one !");
                return false;
            }
            
            else if(sStock > quantityInStock){
                System.out.println("The ERROR was: Cannot sell more stock than available");
                return false;
            }
            else this.quantityInStock -= sStock;
            return true;
        }
        
        
        @Override       // overidig teststockitem for clean slate for next class //printing 
        public String toString(){
            return " - Stock Type: "
                    + getStockName()
                    +"\n - Description: "
                    + getStockDescription()
                    +"\n - Stock Code: "
                    + getStockCode()
                    +"\n - Price without VAT: " 
                    + getStockItemPrice()
                    +"\n - Price with VAT: "
                    + getPriceWithVAT()
                    +"\n - Total unit in stock: "
                    + getQuantityInStock() ;                                              
        }    
    }