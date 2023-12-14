/**
 * Define the class Weapon.
 * A Weapon is caharacterized by the type, the force, the maximum damage and the radius of explosion.
 *
 * @author PGC
 */
public class Weapon {
    /**
     * stocks the force of the Weapon (initial speed)
     */
    private int force;
    /**
     * stocks the maximum damage of the Weapon
     */
    private int maximumDamage;
    /**
     * stocks the explision radius of the Weapon
     */
    private int explosionRadius;
    /**
     * stocks the type of the Weapon
     */
    private Types type;
      

    //---------------------------------------------------------
    // Constructeurs of Object class
    //---------------------------------------------------------
    /**
     * Object is initialized with a position and a dimension. The points of life
     * are, by default, 100 and therefore alive.
     */
    public Weapon (Types type, int force, int maximumDamage, int explosionRadius) {
        this.type = type;
        this.force = force;
        this.maximumDamage = maximumDamage;
        this.explosionRadius = explosionRadius;    
    }

    /**
     * Gives the force of the Weapon
     *
     * @return force of the Weapon
     */
    public int getForce() {
        return force;
    }

    /**
     * Gives the damage of the Weapon
     *
     * @return the damage of the Weapon
     */
    public int getDamage() {
        return maximumDamage;
    }

    /**
     * Gives the explosion radius of the Weapon
     *
     * @return the explosion radius of the Weapon
     */
    public int getExplosionRadius() {
        return explosionRadius;
    }

    /**
     * Gives the type of the Weapon
     *
     * @return the type of the Weapon
     */
    public Types getType() {
        return type;
    }


}

/**
 * types of the Weapon
 */
enum Types {
    Gun,
    Bazooka,
    Bomb
    }


