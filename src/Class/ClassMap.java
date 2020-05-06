package Class;

import java.util.*;

public class ClassMap {

    Map<Integer, String> hashMap;

    public ClassMap() {
        this.hashMap = new HashMap<>();
    }

    public void addMap(int key, String val) {
        hashMap.put(key, val);
    }

    public String getMap(int key){
        String string = hashMap.get(key);
        return string;
    }

    public void overwrite(int key, String val) {
        hashMap.put(key, val);
    }

    public void delete(int a) {
        hashMap.remove(a);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassMap classMap = (ClassMap) o;
        return Objects.equals(hashMap, classMap.hashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashMap);
    }

    @Override
    public String toString() {
        return "ClassMap{" +
                "hashMap=" + hashMap +
                '}';
    }
}
