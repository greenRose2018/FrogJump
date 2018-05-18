package game.model;

public class PlayerOne extends Players implements Player
{
	public PlayerOne(String name)
	{
		super(name);
	}
	public PlayerOne()
	{
		super("default");
	}
	public int health()
	{
		int health = 10;
		return health;
	}
	public int score()
	{
		int score = 0;
		return score;
	}
	public int attack()
	{
		int attack = 10;
		return attack;
	}
}
