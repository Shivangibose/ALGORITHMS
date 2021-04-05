import java.util.ArrayList;

public class depth_first_search 
{
	public static ArrayList<Character> sum(TreeNodeChar t,ArrayList<Character> summing)
	{
      
      summing.add(t.root);
      if(t.left!=null)
      {
    	  sum(t.left,summing);
      }
      if(t.middle!=null)
      {
    	  sum(t.middle,summing);
      }
      if(t.right!=null)
      {
    	  sum(t.right,summing);
      }
      return summing;
	}

	public static void main(String[] args) 
	{
		ArrayList<Character> summing=new ArrayList<>();
		TreeNodeChar t=new TreeNodeChar();
        t.root='A';
        t.left=new TreeNodeChar();
        t.left.root='B';
        t.left.left=new TreeNodeChar();
        t.left.left.root='E';
        t.left.right=new TreeNodeChar();
        t.left.right.root='F';
        t.left.right.right=new TreeNodeChar();
        t.left.right.right.root='J';
        t.left.right.left=new TreeNodeChar();
        t.left.right.left.root='I';
        t.middle=new TreeNodeChar();
        t.middle.root='C';
        t.right=new TreeNodeChar();
        t.right.root='D';
        t.right.right=new TreeNodeChar();
        t.right.right.root='H';
        t.right.left=new TreeNodeChar();
        t.right.left.root='G';
        t.right.left.right=new TreeNodeChar();
        t.right.left.right.root='K';
        ArrayList<Character> c=sum(t,summing);
        for(Character s:summing)
        {
        	System.out.print(s);
        }
	}

}
