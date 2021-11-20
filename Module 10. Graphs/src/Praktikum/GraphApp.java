package Praktikum;

public class GraphApp {
    public static void main(String[] args) {

        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4

        theGraph.addEdge(0, 2); // AB
        theGraph.addEdge(1, 0); // BA
        theGraph.addEdge(1, 4); // BE
        theGraph.addEdge(3, 4); // DE
        theGraph.addEdge(4, 2); // DC

        theGraph.display();        
        theGraph.dfs();        


        //no 3 topologi sorting
        System.out.println("===============================");
        Graph theGraph2 = new Graph();
        theGraph2.addVertex('A'); //0
        theGraph2.addVertex('B'); //1
        theGraph2.addVertex('C'); //2
        theGraph2.addVertex('D'); //3
        theGraph2.addVertex('E'); //4
        theGraph2.addVertex('F'); //5
        theGraph2.addVertex('G'); //6
        theGraph2.addVertex('H'); //7
        
        theGraph2.addEdge(0,3); //AD
        theGraph2.addEdge(0,4); //AE
        theGraph2.addEdge(1,4); //BE
        theGraph2.addEdge(2,5); //CF
        theGraph2.addEdge(3,6); //DG
        theGraph2.addEdge(4,6); //EG
        theGraph2.addEdge(5,7); //FH
        theGraph2.addEdge(6,7); //GH
               
        theGraph2.topo();
    }

}
