/*

Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

    void add(key) Inserts the value key into the HashSet.
    bool contains(key) Returns whether the value key exists in the HashSet or not.
    void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

From Leetcode : https://leetcode.com/problems/design-hashset/

*/


class MyHashSet {

    int size = (int)Math.pow(10, 6)+1;
	boolean[] flag;
    public MyHashSet() {
		flag = new boolean[size];
	}
    
    public void add(int key) {
        flag[key]=true;
    }
    
    public void remove(int key) {
        flag[key]=false;
    }
    
    public boolean contains(int key) {
        return flag[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
