/**
 * Define the class Weapon.
 * A Weapon is characterized by the type, the force, the maximum damage and the radius of explosion.
 * The number of bullets is attributed automatically at the initialisation fo the Weapon.
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
    /**
     * Bullets of the Weapon
     */
    private int bullets;
      

    //---------------------------------------------------------
    // Constructeurs of Object class
    //---------------------------------------------------------
    /**
     * Object is initialized with a position and a dimension. The points of life
     * are, by default, 100 and therefore alive.
     */
    public Weapon (Types type) {
        this.type = type;

        switch (type) {
            case Gun:    
            default:
                loadGun();
                break;
        }
    }

    /**
     * Gives the bullets left of the Weapon
     *
     * @return bullets left of the Weapon
     */
    private void loadGun() {
        force = 20;
        maximumDamage = 15;
        explosionRadius = 50;
        bullets = 100;
    }

    /**
     * Gives the bullets left of the Weapon
     *
     * @return bullets left of the Weapon
     */
    public int getBullets() {
        return bullets;
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

    /**
     * types of the Weapon
     */
    public enum Types {
        Gun,
        Bazooka,
        Bomb
        }


}


