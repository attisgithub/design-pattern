package proxy.origin2;

public interface IGamePlayer {

	public void login();

	public void killBoss();

	public void upgrade();
	
	public IGamePlayer getProxy();
}
