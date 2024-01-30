package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    
    static class edge{
        
        int src, dest;
        
        edge(int src, int dest)
        {
            this.src=src;
            this.dest=dest;
        }
        
    }
    static void creategraph(ArrayList<edge> graph[], int v){
        for(int i=0; i<v; i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        
        graph[1].add(new edge(1, 0));
        
        graph[2].add(new edge(2, 0));
        
        
    }
    static void DFS(ArrayList<edge> graph[], int current,int size)
    {
        Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[size];
        
       st.push(0);
        
        
        while(!st.isEmpty())
        {
            int current =st.pop();
            if(vis[current]==false)
            {
                
                
            }
            
            
        }
        
    }
    
    
    public static void main(String[] args) {
        
        
        
        
        
        
        
    }
    
}
