package ro.ase.csie.cts.g1098.design.patterns.weapons;

public class Main {

	public static void main(String[] args) {
		IWeapon weapon = new Pistol("water pistol", true);
		//IWeapon secondWeapon = new MachineGun("Ultimate rifle", 100);
		
		IWeapon anotherWeapon = WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Army");
		((Bazooka)anotherWeapon).setMaxDistance(2000);
	}

}
