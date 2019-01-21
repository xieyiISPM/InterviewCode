import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T data;
    List<Node> neighbourNodeList;
    boolean visited = false;
    public Node(T data){
        this.data = data;
        this.neighbourNodeList = new ArrayList<>();
    }

    public void addNeighbours(Node newNode){
        neighbourNodeList.add(newNode);
    }

    public List<Node> getNeighbours(){
        return neighbourNodeList;
    }

    public void  setAsVisited(){
        this.visited = true;
    }

    public T getData(){
        return data;
    }

    public boolean isVisited(){
        return visited;
    }
}
