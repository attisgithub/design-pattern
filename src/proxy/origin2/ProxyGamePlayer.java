package proxy.origin2;

public class ProxyGamePlayer implements IGamePlayer {

	private IGamePlayer gamePlayer;
	
	public ProxyGamePlayer(IGamePlayer gamePlayer){
		this.gamePlayer = gamePlayer;
	}
	
	@Override
	public void login() {
		this.gamePlayer.login();
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
