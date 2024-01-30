package Graph;

import java.util.ArrayList;

public class DepthFirstSearch_DFS {
 
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
    
    static void DFS(ArrayList<edge> graph[], int curr,boolean vis[])
    {
        System.out.print(curr+" ");
        vis[curr]=true;
        
        for(int i=0; i<graph[curr].size(); i++)
        {
            edge e=graph[curr].get(i);
            if(vis[e.dest]==false)
            {
                DFS(graph, e.dest, vis);
            }
        }
        
    }
    
    
    public static void main(String[] args) {
       int size=5;
       
        
        ArrayList<edge> graph[]=new ArrayList[size];
        
        creategraph(graph);
        boolean vis[]=new boolean[size];
        
        DFS(graph, 0, vis);
    }
    
}
