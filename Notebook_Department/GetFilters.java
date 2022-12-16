import java.util.*;

public class GetFilters {
    private HashMap<String, String> typeOfFilters;
    private HashMap<String, String> laptopFilters;
    private HashMap<String, String> convertToFields;
    private String customChoiseFilter;

    public GetFilters() {
        this.typeOfFilters = new HashMap<String, String>();
        this.laptopFilters = new HashMap<String, String>();
        this.convertToFields = new HashMap<String, String>();
        this.initStes();
    }
    private void initStes() {
        this.typeOfFilters.put("1", "Цена");
        this.typeOfFilters.put("2", "Цвет");
        this.typeOfFilters.put("3", "Марка");
        this.convertToFields.put("Цена", "price");
        this.convertToFields.put("Цвет", "color");
        this.convertToFields.put("Марка", "name");

    }

    public void creatFilters() {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Введите цифру: ");

        Set set = this.typeOfFilters.entrySet(); 
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {  
            Map.Entry map = (Map.Entry) iterator.next();  
            System.out.println(map.getKey() + " " + map.getValue());  
        } 

        String userChoise = myObj.nextLine();
        this.customChoiseFilter = this.typeOfFilters.get(userChoise);
        this.customChoiseFilter = this.convertToFields.get(this.customChoiseFilter);
        System.out.println("Введите критерий: ");
        userChoise = myObj.nextLine();
        this.laptopFilters.put(this.customChoiseFilter, userChoise);

        
        

    }

    public void exacFilter(ArrayList<Notebook> laptops) {

        System.out.println("\nПод критрий подходят следующие ноутбуки:");

        if (this.customChoiseFilter == "price") this.filterBigOrSmaller(laptops);
        if (this.customChoiseFilter == "color") this.filterEqual(laptops);
        if (this.customChoiseFilter == "name") this.filterEqual(laptops);

    }

    public void filterBigOrSmaller(ArrayList<Notebook> laptops) {
        GetPrivateField getter = new GetPrivateField();
        Integer currentFilter = Integer.parseInt(this.laptopFilters.get(this.customChoiseFilter));
        for (Notebook laptop: laptops) {
            float currentMeaning = Float.parseFloat((String) getter.Getter(laptop, this.customChoiseFilter));
            if (currentMeaning < currentFilter) System.out.println(laptop);
        }
    }

    public void filterEqual(ArrayList<Notebook> laptops) {
        GetPrivateField getter = new GetPrivateField();
        String currentFilter = this.laptopFilters.get(this.customChoiseFilter);
        for (Notebook laptop: laptops) {
            String currentMeaning = getter.Getter(laptop, this.customChoiseFilter);
            if (currentMeaning.contains(currentFilter)) System.out.println(laptop);
        }
    }
    
}
