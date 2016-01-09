package is2pr3;

import java.util.HashMap;
import java.util.Set;

public class Histogram <T>{
    private final HashMap<T,Integer> map = new HashMap<T, Integer>();

    public Integer get(Object o) {
        return map.get(o);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    public void increment (T key){
        map.put(key, map.containsKey(key) ? map.get(key)+1 : 1);
    }

   // Histogram<String> execute() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}
