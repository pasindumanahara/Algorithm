public class BinarySearch {
	
    // this will work as my main method
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(8));
        tree.insert(new Node(2));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        // deleting a data
        tree.remove(1);
        tree.display();
        // searching d data
        System.out.println(tree.search(7));
    }
}
class BinarySearchTree{
    Node root;
    public void insert(Node node){
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root,Node node){
        int data = node.data;
        if (root == null){
            root = node;
            return root;
        }
        else if(data< root.data){
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    public void displayHelper(Node root){
        if (root != null) {
            // if u wanna get the reversed change the displayHelper methods
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);            
        }
    }
    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data){
        if (root == null){
            return false;
        } else if (root.data == data){
            return true;
        } else if (root.data>data){
            return searchHelper(root.left, data);
        } else{
            return searchHelper(root.right, data);
        }        
    }
    public void remove(int data){
        if(search(data)){
            removerHelper(root, data);
        }
        else{
            System.out.println(data+ " cannot be found! ");
        }
    }
    
    public Node removerHelper(Node root, int data){
        if (root == null){
            return root;
        } else if(data < root.data){
            root.left = removerHelper(root.left, data);
        } else if (data>root.data){
            root.right = removerHelper(root.right, data);
        } else{ // node found
            if (root.left  == null && root.right == null )
            {
                root = null;
            } else if( root.right != null){
                // find a successor to replace the node
                root.data = successor(root);
                root.right = removerHelper(root.right, root.data);
            } else{
                // find a predacessor to replace the node
                root.data = predacessor(root);
                root.left = removerHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root){
        // find the least value below the right child of this root node
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private int predacessor(Node root){
        // find the greatest value below the left child of this root node 
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;        
    }
} 
// class node
class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data = data;
    }
}
