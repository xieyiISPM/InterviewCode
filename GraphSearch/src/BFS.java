import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    public static void main(String[] args){

        Node<Integer> node40 = new Node(40);
        Node<Integer> node20 = new Node(20);
        Node<Integer> node50 = new Node(50);
        Node<Integer> node70 = new Node(70);
        Node<Integer> node10 = new Node(10);
        Node<Integer> node30 = new Node(30);
        Node<Integer> node60 = new Node(60);

        node40.addNeighbours(node20);
        node40.addNeighbours(node10);
        node20.addNeighbours(node10);
        node20.addNeighbours(node30);
        node20.addNeighbours(node60);
        node20.addNeighbours(node50);
        node50.addNeighbours(node70);
        node10.addNeighbours(node30);
        node30.addNeighbours(node60);
        node60.addNeighbours(node70);

        //bfs(node40);
        dfs(node40);

    }

    public static void bfs(Node node){
        Queue<Node> queue = new LinkedList<>();
        ((LinkedList<Node>) queue).add(node);

        while(!queue.isEmpty()){
            Node visitedNode = ((LinkedList<Node>) queue).removeFirst();
            //visitedNode.setAsVisited();
            List<Node> neighbours = visitedNode.getNeighbours();
            System.out.println("Vertex: " + visitedNode.getData());
            for(Node neighbourNode: neighbours){
                if(!neighbourNode.isVisited()){
                    queue.add(neighbourNode);
                    neighbourNode.setAsVisited();
                }
            }
        }
    }

    public static void dfs(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node visitedNode = (stack).pop();
            //visitedNode.setAsVisited();
            List<Node> neighbours = visitedNode.getNeighbours();
            System.out.println("Vertex: " + visitedNode.getData());
            for(Node neighbourNode: neighbours){
                if(!neighbourNode.isVisited()){
                    stack.push(neighbourNode);
                    neighbourNode.setAsVisited();
                }
            }
        }
    }
}
