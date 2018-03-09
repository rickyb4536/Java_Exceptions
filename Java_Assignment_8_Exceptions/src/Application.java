
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
		
		try {
			runner.run();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
