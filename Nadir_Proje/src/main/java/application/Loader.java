package application;

import java.util.HashMap;
import java.util.Map;

public class Loader {
    public static final Map<String, String> n = new HashMap();
    String key, value;

    public Loader(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Loader() {

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method() {
        n.put(key, value);
        System.out.println(value);
    }
}
