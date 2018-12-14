public class Television 
{
	private boolean state;
	private int current_volume;
	private String current_channel;
	private int volume;
	private String change_channel;
	private boolean turn_on ;
	
	public String getChange_channel() 
	{
	
		return change_channel;
	}
	public void setChange_channel(String change_channel) 
	{
		this.change_channel = change_channel;
	}
	public boolean isTurn_on() 
	{
		return turn_on;
	}
	public void setTurn_on(boolean turn_on) 
	{
		this.turn_on = turn_on;
	}
	public boolean isState() 
	{
		return state;
	}
	public void setState(boolean state) 
	{
		this.state = state;
	}
	public int getCurrent_volume() 
	{
		return current_volume;
	}
	public void setCurrent_volume(int current_volume) 
	{
		this.current_volume = current_volume;
	}
	public String getCurrent_channel() 
	{
		return current_channel;
	}
	public void setCurrent_channel(String current_channel) 
	{
		
		this.current_channel = current_channel;
	}
	public int getVolume() 
	{
		return volume;
	}
	public void setVolume(int volume) 
	{
		this.volume = volume;
	}
	
	public void output()
	{
		System.out.println(current_channel);
		System.out.println(change_channel);
		System.out.println(current_volume);
		System.out.println(state);
		System.out.println(volume);
	}
}	
