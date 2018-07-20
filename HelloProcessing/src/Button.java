import processing.core.PApplet;

public class Button extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Button");

	}

	public void settings() {
		size(600,600);
	}

	public void setup() {

	}

	int color = 255;
	boolean mousePressed;

	public void draw() {
		background(0);
		fill(color);
		rect(100, 100, 50, 50);

		if (mouseX >= 100 && mouseX <= 150 && mouseY >= 100 && mouseY <= 150 && mousePressed) {			
			color = 150;
		} else {
			color = 255;
		}
	}

	public void mousePressed() {
		mousePressed = true;
	}

	public void mouseReleased() {
		mousePressed = false;
	}
}
