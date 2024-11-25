import java.util.*;

public class NumAvg {

    private TreeSet<Integer> numSet=new TreeSet<Integer>();

        public TreeSet<Integer>getNumSet()
        {
            return numSet;
        }
        public void setNumSet(TreeSet<Integer> numSet)
        {
            this.numSet=numSet;
        }

    public void addNum(int num)
    {
        if(num%5 != 0 && num%6 !=0){
	    numSet.add(num);
    }
}
    public double calAvg()
    {
	   int sum=0;
	   for(int num: numSet)
	   {
	       sum +=num;
	   }
	    return (double)sum/numSet.size();
    }
}
