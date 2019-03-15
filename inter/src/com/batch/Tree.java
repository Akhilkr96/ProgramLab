package com.batch;

import java.util.Set;

import com.batch.TestClass1.Node;

public class Tree {
	Node root;
	Set<Node> nodes;
     static class Node{
    	Integer value;
    	Node left;
    	Node right;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
    	
    	
    }
    

    
    Integer track(Node treeNode,Node n,String path){
    	if(treeNode==null||n==null||n.value==null){
    		return -1;
    	}else{
    		if(treeNode.value.equals(n.value)){
    			System.out.println(path);
    			return 1;
    		}else{
    			 if(1!=track(treeNode.left,n,path+"L")){
    	    			 return track(treeNode.right,n,path+"R");
    	    		}
    			 else{
    				 return -1;
    			 }
    		}
    	}
    }
    
    void mirror(Node n){
    	if(n==null){
    		return;
    	}else{
    		Node temp=n.left;
    		n.left=n.right;
    		n.right=temp;
    		mirror(n.left);
    		mirror(n.right);
    	}
    }
    public static void main(String args[]){
    	Tree t1=new Tree();
    	Tree.Node n1=new Tree.Node();
    	t1.root=n1;
    	n1.value=1;
    	Node n2=new Node();
    	n2.value=2;
    	n1.left=n2;
    	Node n3=new Node();
    	n3.value=3;
    	n1.right=n3;
    	Node n4=new Node();
    	n4.value=4;
    	n3.left=n4;
    	
    	Node s=new Node();
    	s.value=4;
    	Integer result=t1.track(t1.root,s,"S");
    	
    	t1.mirror(t1.root);
    	 result=t1.track(t1.root,s,"S");
    	
    	
    }
}
