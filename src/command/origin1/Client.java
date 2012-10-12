package command.origin1;

public class Client
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Invoker invoker = new Invoker();
//		AddPageCommand command = new AddPageCommand();
		RemovePageCommand command = new RemovePageCommand();
		invoker.setCommand(command);
		invoker.executeCommand();
	}

}
