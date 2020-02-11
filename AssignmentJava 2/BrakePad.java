package GROUPASSIGNMENT;

public class BrakePad extends StockItem{
    
    BrakePad(String stockCode, int quantityInStock, double price){
        super(stockCode,quantityInStock,price);
    }

    
    @Override
    public String getStockName(){
        return "Brake Pad";
    }
    @Override
    public String getStockDescription(){
        return "Brake Pad Description";
    }
    
    @Override
    public String toString(){
        return super.toString();
        
    }    
    
    
}
