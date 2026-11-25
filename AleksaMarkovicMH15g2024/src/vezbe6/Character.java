package vezbe6;

public class Character {
	private String name;
	private int health;
	private int baseDmg;
	
	
	public void attack(Character defender) {
		int prom=(int)Math.random()*100;
		if(prom>25) {
		takeDamage(baseDmg);
		}
	}
	
	 
	
	public void takeDamage(double baseDmg) {
		
		health-=baseDmg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getBaseDmg() {
		return baseDmg;
	}
	public void setBaseDmg(int baseDmg) {
		this.baseDmg = baseDmg;
	}
	
	public boolean isAlive(int health) {
		
		if(health<=0)return false;
		return true;
	}
	
	public void retalitate(Character attacker) {
		int prom=(int)Math.random()*100;
		if(prom>40) {
		takeDamage(baseDmg);
		}
	}
}
