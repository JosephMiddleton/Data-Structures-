public class Rectangle {

    private int m_width;
    private int m_height;

public static void main(String args[]) {
    Rectangle r = new Rectangle(4, 5);
    System.out.println(r.getWidth());
    System.out.println(r.getHeight());
    System.out.println(r.getArea());
    System.out.println(r.getParameter());
    System.out.println(r.getArea());

}

public Rectangle(int width, int height) {
     m_width = width;
     m_height = height; 
}

public Rectangle() {
     m_width = 0;
     m_height = 0;

}

public int getWidth() {
    return m_width;
}
public int getHeight() {
    return m_height;
}

public int getArea() {
    return m_width * m_height;
}

public int getParameter() {
    return (2* m_width) + (2 * m_height);
}

}