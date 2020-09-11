//SUNDAR RAJ
public  class BinarySearchTree extends BinaryTree
{
	public BinarySearchTree()
	{
		super();
	}

	public BinarySearchTree(Comparable ...value)
	{
		super();

		if(value.length > 0)
		{
			for(Comparable element : value)
			{
				insert(element);
			}
		}
		else
		{
			System.out.println("Error: no values given");
		}
	}

	public void insert(Comparable item)
	{
		setRoot(recurInsert(getRoot(), item));
	}

	//Private helper method for insert method
	private TreeNode recurInsert(TreeNode t, Comparable item)
	{
		if (t == null)
		{
			return  new  TreeNode(item);
		}
		else if (item.compareTo(t.getValue())  <  0)
		{
			t.setLeft(recurInsert(t.getLeft(), item));
		}
		else
		{
			t.setRight(recurInsert(t.getRight(), item));
		}
		return  t;
	}
}