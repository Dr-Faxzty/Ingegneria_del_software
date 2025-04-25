public class SumVisitor implements TreeVisitor<Integer> {
    @Override
    public Integer visit(BinaryTree tree) {
        return tree.key() 
            + tree.left().accept(this) 
            + tree.right().accept(this);
    }

    @Override
    public Integer visit(NullTree tree) { return 0; }
}