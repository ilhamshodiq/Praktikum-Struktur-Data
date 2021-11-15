public class HeapApp {
    public static void main(String[] args){
        Heap testheap = new Heap(35);

        testheap.insert(150);
        testheap.insert(80);
        testheap.insert(75);
        testheap.insert(60);
        testheap.insert(50);
        testheap.insert(45);            
        testheap.insert(30);
        testheap.insert(22);
        testheap.insert(15);
        testheap.insert(12);
        testheap.insert(5);
        testheap.insert(3);
        
        
        // testheap.displayArray();
        testheap.displayHeap();                               
        testheap.change(2, 40);
        testheap.displayHeap();
    }
}
