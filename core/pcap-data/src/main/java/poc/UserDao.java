package poc;

import java.util.ArrayList;
import java.util.List;

public class UserDao 
{
	public String getUsers(String nameLike)
	{
		List<String> users = new ArrayList<String>();
		users.add(nameLike + "_A");
		users.add(nameLike + "_B");
		users.add(nameLike + "_C");

		Utils utils = new Utils();
		String usersStr = utils.convert(users);
		
		System.out.println("Separator is : " + Configuration.Separator.COMA);
		System.out.println("--> USER DAO : fetched from db : " + usersStr);
		return usersStr;
	}
}

