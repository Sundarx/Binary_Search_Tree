//SUNDAR RAJ
public abstract class BinaryTree implements BTInterface
{
	private TreeNode root;

	public  BinaryTree()
	{
		root = null;
	}

	//Returns the root node
	public TreeNode getRoot()
	{
		return root;
	}

	//Sets the root node as the given node
	public void setRoot(TreeNode newNode)
	{
		root = newNode;
	}

	//Returns true if the tree is empty
	public boolean isEmpty()
	{
		return (root == null);
	}

	//Swaps the left and right subtrees of given node
	public void swapSubtrees(TreeNode node)
	{
		if(node != null)
		{
			TreeNode temp = node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);

			swapSubtrees(node.getLeft());
			swapSubtrees(node.getRight());
		}
	}

	//Traverses the tree with preorder
	public void preOrder(TreeNode node, int i, StringBuilder str)
	{
		if(node != null)
		{
			str.append("Level " + i + ": " + node.getValue() + "\n");
			preOrder(node.getLeft(), i + 1, str);
			preOrder(node.getRight(), i + 1, str);
		}
	}

	//Traverses the tree with inorder
	public void inOrder(TreeNode node, int i, StringBuilder str)
	{
		if(node != null)
		{
			inOrder(node.getLeft(), i + 1, str);
			str.append("Level " + i + ": " + node.getValue() + "\n");
			inOrder(node.getRight(), i + 1, str);
		}
	}

	//Traverses the tree with postorder
	public void postOrder(TreeNode node, int i, StringBuilder str)
	{
		if(node != null)
		{
			postOrder(node.getLeft(), i + 1, str);
			postOrder(node.getRight(), i + 1, str);
			str.append("Level " + i + ": " + node.getValue() + "\n");
		}
	}

	//Returns number of nodes in the tree with only one child
	public int singleParent()
	{
	    return checkNode(root, 0);
	}

	//Private Helper Method for singleparent() method
	private int checkNode(TreeNode node, int count)
	{
		if(node == null)
		{
			return count;
		}

		if(node.getLeft() == null && node.getRight() == null)
		{
			return count;
		}

		count = checkNode(node.getLeft(), count);
		count = checkNode(node.getRight(), count);

		if(node.getLeft() != null && node.getRight() == null)
		{
			count++;
		}

		if(node.getLeft() == null && node.getRight() != null)
		{
			count++;
		}

		return count;
	}

	//Inserts object into the tree
	public abstract void insert(Comparable item);

	public String toString()
	{
		StringBuilder str = new StringBuilder();
		preOrder(root, 0, str);
		str.append("Number of single parents: " + singleParent());
		return str.toString();
	}
}