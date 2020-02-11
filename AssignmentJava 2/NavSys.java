package GROUPASSIGNMENT;

public class NavSys extends StockItem{    //New file extentsion from StockItem

    NavSys(){
        fixStockCode    = "NS101";
        quantityInStock = 10;
        stockItemPrice  = 99.99;
    }


    NavSys(String newNavStockCode, int newNavQuantityInStock, double newNavStockItemPrice){
        super(newNavStockCode,newNavQuantityInStock,newNavStockItemPrice);

    }
   
    @Override                  //
    public String getStockName(){
        return "Navigation System";
    }
    @Override
    public String getStockDescription(){
        return "GeoVision Sat Nat";
    }
    
    @Override
    public String toString(){            //Going back overiding the Original stock item for the next stock item. 
        return super.toString();
    }
}