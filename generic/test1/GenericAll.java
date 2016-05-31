package generic.test1;

public class GenericAll<K, V> {
	
	private K key;
	private V value;
	
	public void setKey(K key){
		this.key=key;
	}
	
	public void setValue(V value){
		this.value=value;
	}
	
	public K getKey(){
		return key;
	}
	
	public V getValue(){
		return value;
	}

}