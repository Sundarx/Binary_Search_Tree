//SUNDAR RAJ
public class TreeNode
{
	private Object value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode()
	{
		this(null, null, null);
	}

	public TreeNode(Object value)
	{
		this.value  =  value;
		left  =  null;
		right  =  null;
	}

	public TreeNode(Object  value, TreeNode  l, TreeNode  r)
	{
		this.value = value;
		left = l;
		right = r;
	}

	public TreeNode(TreeNode copyTNode)
	{
		value = copyTNode.value;
		left = copyTNode.left;
		right = copyTNode.right;
	}

	public Object getValue()
	{
		return value;
	}

	public TreeNode getLeft()
	{
		return left;
	}

	public TreeNode getRight()
	{
		return right;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	public void setLeft(TreeNode l)
	{
		left = l;
	}

	public void setRight(TreeNode r)
	{
		right = r;
	}
}