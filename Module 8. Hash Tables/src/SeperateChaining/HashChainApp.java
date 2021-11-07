package SeperateChaining;

public class HashChainApp {
    public static void main(String[] args) {
        HashTable table = new HashTable(15);

        table.insert(5);
        table.insert(31);
        table.insert(1);
        table.insert(15);
        table.insert(15);
        table.insert(0);
        table.insert(2);
        table.insert(16);
        table.insert(3);
        table.displayTable();
    }
}
