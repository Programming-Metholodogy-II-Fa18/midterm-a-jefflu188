package problem2;

public class Data {
	public static void main(String[] args){
		Data A = new Data();
		A.add(1);
		A.add(1);
		A.add(9);
		A.add(4);
		A.add(5);
		A.add(10);
		A.add(0);
		System.out.println(A.getValue(0));
		System.out.println(A.getValue(3));

		
	}
	
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
			head.next.next.previous=head;
			System.out.println(a);//print value to console
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
