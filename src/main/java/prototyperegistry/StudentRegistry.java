package prototyperegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    /**
     * Inserts student object in the regsitry.
     * @param key
     * @param student
     */
    void register(String key, Student student) {
        map.put(key, student);
    }

    // gets the student (original) from regitry.
    Student get(String key) {
        return map.get(key);
    }
}
