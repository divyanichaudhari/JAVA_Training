import java.util.HashSet;

public class ClassHouseFormation 
{
   
	private HashSet<String> studSet=new HashSet<String>();
	
	public HashSet<String> getStudSet()
	{
	    return studSet;
	}
	public void setStudSet(HashSet<String> studSet)
	{
	    this.studSet=studSet;
	}

	public void addName(String details)
	{
		String[] parts=details.split(":");
		if(parts.length == 2)
		{
		    String name=parts[1];
		    studSet.add(name);
		}
	
	}
	
	public HashSet<String> formTeam()
	{
		HashSet<String> teamSet=new HashSet<String>();
		for(String name:studSet)
		{
		String house;
		char firstChar = Character.toUpperCase(name.charAt(0));
	    if(firstChar >= 'A' && firstChar <= 'H')
	    {
	        house = "RED";
	    }
	    else if(firstChar >= 'I' && firstChar <= 'P')
	    {
	        house ="BLUE";
	    }
	    else if(firstChar >= 'Q' && firstChar <= 'Z')
	    {
	        house ="GREEN";
	    }
	    else
	    {
	        house ="UNKNOWN";
	    }
	    teamSet.add(name + ":" + house);
		}
	    return teamSet;
	}
}