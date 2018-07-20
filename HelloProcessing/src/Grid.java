import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PShape;

public class Grid extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Grid");

	}

	public void settings() {
		size(700, 700);
	}

	ArrayList<PShape> shapeList = new ArrayList<PShape>();
	boolean check = false;
	int squareWidth = 30;
	int spacing = 10;
	int margins = 50;
	int squareX = margins;
	int squareY = margins;

	public void setup() {
		int squareAmountX = (width - margins) / (squareWidth + spacing);
		int squareAmountY = (height - margins) / (squareWidth + spacing);
		for (int j = 0; j < squareAmountY; j++) {

			for (int i = 0; i < squareAmountX; i++) {
				PShape rect = createShape(RECT, squareX, squareY, squareWidth, squareWidth);
				rect.setFill(color(255));
				shapeList.add(rect);
				squareX = squareX + squareWidth + spacing;
				if (squareX >= (width - margins)) {
					i++;
				}
			}
			squareX = margins;
			squareY = squareY + squareWidth + spacing;
			if (squareY >= (height - margins)) {
				j++;
			}			
		}

	}

	public void draw() {
		for (PShape a : shapeList) {
			shape(a);
		}
	}

	public void mousePressed() {
		check = true;
		for (int i = 0; i < shapeList.size(); i++) {
			System.out.println(shapeList.get(i).getVertexX(0));
		}
	}

	public void mouseReleased() {
		check = false;
	}
}
