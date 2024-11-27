import java.util.LinkedList;

public class HashTable{
    private static class Entry {
        String key;
        String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public int hashCode(String key) {
        int hashValue = 0;
        for (char c : key.toCharArray()) {
            hashValue += c;
        }
        return hashValue % size;
    }

    public void add(String key, String value) {
        int index = hashCode(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; 
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public String get(String key) {
        int index = hashCode(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; 
    }

    public void remove(String key) {
        int index = hashCode(key);
        table[index].removeIf(entry -> entry.key.equals(key));
    } 

}