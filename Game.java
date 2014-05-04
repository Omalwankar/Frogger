package Frogger;

import Zen.*;

public class Game extends ZenGame {

	public static final int FAST = 5;
	public static final int MEDIUM = 4;
	public static final int SLOW = 3;
	public static final int VERY_SLOW = 2;
	public static int speed = 5;

	static Frog frog;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.setSize(800, 500);
		game.setName("frogger");
		game.run();

	}

	@Override
	public void setup() {
		frog = new Frog();
		frog.set(400,475);
		addSprite(frog);
		
		for(int i = 0; i < 600; i+=100)
		{
			Truck obs = new Truck();
			obs.set(i,300);
			addSprite(obs);
		}
		
		Racecar r = new Racecar();
		r.set(0,200);
		addSprite(r);
		
	}

	@Override
	public void loop() {
		// TODO Auto-generated method stub
		
	}

}
