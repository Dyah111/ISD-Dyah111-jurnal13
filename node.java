/*a. Kelas BSTNode:
      - Mewakili setiap node dalam BST dengan atribut data, left, dan right.  
    */

public class node <E extends Comparable<E>> {
    private node<E> leftNode;
    private E data;
    private node<E> rightNode;
    
    public node(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }
    
    public E getData() {
        return data;
    }
    
    public node<E> getLeftNode() {
        return leftNode;
    }
    
    public node<E> getRightNode() {
        return rightNode;
    }
    
    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) {
            if (leftNode == null) {
                leftNode = new node<E>(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new node<E>(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }
}
