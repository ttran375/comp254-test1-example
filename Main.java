//concatenate two singly linked lists
  //input: L1, L2 are singly linked lists
  //output: the concatenated version
  public <E> SinglyLinkedList<E> concatenateLists(SinglyLinkedList<E> L1, 
		  SinglyLinkedList<E> L2)
  {
	  //Create a new node v
	  Node<E> walk = new Node<E>(null, null);
	  walk = L1.head; //point to head of L1
	  //traverse L1
	  while(walk.getNext() != null)
		  walk = walk.getNext();
	  //link to header of list L2
	  walk.setNext(L2.head);
	  //return the concatenated list
	  return L1;	  
  }
  //
public static void main(String[] args)
  {	  
	  SinglyLinkedList<String> list1 = new SinglyLinkedList<String>();
	  list1.addFirst("MSP");
	  list1.addLast("ATL");
	  list1.addLast("BOS");
	  SinglyLinkedList<String> list2 = new SinglyLinkedList<String>();
	  //
	  list2.addFirst("YYZ");
	  list2.addLast("MTRL");
	  list2.addLast("OTW");
	  System.out.println(list1);
	  System.out.println(list2);
	  //
	  System.out.println(list1.concatenateLists(list1, list2));
	  System.out.println(list1.secondToLast().getElement());
  }
