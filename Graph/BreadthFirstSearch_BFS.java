package Graph;

import java.util.*;

public class BreadthFirstSearch_BFS {
    
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
    
    public static void BFS( ArrayList<edge> graph[], int V)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(0);
        
        while(!q.isEmpty())
        {
            int current=q.remove();
            if(vis[current]==false)
            {
                System.out.print(current+" ");
                vis[current]=true;
                
                for(int i=0; i<graph[current].size(); i++ )
                {
                    edge e=graph[current].get(i);
                    q.add(e.dest);
                }
            }
        }
        
    }
    public static void main(String[] args) {
       int size=5;
       
        
        ArrayList<edge> graph[]=new ArrayList[size];
        
        creategraph(graph);
        BFS(graph, size);
        
    }
    
}
