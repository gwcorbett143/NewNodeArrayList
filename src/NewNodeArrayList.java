
public class NewNodeArrayList <N> {

    private Node root; // creating instance variables
    private int length = 1;

    public NewNodeArrayList (){ // creating an empty constructor
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

    public N remove(int index) { // creating a remove method
        Node temp = root; // creating a temporary node
        Node parent = root; // creating a node to store the parent of the temp
        Node child = root; // creating a node to store the child of the temp
        for (int i = 0; i <= index; i++) { // looping though to find the node at the index
            temp = temp.getChild();
        }
        if (temp.getParent() != null && temp.getChild() != null) { // creating an if statement when the node has a parent and child
            parent = temp.getParent(); // setting the parent to be the parent of the temp
            child = temp.getChild(); // setting the child of temp to child
            parent.setChild(child); // setting the new child of parent to child

        } else if (temp.getChild() != null) { // creating an if statement if the node does not have a parent
            temp.getParent().setChild(null);
        } else if (temp.getParent() != null) {
            temp.getChild().setParent(null); // creating an if statement if the node does not have a child
        }
        return (N) temp.getData(); // returning the temp node data;
    }

        public N get ( int index){ //returns the node at an index
            Node temp = root; //creating a temporary node
            for (int i = 0; i <= index; i++) { //loops through array
                temp = temp.getChild(); //setting to most recent node at index i
            }
            return (N) temp.getData(); //returns the node at index
        }

        void set ( int index, N data){ //sets a node at an index
            Node temp = root;  //creating a temporary node
            for (int i = 0; i <= index; i++) { //loops through array until index
                temp = temp.getChild(); //setting to most recent node at index i
            }
            temp.setData(data); //sets node at index to data
        }

        public int size () { //returns sixe of index
            int size = 0; //starts at 0 as default
            for (int i = 0; i != -1; i++) { //loops through until there are no more buckets
                size++; //increases the size by bucket
            }
            return size; //returns the int of the size
        }
}

