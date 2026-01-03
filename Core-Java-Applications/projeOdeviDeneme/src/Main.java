import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> graph = Graph.createGraph();
        String startNode = "S";

        List<String> bfsResult = Graph.bfs(graph, startNode);
        System.out.println("BFS Sırası: " + String.join(" - ", bfsResult));

        List<String> dfsResult = Graph.dfs(graph, startNode);
        System.out.println("DFS Sırası: " + String.join(" - ", dfsResult));
    }
}
