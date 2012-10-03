package template.external1;

public class Client {

	public static void main(String[] args) {
		HummerH1Model h1Model = new HummerH1Model();
		h1Model.setAlarm(false);
		h1Model.run();
		
		HummerH2Model h2Model = new HummerH2Model();
		h2Model.run();
	}

}
