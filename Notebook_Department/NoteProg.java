import java.util.*;

public class NoteProg {
    public static void main(String[] args) {
        ArrayList<Notebook> laptops = new ArrayList<Notebook>();
        laptops.add(new Notebook("Apple", "MasOS", "white", "1000.53", "simple", "retina"));
        laptops.add(new Notebook("Dell", "Win", "silver", "850.32", "gamer", "highRes"));
        laptops.add(new Notebook("HP", "Linux", "black", "750.32", "simple", "simple"));
        laptops.add(new Notebook("Lenova", "Linux", "silver", "950.32", "gamer", "highRes"));
        laptops.add(new Notebook("Samsung", "Win", "black", "1150.32", "gamer", "highRes"));
        laptops.add(new Notebook("Acer", "Win", "black", "1250.32", "gamer", "highRes"));

        GetFilters filter = new GetFilters();
        filter.creatFilters();
        filter.exacFilter(laptops);

        
         
        
    }
}