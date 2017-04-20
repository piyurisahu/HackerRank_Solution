/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  */
 

    

Node InsertNth(Node head, int data, int position) {
  Node node=head;
		if(position==1)
		{
			Node new_node=new Node();
            new_node.data=data;
			new_node.next=head;
			head=new_node;
            return new_node;
    
			
		}
		
		int i=2;Node before=head; Node after=head.next;
			if(i==2)
			{
				Node new_node=new Node();
                new_node.data=data;

				before.next= new_node;
				new_node.next=after;
				return new_node;
    
			}
			
			while(i!=position )
			{
				i++;
				before=before.next;
				after=after.next;
				
				
				
			}
			Node new_node=new Node();
            new_node.data=data;
			new_node.next=after;
			before.next=new_node;
			
		return head;
    
}
