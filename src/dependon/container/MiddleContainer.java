package dependon.container;

import java.util.HashMap;
import java.util.Map;

public class MiddleContainer {

    public static Map<String, Object> middleMap = new HashMap<>();

    public static boolean setObject(Object object) {
        if (object == null) {
            return false;
        }
        middleMap.put(object.getClass().getSimpleName(), object);
        return true;
    }

    public static Object getObject(String name) {
        return middleMap.get(name);
    }
}
