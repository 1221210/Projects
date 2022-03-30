package hw.wordCount;

public class Pair {
    String key;
    Integer val;
    public Pair(String k, Integer v){
        key = k;
        val = v;
    }
    public boolean equals(Object obj){
        return key.equals(((Pair)obj).key);
    }
}
