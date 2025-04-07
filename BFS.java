

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BFS{
    static void bfs(Node n){
         if(n==null){
            return;
         }
         System.out.print(n.data);
         bfs(n.left);
         bfs(n.right);
    }
    public static void main(String []args){
      Node n=new Node (0);
      n.left=new Node (1);
      n.right=new Node(2);
      n.left.left=new Node (3);
      n.left.right=new Node (4);
      n.right.left=new Node(5);
      n.right.right=new Node(6);
      bfs(n);
    }
}