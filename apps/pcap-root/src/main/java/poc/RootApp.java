package poc;

public class RootApp {
	public String start() {
		AggregationCommandManager commandManager = new AggregationCommandManager();
		String result = "--> ROOT WEBAPP : Initiated "
				+ commandManager
						.executeInQueue("AGGREGATE_YODLEE_FOR_ONUS_USERS");
		return result;
	}
}
