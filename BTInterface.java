//SUNDAR RAJ
public interface BTInterface
{
	//Returns the root node
	public abstract TreeNode getRoot();

	//Sets the root node as the given node
	public abstract void setRoot(TreeNode newNode);

	//Returns true if the tree is empty
	public abstract boolean isEmpty();

	//Swaps the left and right subtrees of given node
	public abstract void swapSubtrees(TreeNode node);

	//Returns number of nodes in the tree with only one child
	public abstract int singleParent();

	//Traverses the tree with preorder
	public abstract void preOrder(TreeNode node, int i, StringBuilder str);

	//Traverses the tree with inorder
	public abstract void inOrder(TreeNode node, int i, StringBuilder str);

	//Traverses the tree with postorder
	public abstract void postOrder(TreeNode node, int i, StringBuilder str);

	//Inserts object into the tree
	public abstract void insert(Comparable item);
}