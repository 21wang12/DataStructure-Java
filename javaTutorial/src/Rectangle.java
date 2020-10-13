

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
	    origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
	    origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h; 
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
        System.out.println("The area is" +  getArea());
    }

    // a method for computing the area of the rectangle
    public int getArea() {
	    return width * height;  
    }

    public static void main(String[] args) {
        System.out.println("The default width is" + new Rectangle().width);
    }
}