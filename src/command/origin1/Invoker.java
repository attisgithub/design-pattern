package command.origin1;

public class Invoker
{
	
	private Command command;

	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void executeCommand(){
		this.command.execute();
	}
	
	
	
}
