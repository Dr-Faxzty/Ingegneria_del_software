public class BinaryTree implements IBinaryTree {
    private IBinaryTree left;  
    private IBinaryTree right;
    private final int key;

    public BinaryTree(int key) {
        this.left= NullTree.getInstance();
        this.right= NullTree.getInstance();
        this.key = key;
    }

    @Override
    public boolean containsKey(int key) {
        if (this.key == key) return true;
        
        if (this.key < key)
            return right.containsKey(key);
        else 
            return left.containsKey(key);
    }

    @Override
    public BinaryTree insertKey(int value) {
        if (value <= key) left = left.insertKey(value);
        else right = right.insertKey(value);
        return this;
    }

    @Override
    public String toString() { return toStringHelper("", true); }

    private String toStringHelper(String prefix, boolean isTail) {
        StringBuilder builder = new StringBuilder();

        if (!right.isNull()) {
            builder.append(((BinaryTree) right).toStringHelper(prefix + (isTail ? "│   " : "    "), false));
        }

        builder.append(prefix)
            .append(isTail ? "└── " : "┌── ")
            .append(key)
            .append("\n");

        if (!left.isNull()) {
            builder.append(((BinaryTree) left).toStringHelper(prefix + (isTail ? "    " : "│   "), true));
        }

        return builder.toString();
    }

    @Override
    public boolean isNull() { return false; }

    @Override
    public IBinaryTree left() { return this.left; }

    @Override
    public IBinaryTree right() { return this.right; }

    @Override
    public int key() { return this.key; }

    @Override
    public void accept(TreeVisitor visitor) { visitor.visit(this); }
}