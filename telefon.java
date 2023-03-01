import java.util.HashMap;
import java.util.Map;

public class telefon {
    private Map<String,String> map = new HashMap<>();

    void add(String telefon, String main){
        map.put(telefon,main);
    }
    void print(String name){
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry); 
            }           
        }
    }
}
