package math;

public class Math {
	
	private int firstNumber;
	private int secondNumber;
	private int total;
	
	public Math(int firstNumber,int secondNumber)
	{
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	public void setFirstNum(int firstNumber)
	{
		this.firstNumber=firstNumber;
	
	}
	public int getFirstNum()
	{
		return firstNumber;
	}
	public void setSecondNum(int secondNumber)
	{
		this.secondNumber=secondNumber;
	}
	public int getSecondNum()
	{
		return secondNumber;
	}
}
