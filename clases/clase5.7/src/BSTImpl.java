public class BSTImpl<T extends Comparable<T>> implements BST<T>{

    private TreeNode<T> root;

    @Override
    public void insert(T value) {
        root = insert(value, root);
    }

    private TreeNode<T> insert(T value, TreeNode<T> subTree) {
        TreeNode<T> elementToAdd = new TreeNode<>(value);

        if (subTree == null) {
            return elementToAdd;
        } else {

            if (value.compareTo(subTree.getValue()) > 0) { // eq value > root.getValue()

                TreeNode<T> newRight = insert(value, subTree.getRight());
                subTree.setRight(newRight);

                return subTree;

            } else if (value.compareTo(subTree.getValue()) < 0) {
                TreeNode<T> newLeft = insert(value, subTree.getLeft());
                subTree.setLeft(newLeft);

                return subTree;
            }

        }

        return null;
    }

    @Override
    public void delete(T value) {

    }

    @Override
    public boolean exists(T value) {

        return exists(value, root);
    }

    private boolean exists(T value, TreeNode<T> subTree) {
        boolean exists = false;

        if (subTree != null) {

            if (value.compareTo(subTree.getValue()) == 0) {

                exists = true;

            } else if (value.compareTo(subTree.getValue()) > 0) {

                exists = exists(value, subTree.getRight());

            } else {
                exists = exists(value, subTree.getLeft());
            }

        }

        return exists;
    }

    @Override
    public int size() {
        return 0;
    }
}
