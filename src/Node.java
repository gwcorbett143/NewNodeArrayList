public class Node<N> {

    // variables
    private Node parent; // creating private variables to store in the node type
    private Node child;
    private N data;

    // constructors
    public Node () {} // creating an empty constructor

    public Node (N data){ // creating a data note constructor
        this.data = data;
    } // creating a constructor to se the node data

    public Node (Node parent, Node child, N data){ // creating a constructor to read in the variables
        this.parent = parent;
        this.child = child;
        this.data = data;
    }

    // methods
    // accessors
    public Node<N> getParent(){ // creating a get parent accessor method
        return parent; // accesing parent
    }

    public Node<N> getChild(){ // creating a get child accessor method
        return child; // accessing child
    }

    public N getData(){ // creating a get data accessor method
        return this.data; // accessing data
    }

    // mutators
    public void setParent(Node<N> parent){ // creating a mutator method for the parent variable
        this.parent = parent; //setting parent
        if (parent.getChild() != this)
            parent.setChild(this);
    }

    public void setChild(Node<N> child){ // creating a mutator method for the child variable
        this.child = child; // setting child
        if(child.getParent() != this)
            child.setParent(this);
    }

    public void setData(N data){ // creating a mutator method for the data variable
        this.data = data; // setting data
    }

    // other methods
    public String toString() { // creating a .toString method for the node class
        String print = ""+ data;
        return print; // creating the format of the printes string
    }

    public boolean equals(Node node1, Node node2){ // creating an .equals method for the node class
        if (node1.getData() == node2.getData()){ // checking if the data is equal
            return true;
        } else {
            return false;
        }
    }

}
