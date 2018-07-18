import processing.core.PApplet;

public class FirstAnimProj extends PApplet{

	public static void main(String[] args) {
		PApplet.main("FirstAnimProj");

	}

	public void settings(){
		size(800,500);
    }
	boolean[] keys;

	int moveBy = 5;
	int canvasX;
	int canvasY;
	int rad = 50;

	int redCircX;
	int redCircY;
	int redCircRad = 25;

	int rectX = 30;
	int rectY = 30;

	public void setup()
	{
	  
	  canvasX = width;
	  canvasY = height;
	  
	  redCircX = width/2;
	  redCircY = height/2;
	    keys = new boolean[4];
	    for(int i = 0; i < keys.length; i++)
	    {
	        keys[i] = false;
	    }
	}

	public void draw() {
	  
	   background(130);
	   
	   fill(255,0,0);
	   stroke(255,0,0);
	   ellipse(redCircX,redCircY,redCircRad*2,redCircRad*2);
	   
	   fill(255);
	   stroke(255);
	   ellipse(rectX,rectY,rad*2,rad*2);
	   
	  if(rectX > canvasX) {
	    rectX = 0; 
	  }
	  if(rectX < 0) {
	    rectX = canvasX; 
	  }
	  if(rectY > canvasY) {
	    rectY = 0; 
	  }
	  if(rectY < 0) {
	    rectY = canvasY; 
	  }
	  
	  if(keys[0])
	  {
	     rectX -= moveBy; 
	  }
	  if(keys[1])
	  {
	     rectY += moveBy; 
	  }
	  if(keys[2])
	  {
	     rectY -= moveBy; 
	  }
	  if(keys[3])
	  {
	     rectX += moveBy; 
	  }
	  
	  int distance = (int) dist(rectX, rectY, redCircX, redCircY);
	  if(distance < redCircRad + rad)
	  {
	      rectX = width;
	      rectY = height;
	  }
	}

	public void keyPressed() {
	  if(key == 'a')
	       {
	          keys[0] = true; 
	       }       
	       if(key == 's')
	       {
	          keys[1] = true; 
	       }       
	       if(key == 'w')
	       {
	          keys[2] = true; 
	       }       
	       if(key == 'd')
	       {
	          keys[3] = true; 
	       }
	}

	public void keyReleased()
	  {
	       if(key == 'a')
	       {
	          keys[0] = false; 
	       }      
	       if(key == 's')
	       {
	          keys[1] = false; 
	       }       
	       if(key == 'w')
	       {
	          keys[2] = false; 
	       }       
	       if(key == 'd')
	       {
	          keys[3] = false; 
	       }
	     }
}

