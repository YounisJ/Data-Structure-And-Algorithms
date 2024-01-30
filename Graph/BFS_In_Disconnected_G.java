package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_In_Disconnected_G {
    
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
       0----1----- 2
             
       3-----4
        
       5-----6
       */
        graph[0].add(new edge(0, 1));
        
        graph[1].add(new edge(1, 2));
        
        graph[2].add(new edge(2, 1));
        
        graph[3].add(new edge(3, 4));
        
        graph[4].add(new edge(4, 3));

        graph[5].add(new edge(5, 6));
        
        
        
    }
    
    public static void BFS( ArrayList<edge> graph[], int V, boolean vis[],int start)
    {
        Queue<Integer> q=new LinkedList<>();
        
        q.add(start);
        
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
       int size=7;
       
        
        ArrayList<edge> graph[]=new ArrayList[size];
        
        creategraph(graph);
        
        boolean vis[]=new boolean[size];
        
        /* For Disconnected Graph Using loop of total vertice
           so that we can find out which vertex is not visited */
        
        for(int i=0; i<size; i++)
        {
            if(vis[i]==false)
            {    
              BFS(graph, size,vis,i);
            }
        }
        
    }
    
}
