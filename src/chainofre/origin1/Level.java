package chainofre.origin1;

public class Level {
	
	private int level;

	public int getLevel() {
		return level;
	}

	public Level(int level) {
		super();
		this.level = level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Level other = (Level) obj;
		if (level != other.level)
			return false;
		return true;
	}
	
}
