package leetcode_work;

import java.util.List;
import java.util.ArrayList;

class Node {
  public int val;
  public List<Node> neighbors;
  public Node() {
    val = 0;
    neighbors = new ArrayList<Node>();
  }
  public Node(int _val) {
    val = _val;
    neighbors = new ArrayList<Node>();
  }
  public Node(int _val, ArrayList<Node> _neighbors) {
    val = _val;
    neighbors = _neighbors;
  }
}

public class Clone_Graph {
  public static Node cloneGraphHelper(Node node, Node[] createdNodes) {
    Node curr_node = createdNodes[node.val-1];
    if(curr_node != null) { return curr_node; }
    curr_node = new Node(node.val-1);
    createdNodes[node.val] = curr_node;
    List<Node> neighbors = node.neighbors;
    for(int i = 0; i < neighbors.size(); i++) {
      Node neighborClone = cloneGraphHelper(neighbors.get(i), createdNodes);
      curr_node.neighbors.add(neighborClone);
    }
    return curr_node;
  }
  public static Node cloneGraph(Node node) {
    if(node == null) return null;
    Node[] createdNodes = new Node[100];
    return cloneGraphHelper(node, createdNodes);
  }
}
