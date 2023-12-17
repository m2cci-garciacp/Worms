/**
 * Define the class Inventory.
 * An Inventory has a number of weapons.
 *
 * @author PGC
 */
public class Inventory {
    /**
     * Maximum number of items in the inventory
     */
	private static final int MAX_NB_ITEMS = 5;
    /**
     * Number of items in the inventory
     */
    private int numberItems;
    /**
     * List of weapons with the corresponding bullets
     */
    private Weapon[] items;
    /**
     * index  of the current weapon
     */
    private int indexCurrentWeapon;

    //---------------------------------------------------------
    // Constructeurs of Inventory class
    //---------------------------------------------------------
    /**
     * Inventory is the inventory of the a player
     */
    public Inventory () {
        numberItems = 1;
        items[0] = new Weapon(Weapon.Types.Gun);
    }

    /**
     * Change the current Weapon
     * @param indexNewWeapon index of the current Weapon
     */
    public void changeCurrentWeapon(int indexNewWeapon) {
        if (indexNewWeapon<numberItems && indexNewWeapon>=0) indexCurrentWeapon = indexNewWeapon;
    }
    /**
     * Get the current Weapon
     * @return the current Weapon
     */
    public Weapon getWeapon() {
        return items[indexCurrentWeapon];
    }


}
