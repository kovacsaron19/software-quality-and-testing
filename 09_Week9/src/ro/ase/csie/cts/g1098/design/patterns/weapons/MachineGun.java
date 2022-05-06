package ro.ase.csie.cts.g1098.design.patterns.weapons;

public class MachineGun implements IWeapon {

	String model;
	int strength;
	int noBullets;
	
	
	
	public MachineGun(String model, int strength, int noBullets) {
		super();
		this.model = model;
		this.strength = strength;
		this.noBullets = noBullets;
	}

	@Override
	public void reload(int ammo) {
		System.out.println("reload machine gun");
		
	}

	@Override
	public void shoot() {
		System.out.println("--->--->----> tatatata");
	}

}
