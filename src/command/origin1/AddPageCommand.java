package command.origin1;

public class AddPageCommand implements Command
{
	
	private PageGroup cr = new PageGroup();
	private CodeGroup cg = new CodeGroup();

	@Override
	public void execute()
	{
		cr.addPage();
		cg.addCode();
	}

}
