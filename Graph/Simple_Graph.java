package Graph;

import java.util.ArrayList;

public class Simple_Graph {
    
    static class edge{
        int src;
        int dest;
        
        public edge(int s, int d)
        {
            this.src=s;
            this.dest=d;
        }
         
    }
    
    static void creategraph(ArrayList<edge> graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i]=new ArrayList<edge>();
        }
        
        
        
        /*
       0----1----- 4
           /     /
         /     /
       2-----3
       */
        graph[0].add(new edge(0, 1));
        
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 4));
        
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));
        
        graph[3].add(new edge(3, 2));
        graph[3].add(new edge(3, 4));
        
        graph[4].add(new edge(4, 1));
        graph[4].add(new edge(4, 3));
        
       
    }
    //Method For Checking Neighbours
    static void CheckNeighbourOf(ArrayList<edge> graph[],int Src)
    {
        
        for(int i=0; i<graph[Src].size(); i++)
        {
            edge e=graph[Src].get(i);
            System.out.println(e.dest);
            
        }
    }
    
    public static void main(String[] args) {
        
        int size=6;
        
        ArrayList<edge> graph[]=new ArrayList[size];
        
        creategraph(graph);
        
        //Check Neighbours to confirm the graph
        CheckNeighbourOf(graph, 2);
        
    }
}