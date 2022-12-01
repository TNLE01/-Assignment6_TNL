
public class DepthFirstSearch {       
       Node root;
       int traverse = 0;
       int rightHeight = 0;
       int leftHeight = 0;
       public DepthFirstSearch() {
    	   System.out.println("Call DFS with root node to do a Depth First Search.");
       }
       public void DFS(Node node) {
    	   System.out.println(node.getData());
    	   traverse++;
    	   //ADD CODE TO TRAVERSE THE TREE HERE
    	   //THIS IS APPROXIMATELY THREE LINES OF CODE
    	   //INCLUDING AN IF STATEMENT TO
    	   //SEE IF THE NODE IS A LEAF
    	   //AND TWO RECURSIVE CALLS TO THE CHILDREN

    	   //MODIFY OTHER CODE AS NECESSARY
    	   
    	   if (node.getlChild() != null) {
    		   leftHeight++;
    		   DFS(node.getlChild());
    		   if (node.getrChild() != null) {
    			   rightHeight++;
    			   DFS(node.getrChild());
    		   }
    	   }
       }
       public void treeStats(Node node) {
    	   if (traverse != 0) traverse = 0;
    	   //if (height != 0) height = 0;
    	   DFS(node);
    	   System.out.println("Traverse a total of " + traverse + " Nodes");
    	   //System.out.println("Height of tree is " + height);

       }

}
