public class SimpleStartupTestDrive {
	public static void main(String[] args) {
		SimpleStartup dot = new SimpleStartup();
		int [] locations = {2,3,4};
		dot.setLocationCells(locations);
		int userGuess = 2;
		String result = dot.checkYourself(userGuess);
		String testResut = "Failed";
		if (result.equals("hit")) {
			testResut = "Passed";
		}

		System.out.println(testResut);
	}

}
