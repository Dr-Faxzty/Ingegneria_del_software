public class Test {
    public static void main(String[] args) {
        IBinaryTree myTree = new BinaryTree(5);

        myTree.insertKey(3);
        myTree.insertKey(7);
        myTree.insertKey(2);
        myTree.insertKey(4);
        myTree.insertKey(6);
        myTree.insertKey(8);
       
        System.out.println(myTree.toString());
    
        TraversalVisitor pre = new TraversalVisitor(TraversalOrder.PRE_ORDER);
        TraversalVisitor in = new TraversalVisitor(TraversalOrder.IN_ORDER);
        TraversalVisitor post = new TraversalVisitor(TraversalOrder.POST_ORDER);

        System.out.println("PreOrder: " + myTree.accept(pre));
        System.out.println("InOrder: " + myTree.accept(in));
        System.out.println("PostOrder: " + myTree.accept(post));

        CountVisitor count = new CountVisitor();
        System.out.println("Number of nodes: " + myTree.accept(count));

        SumVisitor sum = new SumVisitor();
        System.out.println("Sum of all nodes keys: " + myTree.accept(sum));
    }
}