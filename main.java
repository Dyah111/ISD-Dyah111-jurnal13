public class main {
    public static void main(String[] args) {
        bst<Character> search = new bst();

        search.insertNode('F');
        search.insertNode('E');
        search.insertNode('H');
        search.insertNode('D');
        search.insertNode('G');
        search.insertNode('C');
        search.insertNode('B');
        search.insertNode('H');
        search.insertNode('K');
        search.insertNode('J');

        System.out.println("Hasil pencarian: ");
        search.searchBst('K');
        search.searchBst('A');
    }
}
