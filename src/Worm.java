/**
 * Create a Worm with moving methods.
 * @author ALS, PGC
 * @version
 */

public class Worm extends Object {
    //---------------------------------------------------------
    // Worm's class constants
    //---------------------------------------------------------
    /**
     * Default width of a worm tile
     */
    public static final int W_WIDTH = 60;

    /**
     * Default height of a worm tile
     */
    public static final int W_HEIGHT = 60;

    //---------------------------------------------------------
    // Worm's class constructor
    //---------------------------------------------------------
    /**
     * Worm's class default constructor. It creates a new worm with
     * a (x,y) position and a size given by W_WIDTH and W_HEIGHT.
     * @param x position along x-axis
     * @param y position along y-axis
     */
    public Worm(int x, int y) {
        super(x, y, W_WIDTH, W_HEIGHT);
    }

    /**
     * Move the worm to the left with a step of dx.
     * @param dx step size for the move along x-axis
     */
    public void moveLeft(int dx) {
        this.x -= dx;
    }

    /**
     * Move the worm to the right with a step of dx.
     * @param dx step size for the move along x-axis
     */
    public void moveRight (int dx) {
        this.x += dx;
    }

    /**
     * ...
     */
    public void jump() {
        // TODO
    }
}
