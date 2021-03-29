//TREE BUILDING--to find the number closest to 12 in this BST.


public class closest_number_BST 
{
	
	//NORMAL
//	public static int findClosest(TreeNode t, int target,int closest)
//	{
//		if(t.root==0)
//		{
//			return closest;
//		}
//		if(Math.abs(target-closest)>Math.abs(target-t.root))
//		{
//			closest=t.root;
//		}
//		if(target<t.root && t.left!=null)
//		{
//			return findClosest(t.left,target,closest);
//		}
//		if(target>t.root && t.right!=null)
//		{
//			return findClosest(t.right,target,closest);
//		}
//		
//		return closest;
//		
//		
//	}
	
	
	//SPACE COMPLEXITY
	public static int findClosest(TreeNode t,int target,int closest)
	{
		TreeNode tree=t;
		while(tree.root!=0)
		{
			if(Math.abs(target-closest)>Math.abs(target-tree.root))
			{
				closest=tree.root;
			}
			if(target>tree.root && tree.right!=null)
			{
				tree=tree.right;
			}
			else if(target<tree.root &&tree.left!=null)
			{
				tree=tree.left;
			}
			else
			{
				break;
			}
		}
		return closest;
	}
	public static void main(String[] args) 
	{
		TreeNode t=new TreeNode();
		t.root=10;
		t.left=new TreeNode();
		t.left.root=5;
		t.left.left=new TreeNode();
		t.left.left.root=2;
		t.left.right=new TreeNode();
		t.left.right.root=5;
		t.right=new TreeNode();
		t.right.root=15;
		t.right.right=new TreeNode();
		t.right.right.root=18;
		t.right.left=new TreeNode();
		t.right.left.root=13;
		t.right.left.right=new TreeNode();
		t.right.left.right.root=14;
		t.right.right.left=new TreeNode();
		t.right.right.left.root=17;
		t.right.right.right=new TreeNode();
		t.right.right.right.root=17;
		int c=findClosest(t,12,Integer.MAX_VALUE);
		System.out.println(c);
	}
}
