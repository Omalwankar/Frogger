package Frogger;

import Zen.*;

public class Truck extends Obstacle {
	
	public void draw()
	{
		Zen.setColor("gray");
		Zen.fillRect(getX() - 30, getY() - 20, 70, 50);
		Zen.setColor("orange");
		Zen.fillRect(getX() + 40, getY() - 15, 20,40);
	}
	
	public int getSpeed()
	{
		return Game.VERY_SLOW;
	}
	
}
