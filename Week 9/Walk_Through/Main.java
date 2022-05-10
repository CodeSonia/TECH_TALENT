package Walk_Through;

public class Main {
	public static void main(String[] args) {
		// Character player = new Character(); // with this by itself, it can't do
		// anything. player has not been defined.
		//Character player = new Character("Good Guy", 100, 100, 10, 5, 8); // instantiating the Character class &
																			// creating a new object
		//Character slowBaddie = new Character("Bad Guy", 30, 30, 2, 3, 10);
		//Character fastBaddie = new Character("Bad Guy", 30, 20, 20, 5, 3);

		// The below is bad practice. It is DIRECT MANIPULATION.
		// System.out.println(fastBaddie.name + " has " + fastBaddie.currentHealth + "
		// HP");
		// fastBaddie.currentHealth = fastBaddie.currentHealth - (player.attackValue -
		// fastBaddie.defenceValue);
		// System.out.println(fastBaddie.name + " has " + fastBaddie.currentHealth + "
		// HP");

		//System.out.println(fastBaddie.getName() + " has " + fastBaddie.getCurrentHealth() + " HP" + slowBaddie);
		//fastBaddie.setCurrentHealth(
				//fastBaddie.getCurrentHealth() - (player.getAttackValue() - fastBaddie.getDefenceValue()));
		//System.out.println(fastBaddie.getName() + " has " + fastBaddie.getCurrentHealth() + " HP");


		//Create a generic constructor with no character traits as there is no default constructor:
		Character grunt_1 = new Character(30, 30, 2, 3, 10);
		Character grunt_2 = new Character(30, 30, 2, 3, 10);
		Character grunt_3 = new Character(30, 30, 2, 3, 10);

		System.out.printf(grunt_1.getName(), grunt_2.getMaxHealth(), grunt_3.getMovementDistance());
	}
}
