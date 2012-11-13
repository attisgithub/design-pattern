package memento.external2;

import java.util.Date;

public class Originator {

	private String state1;
	private int state2;
	private Date state3;

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public int getState2() {
		return state2;
	}

	public void setState2(int state2) {
		this.state2 = state2;
	}

	public Date getState3() {
		return state3;
	}

	public void setState3(Date state3) {
		this.state3 = state3;
	}

	public Memento createMemento() {
		return new Memento(BeanUtils.backupProps(this));
	}

	public void restoreMemento(Memento memento) {
		BeanUtils.restoreProps(this, memento.getStateMap());
	}

	@Override
	public String toString() {
		return "state1:" + state1 + " state2:" + state2 + " state3:" + state3;
	}

}
