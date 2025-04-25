public class CountVisitor implements TreeVisitor<Integer> {
    @Override
    public Integer visit(BinaryTree tree) {
        return 1 + tree.left().accept(this) + tree.right().accept(this);
    }

    @Override
    public Integer visit(NullTree tree) {
        return 0;
    }
}
