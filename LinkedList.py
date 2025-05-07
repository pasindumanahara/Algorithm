# THIS IS THE CODING REPRESENTATION OF THE LINKED LISTS'

# Definition of a Node in a singly linked list
# Python Program to insert the node at the beginning of
# Linked List


class Node:
    def __init__(self, new_data):
        # Initialize the node's data
        self.data = new_data

        # Set the next pointer to None
        self.next = None


def insert_at_front(head, new_data):
    # Create a new node with the given data
    new_node = Node(new_data)

    # Make the next of the new node point to the current head
    new_node.next = head

    # Return the new node as the new head of the list
    return new_node


def print_list(head):
    # Start from the head of the list
    curr = head

    # Traverse the list
    while curr is not None:
        # Print the current node's data
        print(f" {curr.data}", end="")

        # Move to the next node
        curr = curr.next

    # Print a newline at the end
    print()


# Driver code to test the functions
if __name__ == "__main__":
    # Create the linked list 2->3->4->5
 
   
    head = Node(2)
    head.next = Node(3)
    head.next.next = Node(4)
    head.next.next.next = Node(5)

    # Print the original list
    print("Original Linked List:", end="")
    print_list(head)

    # Insert a new node at the front of the list
    print("After inserting Nodes at the front:", end="")
    data = 1
    head = insert_at_front(head, data)

    # Print the updated list
    print_list(head)