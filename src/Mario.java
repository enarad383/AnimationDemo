

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		moveByAmount(5*dir, 0);
	}

	public void jump() {
		moveByAmount(0, -15);
	}

	public void act(ArrayList<Shape> obstacles) {
		boolean isGrounded = false;
		for (Shape s: obstacles){
			if (super.intersects((Rectangle2D) s)){
				isGrounded = true;
			}
		}
		moveByAmount(0, 5);
	}


}
