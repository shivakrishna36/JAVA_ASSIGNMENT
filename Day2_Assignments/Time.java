public class Time 
{
	private int hours;
	private int minutes;
	public void setTime(int hours,int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void showTime()
	{
		System.out.println("Time is" + hours +" :" + minutes);
	}
	
	public Time sum(Time timeone,Time timetwo)
	{
		Time time = new Time();
		time.hours = timeone.hours + timetwo.hours;
		time.minutes = timeone.minutes + timetwo.minutes;
		if(time.minutes>60)
		{
			
			time.hours++;
			time.minutes = time.minutes - 60;
			return time;
		}
		return time;
		
	}
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	public void setMinutes(int minutes)
	{
	this.minutes = minutes;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int getHours()
	{
		return hours;
	}
}
