package chainofre.origin1;

public abstract class Handler {

	private Handler nextHandler;

	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public final Response handleMessage(Request request) {
		Response response = null;
		if (request.getRequestLevel().equals(getHandleLevel())) {
			response = this.echo(request);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.handleMessage(request);
			}else{
				
			}
		}
		
		return response;
	}

	protected abstract Level getHandleLevel();

	protected abstract Response echo(Request request);
}
