import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 * Define the class GraphicalObject.
 * An GraphicalObject is caharacterized by a position and a dimension (width and height).
 * It has also an attribute life, which counts the life points of the GraphicalObject.
 * Below zero, the GraphicalObject is not Alive.
 *
 * @author ALS, PGC
 * @version
 */
public class GraphicalObject {
    /**
     * stocks the position x of the GraphicalObject
     */
    protected int x;
    /**
     * stocks the position y of the GraphicalObject
     */
    protected int y;
    /**
     * stocks the width of the GraphicalObject
     */
    protected int width;
    /**
     * stocks the heigth of the GraphicalObject
     */
    protected int heigth;
    /**
     * points of life left of the GraphicalObject
     */
    protected int life = 100;
    /**
     * Object is alive (in game)
     */
    protected boolean alive = true;
    /**
     * Image of the Object
     */
    protected Image image;

    // ---------------------------------------------------------
    // Constructeurs of GraphicalObject class
    // ---------------------------------------------------------
    /**
     * Object is initialized with a position and a dimension. The points of life
     * are, by default, 100 and therefore alive.
     */
    public GraphicalObject(int x, int y, int width, int heigth, String imagePath) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;

        loadImage(width, heigth, imagePath);
    }

    /**
     * Method to scale the object sprite into the desired dimensions
     * 
     * @param width  The desired width of the object
     * @param height The desired height of the object
     */
    protected void loadImage(int initialWidth, int initialHeight, String imagePath) {
        try {
            image = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource(imagePath));
        } catch (Exception e) {
            System.out.println("Error loading image.");
        }

        scaleBird(initialWidth, initialHeight);
    }

    /**
     * Method to scale the object sprite into the desired dimensions
     * 
     * @param width  The desired width of the object
     * @param height The desired height of the object
     */
    protected void scaleBird(int width, int height) {
        image = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    /**
     * Method used to acquire a Rectangle that outlines the object's image
     * 
     * @return Rectangle outlining the object's position on screen
     */
    public Rectangle getRectangle() {
        return (new Rectangle(x, y, width, heigth));
    }

    /**
     * Method to acquire a BufferedImage that represents the Bird's image object
     * 
     * @return Bird's BufferedImage object
     */
    public BufferedImage getBI() {
        BufferedImage bi = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bi;
    }

    /**
     * Getter method for the worm object.
     * 
     * @return Image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Damage caused to the object. Modifies the state alive as needed.
     *
     * @param dam points of life to remove from the GraphicalObject.
     */
    public void damage(int dam) {
        life -= dam;
        alive = life < 0;
    }

    /**
     * Gives the width of the GraphicalObject
     *
     * @return width of the GraphicalObject
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gives heigth of the GraphicalObject
     *
     * @return heigth of the GraphicalObject
     */
    public int getHeigth() {
        return heigth;
    }

    /**
     * Gives the position in the x axis of the GraphicalObject
     *
     * @return the position in the x axis of the GraphicalObject
     */
    public int getX() {
        return x;
    }

    /**
     * Gives the position in the y axis of the GraphicalObject
     *
     * @return the position in the y axis of the GraphicalObject
     */
    public int getY() {
        return y;
    }

    /**
     * Gives the points of life left of the GraphicalObject
     *
     * @return the points of life left of the GraphicalObject
     */
    public int getLife() {
        return life;
    }

    /**
     * Gives if the GraphicalObject is alive.
     *
     * @return if the GraphicalObject is alive.
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Fix position of the Object.
     *
     * @param x value of the position in the x axis.
     * @param y value of the position in the y axis.
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Fix positionin the x axis of the GraphicalObject.
     *
     * @param x value of the position in the x axis.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Fix positionin the y axis of the GraphicalObject.
     *
     * @param y value of the position in the y axis.
     */
    public void setY(int y) {
        this.y = y;
    }

}