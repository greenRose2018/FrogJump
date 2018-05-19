package game.model;

public class Players
{
	private String username;
	private int health;
	private int attack;
	private int level;
	
	public Players()
	{
		this.username = "default";
		this.health = 10;
		this.attack = 2;
		this.level = 0;
	}
	public Players(String name)
	{
		this.username = name;
		this.health = 10;
		this.attack = 2;
		this.level = 0;
	}
	
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public int getAttack()
	{
		return attack;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public String toString()
	{
		String str = "";
		str += "this is the name of the player one: " + getUsername() + "\n has the health of: " + getHealth() + " \n with an attack of: " + getAttack();
		return str;
	}
	
	
	
}
