
/**
 * Associate key/value pairs.  keys are immutable.
 * 
 * @author Jim Teresco and the CSIS 210 class, Fall 2017
 * Siena College on its birthday.
 *
 */
public class Association<K,V>
{
    /* instance variables to store our key and our value */
    private K key;
    private V value;
    
    /* construct a new Association with the given key/value pair */
    public Association(K k, V v) {
     
        key = k;
        value = v;
    }
    
    /* construct a new Association with the given key, no value */
    public Association(K k) {
     
        key = k;
        value = null;
    }
    
    /* set a new value */
    public void setValue(V v) {
     
        value = v;
    }
    
    /* accessors */
    public K getKey() {
     
        return key;
    }
    
    public V getValue() {
        
        return value;
    }
    
    /* convert contents to a String */
    public String toString() {
     
        return "<key: " + key + ", value: " + value + ">";
    }
    
    public boolean equals(Object o) {
     
        Association<K,V> other = (Association<K,V>) o;
        return other.key.equals(key);
    }
}
