import java.util.NoSuchElementException;

public class NullTree implements IBinaryTree {
    private static NullTree instance;

    static NullTree getInstance() {
        if (instance == null) {
            instance = new NullTree();
        }
        return instance;
    }

    @Override
    public boolean containsKey(int key) { return false; }

    @Override
    public String toString() { return ""; }; 

    @Override
    public BinaryTree insertKey(int key) { return new BinaryTree(key); }

    @Override
    public boolean isNull() { return true; }

    @Override
    public IBinaryTree left() { throw new NoSuchElementException("Null Trees have no 'left'"); }

    @Override
    public IBinaryTree right() { throw new NoSuchElementException("Null Trees have no 'right'"); }

    @Override
    public int key() { throw new NoSuchElementException("Null Trees have no 'key'"); }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) { return visitor.visit(this); }
}