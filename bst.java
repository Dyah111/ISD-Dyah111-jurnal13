public class bst<E extends Comparable<E>> {
    private node<E> root;
    
    public bst() {
        root = null;
    }
    
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new node<E>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }


    public void searchBst(E key) {
        boolean hasil = searchBSTHelper(root, key);
        if (hasil) 
            System.out.println("Data ditemukan");
        else
            System.out.println("Data tidak ditemukan");
    }

    public boolean searchBSTHelper(node<E> node, E key) {
        boolean result = false;

        if (node != null) {
            if (key.equals(node.getData()))
                result = true;
            else if (key.compareTo(node.getData()) < 0) 
                result = searchBSTHelper(node.getLeftNode(), key); 
            else 
                result = searchBSTHelper(node.getRightNode(), key);
        }
        return result;
    }
}
