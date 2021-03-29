import java.util.ArrayList;

public class branch_sum
{
	public static ArrayList<Integer> sum(TreeNode t,ArrayList<Integer> summing, int current_sum)
	{
      current_sum+=t.root;
      if(t.left==null && t.right==null)
      {
    	  summing.add(current_sum);
      }
      if(t.left!=null)
      {
    	  sum(t.left,summing,current_sum);
      }
      if(t.right!=null)
      {
    	  sum(t.right,summing, current_sum);
      }
      return summing;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> summing=new ArrayList<>();
		TreeNode t=new TreeNode();
		t.root=1;
		t.left=new TreeNode();
		t.left.root=2;
		t.left.left=new TreeNode();
		t.left.left.root=4;
		t.left.left.left=new TreeNode();
		t.left.left.left.root=8;
		t.left.right=new TreeNode();
		t.left.right.root=5;
		t.left.right.left=new TreeNode();
		t.left.right.left.root=10;
		t.left.left.right=new TreeNode();
		t.left.left.right.root=9;
		t.right=new TreeNode();
		t.right.root=3;
		t.right.right=new TreeNode();
		t.right.right.root=7;
		t.right.left=new TreeNode();
		t.right.left.root=6;
		ArrayList<Integer> t1=sum(t,summing,0);
		for(int s:t1)
		{
			System.out.println(s);
		}
	}

}
