package Stack;

public class Problem1 {

	public static void main(String args[])
	{
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(3);
		
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}
	static boolean isPalindrome(Node head)
	{

		Node slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.ptr;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			}
			else {
				ispalin = false;
				break;
			}
			head = head.ptr;
		}
		return ispalin;
	}
}

class Node {
	int data;
	Node ptr;
	Node(int d)
	{
		ptr = null;
		data = d;
	}
}


