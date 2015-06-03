package poc;

import java.util.List;

public class Utils 
{
	public String convert(List<String> list)
	{
		String str = "[";
		boolean first = true;
		for (String s : list)
		{
			String token = first ?
					s : Configuration.Separator.COMA + s;
			str += token;
			first = false;
		}
		str += "]";
		return str;
	}
}
