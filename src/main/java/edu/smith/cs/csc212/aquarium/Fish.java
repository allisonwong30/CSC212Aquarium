package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class Fish {
	// Every fish has an x position and y position that is an int.
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	
	// Every fish has a destination
	int destX;
	int destY;
	
	public Fish(Color color, int x, int y, boolean isLittle, boolean facingLeft) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		
		this.destX = 450;
		this.destY = 450;
	}
	
	public void swim() {
		// "Fish Destination System"
		if (this.y < this.destY) {
			this.y += 1;
		}
		if (this.x < this.destX) {
			this.x += 1;
		}
	}
	public void destinationPicker() {
		//Pick a new destination
		Random destX = new Random();
		Random destY = new Random();
	}
	public void draw(Graphics2D g) {
		this.swim();
		
		if (this.isLittle == true && this.facingLeft == true) {
			DrawFish.smallFacingLeft(g, this.color, this.y, this.x);
		}
		if (this.isLittle == true && this.facingLeft == false) {
			DrawFish.smallFacingRight(g, this.color, this.y, this.x);
		}
		if (this.isLittle == false && this.facingLeft == true) {
			DrawFish.facingLeft(g, this.color, this.y, this.x);
		}
		if (this.isLittle == false && this.facingLeft == false) {
			DrawFish.facingRight(g, this.color, this.y, this.x);
		}
		
		if 
		

		
	}
}
