package OpenAddressing;

public class HashTableApp {
    public static void main(String[] args) {
        HashTable table = new HashTable(15);

        table.insert(2);
        table.insert(15);
        table.insert(5);
        table.insert(11);
        table.insert(14);
        table.insert(1);
        table.insert(3);
        table.insert(10);
        table.insert(6);
        table.insert(4);
        table.displayTable();

        table.insert(7);
        table.insert(15);
        table.insert(8);
        table.insert(12);
        table.insert(13);
        table.displayTable();

        // System.out.println(table.find(15).getKey());
        // table.delete(15);
        table.displayTable();
    }
}
