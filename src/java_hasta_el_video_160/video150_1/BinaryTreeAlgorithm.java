package java_hasta_el_video_160.video150_1;

/**
 *
 * @author German
 * 
 */

public class BinaryTreeAlgorithm {

	public static void main(String[] args) {
		
		int[] inOrder = {2,8,7,9,1,5,3,6};
		int[] preOrder = {1,2,7,8,9,3,5,6};

		Tree<Integer> root = restoreBinaryTree(inOrder, preOrder, 0, inOrder.length-1, 0, preOrder.length-1);
		callInorderAndPreorderPrints(root);
	}
	
	public static Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder, 
                int i, int j, int u, int v){
            
		if(j < i) return null;
		else if(i == j) return new Tree<Integer>(inorder[i]);
		
		Tree<Integer> tree = new Tree<Integer>(preorder[u]);
                
		int k=i, w=u;
		
		while(inorder[k] != preorder[u]){
			k++;
			w++;
		}
		
		tree.left = restoreBinaryTree(inorder, preorder, i, k-1, u+1, w);
		tree.right = restoreBinaryTree(inorder, preorder, k+1, j, w+1, v);
		
		return tree;
	}
	
	public static void callInorderAndPreorderPrints(Tree<Integer> tree){
		System.out.print("inorder:  ");
		inorderPrint(tree);
		System.out.print("\npreorder: ");
		preorderPrint(tree);
		System.out.println();
	}
	
	public static void preorderPrint(Tree<Integer> tree){
		System.out.print(tree.value + ", ");
		
		if(tree.left != null){
			preorderPrint(tree.left);
		}
		
		if(tree.right != null){
			preorderPrint(tree.right);
		}
	}
	
	public static void inorderPrint(Tree<Integer> tree){
		if(tree.left != null){
			inorderPrint(tree.left);
		}
		
		System.out.print(tree.value + ", ");
		
		if(tree.right != null){
			inorderPrint(tree.right);
		}
	}	
	

}
