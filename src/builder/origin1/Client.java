package builder.origin1;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		BenzModel aBenzModel = director.getABenzModel();
		aBenzModel.run();
		
		BMWModel aBMWModel = director.getABMWModel();
		aBMWModel.run();
	}

}
