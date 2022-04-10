import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingConstants;

import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
public class JGraphX2 extends JFrame
{

    private static final long serialVersionUID = -2707712944901661771L;
    SimpleTreeNode<String> root = createSimpleTreeNode();

    public void fillGraphFromModel( mxGraph graph)  {
        graphUpdate();

        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try
        {
        Object vRoot = graph.insertVertex(parent, null, root.getData(), 80, 0, 80, 30);
        Object vChild1 = graph.insertVertex(parent, null,root.getChildren().get(0).getData() , 0, 0, 80, 30);
        Object vChild2 = graph.insertVertex(parent, null, root.getChildren().get(1).getData(), 0, 0, 80, 30);
        Object vChild3 = graph.insertVertex(parent, null, root.getChildren().get(2).getData(), 0, 0, 80, 30);
        Object vChild4 = graph.insertVertex(parent, null, root.getChildren().get(3).getData(), 0, 0, 80, 30);
        Object vChild5 = graph.insertVertex(parent, null, root.getChildren().get(4).getData(), 0, 0, 80, 30);
      //  Object v7 = graph.insertVertex(parent, null, root.getChildren().get(5).getData(), 0, 0, 80, 30);
        Object vGrandChild1 = graph.insertVertex(null, null, "Chicken Wings", 0,0,90,30);
        Object vGrandChild2 = graph.insertVertex(null, null, "Cheese Strips", 0,0,90,30);
        Object vGrandChild3 = graph.insertVertex(null, null, "Russian Salad", 0,0,90,30);
        Object vGrandChild4 = graph.insertVertex(null, null, "Macronni Salad", 0,0,90,30);
        Object vGrandChild5 = graph.insertVertex(null, null, "Cream Salad", 0,0,90,30);
        Object vGrandChild6 = graph.insertVertex(null, null, "Chicken", 0,0,90,30);
        Object vGrandChild7 = graph.insertVertex(null, null, "Beef", 0,0,90,30);
        Object vGrandChild8 = graph.insertVertex(null, null, "Cream Cakes", 0,0,90,30);
        Object vGrandChild9 = graph.insertVertex(null, null, "Dry Cakes", 0,0,90,30);
        Object vGrandChild10 = graph.insertVertex(null, null, "Chocolate Chip", 0,0,90,30);
        Object vGrandChild11 = graph.insertVertex(null, null, "Red Velvet", 0,0,90,30);
        Object vGrandChild12 = graph.insertVertex(null, null, "Nutella Filled", 0,0,90,30);
        Object vGrandGrandChild1 = graph.insertVertex(null, null, "Pan Asian", 0,0,100,30);
        Object vGrandGrandChild2 = graph.insertVertex(null, null, "Grilled", 0,0,100,30);
        Object vGrandGrandChild3 = graph.insertVertex(null, null, "Zinger", 0,0,100,30);
        Object vGrandGrandChild4 = graph.insertVertex(null, null, "Grilled", 0,0,100,30);
        Object vGrandGrandChild5 = graph.insertVertex(null, null, "Mighty Hulk", 0,0,100,30);
        Object vGrandGrandChild6 = graph.insertVertex(null, null, "Cheese Melt", 0,0,100,30);
        Object vGrandGrandChild7 = graph.insertVertex(null, null, "Oreo Cake", 0,0,100,30);
        Object vGrandGrandChild8 = graph.insertVertex(null, null, "Kitkat Cake", 0,0,100,30);
        Object vGrandGrandChild9 = graph.insertVertex(null, null, "Peanut Cake", 0,0,100,30);
        Object vGrandGrandChild10 = graph.insertVertex(null, null, "Ginger Cake", 0,0,100,30);
        graph.insertEdge(parent, null, "", vRoot, vChild1);
        graph.insertEdge(parent, null, "", vRoot, vChild2);
        graph.insertEdge(parent, null, "", vRoot, vChild3);
        graph.insertEdge(parent, null, "", vRoot, vChild4);
        graph.insertEdge(parent, null, "", vRoot, vChild5);
     //   graph.insertEdge(parent, null, "", vRoot, v7);
        graph.insertEdge(vChild1, null, "", vChild1, vGrandChild1);
        graph.insertEdge(vChild1, null, "", vChild1, vGrandChild2);
        graph.insertEdge(vChild2, null, "",vChild2, vGrandChild3);
        graph.insertEdge(vChild2, null, "", vChild2, vGrandChild4);
        graph.insertEdge(vChild2, null, "", vChild2, vGrandChild5);
        graph.insertEdge(vChild3, null, "", vChild3, vGrandChild6);
        graph.insertEdge(vChild3, null, "", vChild3, vGrandChild7);
        graph.insertEdge(vChild4, null, "", vChild4, vGrandChild8);
        graph.insertEdge(vChild4, null, "", vChild4, vGrandChild9);
        graph.insertEdge(vChild5, null, "", vChild5, vGrandChild10);
        graph.insertEdge(vChild5, null, "", vChild5, vGrandChild11);
        graph.insertEdge(vChild5, null, "", vChild5, vGrandChild12);
        graph.insertEdge(vGrandChild6, null, "", vGrandChild6, vGrandGrandChild1);
        graph.insertEdge(vGrandChild6, null, "", vGrandChild6, vGrandGrandChild2);
        graph.insertEdge(vGrandChild6, null, "", vGrandChild6, vGrandGrandChild3);
        graph.insertEdge(vGrandChild7, null, "", vGrandChild7, vGrandGrandChild4);
        graph.insertEdge(vGrandChild7, null, "", vGrandChild7, vGrandGrandChild5);
        graph.insertEdge(vGrandChild7, null, "", vGrandChild7, vGrandGrandChild6);
        graph.insertEdge(vGrandChild8, null, "", vGrandChild8, vGrandGrandChild7);
        graph.insertEdge(vGrandChild8, null, "", vGrandChild8, vGrandGrandChild8);
        graph.insertEdge(vGrandChild9, null, "", vGrandChild9, vGrandGrandChild9);
        graph.insertEdge(vGrandChild9, null, "", vGrandChild9, vGrandGrandChild10);
            mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
            layout.setUseBoundingBox(false);

            layout.execute(parent);
        }
        finally
        {
            graph.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
    }

    public JGraphX2()
    {
        super("Simple Tree Node");
        mxGraph graph = new mxGraph();
        fillGraphFromModel(graph);
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);


    }

    public SimpleTreeNode<String> createSimpleTreeNode() {
        root = new SimpleTreeNode<>("Menu");

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
        return root;
    }


    // Backup not used
    public void graphUpdate() {
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try
        {
            //Notice that the parent is the default parent...
            //The hierarchical structure looks great but I cannot collapse/expand the tree.
            Object vDogsRoot = graph.insertVertex(parent, null, "Whale", 80, 0, 80, 30);
            Object v2 = graph.insertVertex(parent, null, "Shar Pei", 0, 0, 80, 30);
            Object v3 = graph.insertVertex(parent, null, "Pug", 0, 0, 80, 30);
            Object v4 = graph.insertVertex(parent, null, "Cocker Spaniel", 0, 0, 80, 30);
            Object v5 = graph.insertVertex(parent, null, "Pit Bull", 0, 0, 80, 30);
            Object v6 = graph.insertVertex(parent, null, "Chihuahua", 0, 0, 80, 30);
            Object v7 = graph.insertVertex(null, null, "GrandPuppy", 0,0,90,30);
            Object v8 = graph.insertVertex(null, null, "GrandPuppy2", 0,0,90,30);
            Object v9 = graph.insertVertex(null, null, "GrandPuppy3", 0,0,90,30);
            graph.insertEdge(parent, null, "", vDogsRoot, v2);
            graph.insertEdge(parent, null, "", vDogsRoot, v3);
            graph.insertEdge(parent, null, "", vDogsRoot, v4);
            graph.insertEdge(parent, null, "", vDogsRoot, v5);
            graph.insertEdge(parent, null, "", vDogsRoot, v6);
            graph.insertEdge(v6, null, "", v6, v7);
            graph.insertEdge(v6, null, "", v6, v8);
            graph.insertEdge(v6, null, "", v6, v9);

            mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
            layout.setUseBoundingBox(false);

            layout.execute(parent);
        }
        finally
        {
            graph.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);
    }

    public static void main(String[] args)
    {
        JGraphX2 frame = new JGraphX2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 420);
        frame.setVisible(true);
    }

}