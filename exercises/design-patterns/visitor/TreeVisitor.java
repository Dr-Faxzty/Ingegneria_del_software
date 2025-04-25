public interface TreeVisitor<T> {
    T visit(BinaryTree tree);
    T visit(NullTree tree);
}