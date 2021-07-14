package edu.handong.apr2;

public class FaultSolver extends FaultLocalizationFinder{

	private static StringBuffer fixedS1;
	private static String fixedSS;
	
	public FaultSolver()
	{
		
		fixedS1 = new StringBuffer(getS1());
		fixedSS = null;
	}
	public void removeFault()
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.deleteCharAt(getIndex());
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	public void replaceFault(String s)
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.replace(getIndex(), getIndex(), s);
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	public void insertFault(String s)
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.insert(getIndex(), s);
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	
}
