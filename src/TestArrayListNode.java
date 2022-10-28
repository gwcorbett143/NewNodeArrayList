public class TestArrayListNode {
    public static void main(String[] args) {
        NewNodeArrayList n = new NewNodeArrayList();

        Node node = new Node();

        n.add(node);
        n.add(0,node);
        System.out.println(n.get(0));
        System.out.println(n.size());
        n.remove(0);
        System.out.println(n.size());
        n.add(node);
        n.add(node);
        n.add(node);
        System.out.println(n.size());
        n.remove(3);
        System.out.println(n.size());
        n.remove(0);
        System.out.println(n.size());
        n.add(1,node);
        System.out.println(n.size());

    }
}
