package command.origin1;

public class RemovePageCommand implements Command
{
	
	private PageGroup pg = new PageGroup();
	private CodeGroup cg = new CodeGroup();

	@Override
	public void execute()
	{
		pg.removePage();
		cg.removeCode();
	}

}
