package ro.ase.csie.cts.g1098.design.patterns.weapons;

public class Pistol implements IWeapon{
	public static final boolean NOT_USING_WATER = false;
	String model;
	boolean isUsingWater;
	
	
	@Override
	public void reload(int ammo) {
		System.out.println("reload pistol");
		
	}
	@Override
	public void shoot() {
		System.out.println("pew pew ---->");
		
	}
	public Pistol(String model, boolean isUsingWater) {
		super();
		this.model = model;
		this.isUsingWater = isUsingWater;
	}
	
	
}
