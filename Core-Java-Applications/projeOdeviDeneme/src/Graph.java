import java.util.*;

public class Graph {

    public static Map<String, List<String>> createGraph() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("S", Arrays.asList("1", "2"));
        graph.put("1", Arrays.asList("S", "2", "3", "4"));
        graph.put("2", Arrays.asList("S", "1", "3"));
        graph.put("3", Arrays.asList("1", "2", "4", "5", "6"));
        graph.put("4", Arrays.asList("1", "3", "6", "7"));
        graph.put("5", Arrays.asList("3", "6"));
        graph.put("6", Arrays.asList("3", "4", "5"));
        graph.put("7", Arrays.asList("4"));
        return graph;
    }

    public static List<String> bfs(Map<String, List<String>> graph, String startNode) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        List<String> traversalOrder = new ArrayList<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();
            traversalOrder.add(currentNode);

            List<String> neighbors = graph.getOrDefault(currentNode, Collections.emptyList());
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return traversalOrder;
    }

    public static List<String> dfs(Map<String, List<String>> graph, String startNode) {
        List<String> traversalOrder = new ArrayList<>();
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();

        stack.push(startNode);
        while (!stack.isEmpty()) {
            String currentNode = stack.pop();
            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                traversalOrder.add(currentNode);
                List<String> neighbors = graph.getOrDefault(currentNode, Collections.emptyList());
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    String neighbor = neighbors.get(i);
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return traversalOrder;
    }
}