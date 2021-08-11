
public class StackUsingArray {
	//Implementing Stack using Array:
	
	int size;
	int arr[];
	int top;

	public StackUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top= -1;
	}
	
	public void push(int element) {
		if(!this.isFull()) {
			top++;
			arr[top] = element;
			System.out.println("pused element : "+element);
		}else {
			System.out.println("Stack is full now");
		}
		
	}
	
	public int pop() {
		if(!this.isEmpty()) {
			int returnedtop = top;
			top--;
			System.out.println("popped element: " +arr[returnedtop]);
			return arr[returnedtop];
			
		}else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(!this.isEmpty()) {
			return arr[size];
	
	}else {
		System.out.println("Stack is empty");
		return -1;
	}
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (size-1 == top);
	}
	
	
	public static void main(String[] args) {
		StackUsingArray stackimp= new StackUsingArray(4);
		stackimp.pop();
		System.out.println("************");
		
		stackimp.push(100);
		stackimp.push(200);
		stackimp.push(300);
		stackimp.push(400);
		
	
		
		System.out.println("************");
		stackimp.isEmpty();
		stackimp.isFull();
		
		
		
	}

}
