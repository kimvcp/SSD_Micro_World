

public class Adapter implements IUnit {
	LegacyUnit lu = new LegacyUnit();


	@Override
	public void move() {
		lu.walk();
	}

	@Override
	public int getX() {
		return lu.getPositionX();
	}

	@Override
	public int getY() {
		return lu.getPositionY();
	}

	@Override
	public String getName() {
		return "Kim";
	}

	@Override
	public int getHealth() {
		return 99;
	}

	@Override
	public boolean dead() {
		return false;
	}

}
