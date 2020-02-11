package GROUPASSIGNMENT;

public class Tyre extends StockItem{
    Tyre(String stockCode, int quantityInStock, double price){
        super(stockCode,quantityInStock,price);
    }

    
    @Override
    public String getStockName(){
        return "Tyre";
    }
    @Override
    public String getStockDescription(){
        return "Tyre Description";
    }
    
    @Override
    public String toString(){
        return super.toString();
        
   } 
}
