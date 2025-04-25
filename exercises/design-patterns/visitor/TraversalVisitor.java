import java.util.ArrayList;
import java.util.List;


public class TraversalVisitor implements TreeVisitor<List<Integer>> {
    private final TraversalOrder order;

    public TraversalVisitor(TraversalOrder order) { this.order = order; }

    @Override
    public List<Integer> visit(BinaryTree tree) {
        List<Integer> result = new ArrayList<>();
        switch (order) {
            case PRE_ORDER -> {
                result.add(tree.key());
                result.addAll(tree.left().accept(this));
                result.addAll(tree.right().accept(this));
            }
            case IN_ORDER -> {
                result.addAll(tree.left().accept(this));
                result.add(tree.key());
                result.addAll(tree.right().accept(this));
            }
            case POST_ORDER -> {
                result.addAll(tree.left().accept(this));
                result.addAll(tree.right().accept(this));
                result.add(tree.key());
            }
        }

        return result;
    }

    @Override
    public List<Integer> visit(NullTree tree) { return new ArrayList<>(); }
}
