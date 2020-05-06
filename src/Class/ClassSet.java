package Class;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ClassSet {

    Set<String> hashSet;

    public ClassSet() {
        this.hashSet = new HashSet<String>();
    }

    public void addSet(String string) {
        hashSet.add(string);
    }

    public void delete(String string) {
        hashSet.remove(string);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassSet classSet = (ClassSet) o;
        return Objects.equals(hashSet, classSet.hashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashSet);
    }

    @Override
    public String toString() {
        return "ClassSet{" +
                "hashSet=" + hashSet +
                '}';
    }
}
