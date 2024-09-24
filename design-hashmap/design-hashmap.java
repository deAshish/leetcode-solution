class MyHashMap {
    
    //Node class defination
    class Node{
        int key, value;
        Node next;
        
        public Node(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    
    private Node[] buckets; // Arrays of linked lists
    private int capacity = 10000;
    private int size = 0;

    public MyHashMap() {
        buckets = new Node[capacity];
        
    }
    
    //Helper method to claculate the bucket index using the key's hashcode
    private int getBucketIndex(int key) {
        return key % capacity; //Simple modulus operation for bucket index
    }
    
    
    public void put(int key, int value) {
        int bucketIndex = getBucketIndex(key);
        Node head = buckets[bucketIndex];
        
        if(head == null){
            buckets[bucketIndex] = new Node(key, value);
            size++;
            return;
        }
        
        Node current = head;
        while(current !=null){
            if(current.key == key){
                current.value = value;
                return;
            }
            if(current.next == null) break;
            current = current.next;
        }
        
        current.next = new Node(key, value);
        size++;
        
    }
    
    public int get(int key) {
        int bucketIndex = getBucketIndex(key);
        Node current = buckets[bucketIndex];
        
        while(current !=null){
            if(current.key ==key){
                return current.value;
            }
            
            current = current.next;
        }
        
        return -1;
        
    }
    
    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        Node current = buckets[bucketIndex];
        Node prev = null;
        
        while(current != null){
            if(current.key == key) {
                if(prev == null){
                    buckets[bucketIndex] = current.next;
                } else {
                    prev.next = current.next;
                }
                
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */