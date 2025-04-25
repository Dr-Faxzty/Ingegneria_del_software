public interface IBinaryTree {
    boolean containsKey(int key);
    @Override
    String toString();
    IBinaryTree insertKey(int key);
    boolean isNull();
    IBinaryTree left();
    IBinaryTree right();
    int key();
    <T> T accept(TreeVisitor<T> visitor);
}