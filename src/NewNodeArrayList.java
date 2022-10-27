public class NewNodeArrayList <N> {

    private Node root; // creating instance variables
    private int length = 1;

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

