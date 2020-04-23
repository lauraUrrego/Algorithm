package com.graphs;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Execute {
	
	
	static Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }
	
	  static Set<String> depthFirstTraversal(Graph graph, String root) {
	        Set<String> visited = new LinkedHashSet<String>();
	        Stack<String> stack = new Stack<String>();
	        stack.push(root);
	        while (!stack.isEmpty()) {
	            String vertex = stack.pop();
	            if (!visited.contains(vertex)) {
	                visited.add(vertex);
	                for (Vertex v : graph.getAdjVertices(vertex)) {              
	                    stack.push(v.label);
	                }
	            }
	        }
	        return visited;
	    }
	    
	    static Set<String> breadthFirstTraversal(Graph graph, String root) {
	        Set<String> visited = new LinkedHashSet<String>();
	        Queue<String> queue = new LinkedList<String>();
	        queue.add(root);
	        visited.add(root);
	        while (!queue.isEmpty()) {
	            String vertex = queue.poll();
	            for (Vertex v : graph.getAdjVertices(vertex)) {
	                if (!visited.contains(v.label)) {
	                    visited.add(v.label);
	                    queue.add(v.label);
	                }
	            }
	        }
	        return visited;
	    }

	public static void main(String[] args) {
		Graph g= Execute.createGraph();
		
		Set<String> dft = Execute.depthFirstTraversal(g,"Bob");
		Set<String> bft = Execute.breadthFirstTraversal(g,"Bob");
		
		for (String s : dft) {
			System.out.println(s);
		}
		System.out.println("\n //////////////////// \n");
		for (String s : bft) {
			System.out.println(s);
		}
		

	}

}
