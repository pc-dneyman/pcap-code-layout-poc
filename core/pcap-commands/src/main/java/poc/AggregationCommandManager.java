package poc;


public class AggregationCommandManager 
{
	public String executeInQueue(String command)
	{
		UserManager userManager = new UserManager();
		String users = userManager.prepareOnUsUsers();
		System.out.println("--> COMMAND MANAGER : executed " + command + " for " + users);
		return command;
	}
}
