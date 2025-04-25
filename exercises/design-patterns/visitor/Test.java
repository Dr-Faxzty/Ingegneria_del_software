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
    
        ListCollectorVisitor visitor = new ListCollectorVisitor(TraversalOrder.PRE_ORDER);
        myTree.accept(visitor);
        System.out.println("PreOrder: " + visitor.getResult());

        visitor = new ListCollectorVisitor(TraversalOrder.IN_ORDER);
        myTree.accept(visitor);
        System.out.println("InOrder: " + visitor.getResult());

        visitor = new ListCollectorVisitor(TraversalOrder.POST_ORDER);
        myTree.accept(visitor);
        System.out.println("PostOrder: " + visitor.getResult());
    }
}