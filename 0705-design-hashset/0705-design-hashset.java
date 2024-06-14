class MyHashSet {
    
    private class ListNode {
        int key;
        ListNode next;
        
        ListNode(int key) {
            this.key = key;
        }
    }
    
    private final int BUCKET_SIZE = 100000;
    private ListNode[] buckets;

    public MyHashSet() {
        buckets = new ListNode[BUCKET_SIZE];
        
    }
    
    public int hash(int key){
        return key % BUCKET_SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new ListNode(key);
        } else {
            ListNode current = buckets[index];
            while (true) {
                if (current.key == key) {
                    return;  // key already exists
                }
                if (current.next == null) {
                    current.next = new ListNode(key);
                    return;
                }
                current = current.next;
            }
        }
        
        
    }
    
    public void remove(int key) {
        int index = hash(key);
        ListNode current = buckets[index];
        if (current == null) return;

        if (current.key == key) {
            buckets[index] = current.next;
            return;
        }

        ListNode prev = null;
        while (current != null) {
            if (current.key == key) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
        
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        ListNode current = buckets[index];
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */