package poc;


public class UserManager 
{
	public String prepareOnUsUsers()
	{
		UserDao dao = new UserDao();
		String users = dao.getUsers("User");
		String onUsUsers = users.replaceAll("User", "OnUs_User");
		System.out.println("==> USER MANAGER : prepared on-us users " + onUsUsers);
		return onUsUsers;
	}
}
