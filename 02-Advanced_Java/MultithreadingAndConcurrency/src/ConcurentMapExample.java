import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurentMapExample {
    public static void main(String[] args){
        ConcurrentMap concurrentMap = new ConcurrentHashMap();

        concurrentMap.put("key", "value");
        Object object = concurrentMap.get("key");

        System.out.println(object);

        ConcurrentMap<String, String> concurrentMap2 = new ConcurrentHashMap<>();

        concurrentMap2.put("key", "value");
        concurrentMap2.put("key2", "value2");
        String  value = concurrentMap2.get("key");
        System.out.println(value);

        concurrentMap2.putIfAbsent("key", "value2");

        concurrentMap2.computeIfAbsent("key2", (key) -> {
            System.out.println("absent key: " + key);
            return "val2";
        });
    }
}
