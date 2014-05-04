package Frogger;

import Zen.*;

public class Frog extends ZenSprite{
	
	
	Image frog;
	boolean leftPressed = false;
	boolean rightPressed = false;
	boolean upPressed = false;
	boolean downPressed = false;
	
	
	public Frog()
	{
		frog = new Image("Frogger/Frogger_Android_-_Frogger_Sprite.png");
	}

	@Override
	public void draw() {
		frog.set(getX()-20, getY()-10);
		Zen.draw(frog);
		
	}

	@Override
	public void move() {
		if(Zen.isKeyPressed("up") && !upPressed)
		{
			changeY(-50);
			upPressed = true;
		}
		if(! Zen.isKeyPressed("up"))
		{
			upPressed = false;
		}
		
		
		if(Zen.isKeyPressed("down") && !downPressed)
		{
			changeY(50);
			downPressed = true;
		}
		if(!Zen.isKeyPressed("down"))
		{
			downPressed = false;
		}
		
		
		if(Zen.isKeyPressed("left") && ! leftPressed)
		{
			changeX(-50);
			leftPressed = true;
		}
		
		if(! Zen.isKeyPressed("left"))
		{
			leftPressed = false;
		}
		
		if(Zen.isKeyPressed("right") && ! rightPressed)
		{
			changeX(50);
			rightPressed = true;
		}
		
		if(! Zen.isKeyPressed("right"))
		{
			rightPressed = false;
		}
		
		
	}

	public void kill() {
		set(400,450);
		
	}
	

}
