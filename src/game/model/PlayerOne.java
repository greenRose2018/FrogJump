package game.model;

public class PlayerOne extends Players implements Player
{
	private int health;
	private int score;
	private int attack;
	
	public PlayerOne(String name)
	{
		super(name);
		health = 10;
		score = 0;
		attack = 2;
	}
	public PlayerOne()
	{
		super("default");
	}
	public int getHealth()
	{
		return health;
	}
	public int getScore()
	{
		return score;
	}
	public int getAttack()
	{
		return attack;
	}
}
