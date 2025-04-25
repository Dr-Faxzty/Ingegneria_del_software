import java.util.ArrayList;
import java.util.List;


public class ListCollectorVisitor implements TreeVisitor {
    private final List<Integer> list = new ArrayList<>();
    private final TraversalOrder order;

    public ListCollectorVisitor(TraversalOrder order) { this.order = order; }

    public List<Integer> getResult() { return list; }

    @Override
    public void visit(BinaryTree tree) {
        switch (order) {
            case PRE_ORDER -> {
                list.add(tree.key());
                tree.left().accept(this);
                tree.right().accept(this);
            }
            case IN_ORDER -> {
                tree.left().accept(this);
                list.add(tree.key());
                tree.right().accept(this);
            }
            case POST_ORDER -> {
                tree.left().accept(this);
                tree.right().accept(this);
                list.add(tree.key());
            }
        }
    }

    @Override
    public void visit(NullTree tree) {}
}
