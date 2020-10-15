import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }

        
        Queue<Node> topQueue = new LinkedList<>();
        Queue<Node> bottomQueue = new LinkedList<>();
        root.next = null;
        topQueue.offer(root);
        
        while (! topQueue.isEmpty()){
            while(!topQueue.isEmpty()){//�����һ���Ԫ�ء�
                Node temp = topQueue.poll();
                if(temp.left != null)
                    bottomQueue.offer(temp.left);
                if(temp.right != null)
                    bottomQueue.offer(temp.right);
            }
            Node preNode = bottomQueue.poll();
            while( preNode != null ){//��bottom�е�Ԫ��ת����top��������ÿ��Ԫ�ص�nextָ��
                Node nextNode = bottomQueue.poll();
                preNode.next = nextNode;
                topQueue.offer(preNode);
                preNode = nextNode;
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Queue<Node> topQueue = new LinkedList<>();
        
        System.out.println("topQueue:"+(topQueue.poll()==null));
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};