// import lombok.AccessLevel;
// import lombok.Getter;
// import lombok.Setter;
import java.lang.reflect.*;  


public class GetPrivateField {

    public String Getter(Notebook obj, String field) {
        String value = "";
        
        try { 
            // Class cls = Class.forName("Notebook");
            Field prvtField = Notebook.class.getDeclaredField(field);
            prvtField.setAccessible(true);
            value = (String) prvtField.get(obj);
            
            prvtField.setAccessible(false);
        } catch (Exception e) {}
        // System.out.println(value);
        return value;
    }
    
}
