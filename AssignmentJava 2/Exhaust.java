package GROUPASSIGNMENT;

public class Exhaust  extends StockItem{
    Exhaust(String stockCode, int quantityInStock, double price){
        super(stockCode,quantityInStock,price);
    }

    
    @Override
    public String getStockName(){
        return "Exhaust";
    }
    @Override
    public String getStockDescription(){
        return "Exhaust Description";
    }
    
    @Override
    public String toString(){
        return super.toString();
    }    
}
