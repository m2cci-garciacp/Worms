/**
 * Define the object Object.
 * An Object is caharacterized by a position and a dimension (width and height).
 * It has also an attribute life, which counts the life points of the Object.
 * Below zero, the Object is not Alive.
 *
 * @author PGC
 */
public class Object {
    /**
     * stocks the position x of the Object
     */
    private int x;
    /**
     * stocks the position y of the Object
     */
    private int y;
    /**
     * stocks the width of the Object
     */
    private int width;
    /**
     * stocks the heigth of the Object
     */
    private int heigth;
    /**
     * points of life left of the Object
     */
    private int life = 100;
    /**
     * Object is alive (in game)
     */
    private boolean alive = true;

    //---------------------------------------------------------
    // Constructeurs of Object class
    //---------------------------------------------------------
    /**
     * Object is initialized with a position and a dimension. The points of life
     * are, by default, 100 and therefore alive.
     */
    public Object (int x, int y, int width, int heigth){
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    
    }

    /**
     * Damage caused to the object. Modifies the state alive as needed.
     *
     * @param dam points of life to remove from the Object.
     */
    public void damage(int dam)
    {
        life -= dam;
        alive = life<0 ;
    }

    

    /**
     * Gives the width of the Object
     *
     * @return width of the Object
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gives heigth of the Object
     *
     * @return heigth of the Object
     */
    public int getHeigth() {
        return heigth;
    }
    
    /**
     * Gives the position in the x axis of the Object
     *
     * @return the position in the x axis of the Object
     */
    public int getX() {
        return x;
    }
    
    /**
     * Gives the position in the y axis of the Object
     *
     * @return the position in the y axis of the Object
     */
    public int getY() {
        return y;
    }

    /**
     * Gives the points of life left of the Object
     *
     * @return the points of life left of the Object
     */
    public int getLife() {
        return life;
    }

    /**
     * Gives if the Object is alive.
     *
     * @return if the Object is alive.
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
     * Fix positionin the x axis of the Object.
     *
     * @param x value of the position in the x axis.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Fix positionin the y axis of the Object.
     *
     * @param y value of the position in the y axis.
     */
    public void setY(int y) {
        this.y = y;
    }

}
