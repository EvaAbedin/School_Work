import java.util.*;

public class SimpleTreeNode<T>{
    private T data = null;  // name or other data about node
    private List<SimpleTreeNode> children = new ArrayList<>();
    private SimpleTreeNode parent = null;

    public SimpleTreeNode(T data) {
        this.data = data;
    }

    public void addChild(SimpleTreeNode child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        SimpleTreeNode<T> newChild = new SimpleTreeNode<>(data);
        this.addChild(newChild);
    }

    public void addChildren(List<SimpleTreeNode> children) {
        for(SimpleTreeNode t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<SimpleTreeNode> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(SimpleTreeNode parent) {
        this.parent = parent;
    }

    public SimpleTreeNode getParent() {
        return parent;
    }

    public  String getParents(SimpleTreeNode node)
    {
        Deque stack = new LinkedList<SimpleTreeNode>();
        String path="";
        SimpleTreeNode parentNode = node.getParent();
        while (parentNode != null)
        {
            stack.push(parentNode);
            parentNode = parentNode.getParent();
        }
        Iterator<SimpleTreeNode> itr = stack.iterator();
        while (itr.hasNext()) {
            path = path + ((SimpleTreeNode) itr.next()).data + ":";
        }
        return path;
    }

    //  Recursive methods to print multi-level tree
    public void printChildren(SimpleTreeNode node) {
        if (node.parent != null) {
            if (node.children.size() == 0) {
                System.out.println(node.getParents((SimpleTreeNode) node) + ((SimpleTreeNode) node).data);
            } else {
                for (Object child : node.getChildren()) {
                    System.out.println(node.getParents((SimpleTreeNode) child) + ((SimpleTreeNode) child).data);
                    for (Object childOfChild : ((SimpleTreeNode) child).getChildren())
                        printChildren((SimpleTreeNode) childOfChild);
                }
            }
        }
        //       System.out.println(node.data);
    }

    public static void main(String[] args) {
        SimpleTreeNode<String> root = new SimpleTreeNode<>("Menu");

        SimpleTreeNode<String> child1 = new SimpleTreeNode<>("Appetizers");
        child1.addChild("Chicken Wings");
        child1.addChild("Cheese Strips");

        SimpleTreeNode<String> child2 = new SimpleTreeNode<>("Salads");
        child2.addChild("Russian Salad");
        child2.addChild("Macronni Salad");
        child2.addChild("Cream Salad");

        root.addChild(child1);
        root.addChild(child2);
        SimpleTreeNode<String> child3 = new SimpleTreeNode<>("Burgers");
        root.addChild(child3);
        SimpleTreeNode<String> g1child3 =  new SimpleTreeNode<>("Chicken");
        SimpleTreeNode<String> g2child3 = new SimpleTreeNode<>("Beef");
        child3.addChild(g1child3);
        child3.addChild(g2child3);
        g1child3.addChild(new SimpleTreeNode<>("Pan Asian"));
        g1child3.addChild(new SimpleTreeNode<>("Grilled"));
        g1child3.addChild(new SimpleTreeNode<>("Zinger"));
        g2child3.addChild(new SimpleTreeNode<>("Grilled"));
        g2child3.addChild(new SimpleTreeNode<>("Mighty Hulk"));
        g2child3.addChild(new SimpleTreeNode<>("Cheese Melt"));

        SimpleTreeNode<String> child4 = new SimpleTreeNode<>("Cakes");
        root.addChild(child4);
        SimpleTreeNode<String> g1child4 =  new SimpleTreeNode<>("Cream Cakes");
        SimpleTreeNode<String> g2child4 = new SimpleTreeNode<>("Dry Cakes");
        child4.addChild(g1child4);
        child4.addChild(g2child4);
        g1child4.addChild(new SimpleTreeNode<>("Oreo Cake"));
        g1child4.addChild(new SimpleTreeNode<>("Kitkat Cake"));
        g2child4.addChild(new SimpleTreeNode<>("Peanut Cake"));
        g2child4.addChild(new SimpleTreeNode<>("Ginger Cake"));

        SimpleTreeNode<String> child5 = new SimpleTreeNode<>("Cookies");
        root.addChild(child5);
        child5.addChild(new SimpleTreeNode<>("Chocolate Chip"));
        child5.addChild(new SimpleTreeNode<>("Red Velvet"));
        child5.addChild(new SimpleTreeNode<>("Nutella Filled"));
        for (SimpleTreeNode child: root.getChildren()) {
            root.printChildren(child);
        }
    }
}
