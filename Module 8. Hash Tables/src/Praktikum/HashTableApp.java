package Praktikum;

public class HashTableApp {
    public static void main(String[] args) {
        HashTable table = new HashTable(15);
        table.insert(5);
        table.insert(4);
        table.insert(0);
        table.insert(1);
        table.insert(2);
        table.insert(3);        
        table.insert(14);
        table.insert(16);
        table.insert(21);         
        table.insert(333);
        table.insert(121);        
        table.insert(70);
        table.insert(69);
        table.displayTable();
    }
}
