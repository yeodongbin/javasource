package exercise07_17;

public class Marine implements Unit {
	int x, y;

	public void stimPack() {
	}

	@Override
	public void move(int x, int y) {
		System.out.println("마린이 움직입니다.");
	}

	@Override
	public void stop() {
	}
}

class Tank implements Unit {
	int x, y;

	public void changeMode() {

	}

	@Override
	public void move(int x, int y) {
		System.out.println("탱크가 움직입니다.");

	}

	@Override
	public void stop() {

	}
}

class Dropshop implements Unit {
	int x, y;

	void load() {

	}

	void unload() {

	}

	@Override
	public void move(int x, int y) {
		System.out.println("드랍쉽이 움직입니다.");
	}

	@Override
	public void stop() {

	}

}
