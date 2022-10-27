public class NewNodeArrayList <N> {

    private Node root; // creating instance variables
    private int length = 1;


    public ArrayListNode (){ // creating an empty constructor
        this.root = root;
    }

    boolean add (Node bucket){ // creating an add boolean method
        Node temp = root; // adding a temporary Node to keep track of the last node
        while (temp.getChild() != null) { // looping through all the filled nodes
            temp = temp.getChild(); // setting the temp to the latest node
            length += 1;
        }
        temp.setChild(bucket); // adding to the last node
        return true; // returning true
    }

    void add (int index, Node bucket){ // creating a method to set the index of the node
        Node temp = root; // creating a temporary node
        for (int i = 0; i <= index; i++){ // looping through the nodes until the last one before the index
            temp = temp.getChild(); // updating the temp node
        }
        temp.setChild(bucket); // setting the node to its index
    }

    public N remove(int index){ // creating a remove method
        Node temp = root; // creating a temporary node
        Node parent = root; // creating a node to store the parent of the temp
        Node child = root; // creating a node to store the child of the temp
        for (int i = 0; i <= index; i++){ // looping though to find the node at the index
            temp = temp.getChild();
        }
        if (temp.getParent() != null && temp.getChild() != null){ // creating an if statement when the node has a parent and child
            parent = temp.getParent(); // setting the parent to be the parent of the temp
            child = temp.getChild(); // setting the child of temp to child
            parent.setChild(child); // setting the new child of parent to child

        } else if (temp.getChild() != null){ // creating an if statement if the node does not have a parent
            temp.getParent().setChild(null);
        } else if (temp.getParent() != null){
            temp.getChild().setParent(null); // creating an if statement if the node does not have a child
        }
        return (N)temp.getData(); // returning the temp node data;

    public N get(int index){
        Node temp = root;
        for (int i = 0; i <= index; i++){
            temp = temp.getChild();
        }
        return (N)temp.getData();
    }

    void set(int index, N data){
        Node temp = root;
        for (int i = 0; i <= index; i++){
            temp = temp.getChild();
        }
        temp.setData(data);
    }

    public int size(){
        int size = 0;
        for(int i = 0; i != -1; i++){
            size++;
        }
        return size;
    }
}

