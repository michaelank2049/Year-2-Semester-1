/************************************************************************ 
* Programmer:  Michael Lankford
* 
* Course:  CSCI 2315
* 
* Date:  10, 16, 2020
* 
* Assignment:  Homework 5
* 
* Environment:  Java with Netbeans IDE
* 
* Purpose:  Change LinkedList through various methods
* 
* Input:  List1 and List2
* 
* Preconditions/Assumptions:  Only integers are input 
* 
* Output:  LinkedList after each change
* 
* Pseudocode: 
*       1. Declare variables
*       2. Create constructor method, end of linked list method, reset method, advance cursor method, move node right method,
*            return first node method, head insert method, list insert method, list search method, list remove method, 
*            list current remove method.
*       3. Create new add list, subtract list, and reverse list methods.    
***********************************************************************/ 



public class LinkedList<T>
{
    private Node<T> head;	// head of the list always at the front
    private Node<T> cursor;	// cursor that moves along the one way list

    
// constructor
    public LinkedList ()
    {
        // the first node is not used, dummy node 
        // so we're always dealing with the element to the right of 
        // the cursor not what the cursor is pointing to.
        head = new Node<T>(null, null);
        cursor = head;

    } // end constructor LinkedList

    
// if the cursor's next is null, then we're at the end
    public boolean isAtEnd()
    {
	return(cursor.getNext() == null);
        
    } // isAtEnd

    
// move the cursor to the beginning of the list
    public void reset()
    {
	cursor = head;
        
    } // end reset

// advance the cursor one spot to the right
    public void advance()
    {
	cursor = cursor.getNext();
        
    } // end advance

    
// return the node to the right of the cursor
    public Node<T> getRight()  
    {
	return cursor.getNext();
        
    }  // end getRight

    
// return the first node in the list
    public Node<T> getFirst()
    {
	return head.getNext();
        
    }  // end getFirst

    
    // insert at the beginning of the list, this insert is done to the 
    // right of the dummy node, but to the left of the first meaningful
    // node.
    public void listHeadInsert(T value)
    {
	head.setNext(new Node<T>(value, head.getNext()));
        
    }  // listHeadInsert

    
    // wherever the cursor is, insert to the right of it, and move the
    // cursor to point to the newly inserted node
    // you may remove the line that advances the cursor, but you need
    // to make sure that you advance the cursor when inserting elements
    // at the end of the list one after another.
    public void listInsert(T value)
    {
	// insert to the right of the cursor
	cursor.setNext(new Node<T>(value, cursor.getNext()));

	cursor = cursor.getNext();
	
    }  // end listInsert


    // move the cursor to the head of the list, and keep moving it
    // looking for the value, stop if you either find the value
    // or you have reached the end of the list without finding it.
    // return the node that contains the given value back to me.
    // this return will return null if the value is not found.
    public Node<T> listSearch(T value)
    {
	cursor = head;
	while(cursor.getNext() != null && 
	      !cursor.getNext().getValue().equals(value))
        {
	    cursor = cursor.getNext();
        }
        
	return cursor.getNext();

    }  // end listSearch


    // first search (first 4 lines of the code)
    // if you find it (not null) then just remove it by making the
    // cursor's next pointer point to the node next to it's next 
    // pointer (skip a node)
    public void listRemove(T value)
    {
	cursor = head;
	while(cursor.getNext() != null && 
	      !cursor.getNext().getValue().equals(value))
        {
	    cursor = cursor.getNext();
        }
	if(cursor.getNext() != null)
        {
            cursor.setNext(cursor.getNext().getNext());

        }  // end if
    }  // end listRemove

    
    // don't search, just remove the node to the right of the cursor 
    // if it's not null.
    public void listRemoveCurrent()
    {
	if(cursor.getNext() != null)
        {
            cursor.setNext(cursor.getNext().getNext());

        }// end if
    }  // end list remove
    
    
    //Method to add to list
    public void addList(LinkedList<T> list2)
    {
        Node<T> temp = list2.head.getNext();
        
        while(temp != null)
        {
            listSearch(temp.getValue());
            
            if(listSearch(temp.getValue()) == null)
            {
                listInsert(temp.getValue());
            }
            
            temp = temp.getNext();
        }
    }
    
    
    //Method to subtract from a list
    public void subtractList(LinkedList<T> list2)
    {
        Node<T> temp = list2.head.getNext();
        
        while(temp != null)
        {
            listRemove(temp.getValue());

            temp = temp.getNext();
        }
    }
    
    
    //Method to reverse the list
    public void reverseList()
    {
        Node<T> temp = head.getNext();
        
        while(temp != null)
        {
            listRemove(temp.getValue());
            listHeadInsert(temp.getValue());

            temp = temp.getNext();
        }
    }
    
    
}  // end class
