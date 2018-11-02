package problem3;

public class Data {
	node head = new node();
	node tail = new node();
	int size = 0;
	
	/*
	 * constructor
	 */
	public Data(){
		head.next = tail;
		tail.previous = head;
	}
	
	/*
	 * class node
	 */
	public class node{
		int item;
		node next;
		node previous;
		public node(){
		}
	}
	
	public void add(int a){
		node temp = new node();
		temp.item = a;
		temp.previous = tail.previous;
		temp.previous.next = temp;
		tail.previous = temp;
		temp.next = tail;
		size++;
	}
	
	public int remove(){
		int a = head.next.item;
		head.next = head.next.next;
		return a;
	}
	
	public int getValue(int i){
		node thisnode = new node();
		thisnode = head;
		int value = 0;
		for (int j = 0; j < i+1;j++){
			thisnode = thisnode.next;
			value = thisnode.item;
		}
		return value;
	}
}
