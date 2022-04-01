package hu.bme.mit.spaceship;

/**
* Defines basic spaceship functionality
*e most important ones current
* (collects just the most importa

*/
public interface SpaceShip {

  /**
  * Fires the laser or lasers of the ship
  *
  * @param firingMode how many lasers to fire
  * @return was the firing successful
  */
  public boolean fireLaser(FiringMode firingMode);

  /**
  * Fires the torpedo stores of the ship
  *
  * @param firingMode how many torpedo stores to fire
  * @return whether the fire command was successful
  */
  public boolean fireTorpedo(FiringMode firingMode);
}
