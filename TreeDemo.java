//SUNDAR RAJ
import java.util.Scanner;

public class TreeDemo
{
	public static void main(String[] args)
	{
		System.out.println("Tree One: ");
		BinarySearchTree tree1 = new BinarySearchTree();
		makeTree(tree1);
		printTree(tree1);

		//Swap subtrees for tree one
		tree1.swapSubtrees(tree1.getRoot());
		printTree(tree1);


		System.out.println("\nTree Two: ");
		BinarySearchTree tree2 = new BinarySearchTree(14, 4, 15, 3, 9, 18, 7, 16, 20, 5, 17);
		printTree(tree2);

		//Swap subtrees for tree two
		tree2.swapSubtrees(tree2.getRoot());
		printTree(tree2);
	}

	public static void makeTree(BinarySearchTree tree)
	{
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
	}

	public static void printTree(BinarySearchTree tree)
	{
		System.out.println(tree);
	}
}