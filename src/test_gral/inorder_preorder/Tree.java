package test_gral.inorder_preorder;

/**
 *
 * @author German
 * 
 */

public class Tree<T> {
	public T value;
	public Tree<T> left;
	public Tree<T> right;
	
	public Tree(T value){
		this.value = value;
	}
}
