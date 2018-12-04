package myADT.二叉查找树;

public class BST<Key extends Comparable<Key>,Value> {
    private Node root;
    private class Node{
        Key key;
        Value val;
        Node left;
        Node right;
        //int N;

        /*Node(Key key,Value val,int N){
            this.key=key;
            this.val=val;
            this.N=N;
        }*/
        Node(Key key,Value val){
            this.key=key;
            this.val=val;
        }
    }

    /*public int size(){
        return size(root);
    }
    public int size(Node x){
        if(x==null)
            return 0;
        return x.N;
    }*/

    //迭代实现get
    public Value get(Key key){
        Node temp=root;
        while (temp!=null){
            if(temp.key.compareTo(key)==0)
                return temp.val;
            else if(temp.key.compareTo(key)<0)
                temp=temp.right;
            else
                temp=temp.left;
        }
        return null;
    }

    //迭代实现put
    public void put(Key key,Value val){
        if(root==null)
            root=new Node(key,val);
        Node temp=root;
        Node tempParent=null;
        while (temp!=null){
            tempParent=temp;
            if(temp.key.compareTo(key)==0){
                temp.val=val;
                return;
            }
            else if(temp.key.compareTo(key)<0)
                temp=temp.right;
            else
                temp=temp.left;
        }
        if(tempParent.key.compareTo(key)<0)
            tempParent.right=new Node(key,val);
        else
            tempParent.left=new Node(key,val);
    }

}
