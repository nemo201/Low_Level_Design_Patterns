package v1;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	
	public DoublyLinkedList() {
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
	}
	
	public void addToFront(Node node) {
		Node nextNode = head.next;
		head.next = node;
		node.prev = head;
		node.next = nextNode;
		nextNode.prev = node;
	}
	
	public void removeNode(Node node) {
		node.next.prev = node.prev;
		node.prev.next = node.next;
	}
	
	public Node removeLast() {
		if (tail.prev == null) {
			return null;
		}
		
		Node lastNode = tail.prev;
		removeNode(lastNode);
		return lastNode;
	}
}
