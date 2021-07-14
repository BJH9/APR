package edu.handong.csee.isel.apr;

/*�ڵ带 �����ϴ� �޼ҵ���� �����ϴ� Ŭ����
 * ����, ����, ���� ����� ���� �޼ҵ���� ���´�.
 */

public class FaultSolver extends FaultLocalizationFinder{

	private static StringBuffer fixedS1;//s1�� ���� ��ȭ��Ű�� ���� stringbuffer�� ���
	private static String fixedSS;//stringbuffer���� �ٽ� string���� �ٲ㼭 ���⿡ ���� 
	
	public FaultSolver()//�ʱ�ȭ
	{
		
		fixedS1 = new StringBuffer(getS1());
		fixedSS = null;
	}
	public void removeFault()//�ش�κ��� ���������ν� ���׸� ����
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.deleteCharAt(getIndex());
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	public void replaceFault(String s)//�ش� �κ��� s�� ��ü�����ν� ���׸� ����
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.replace(getIndex(), getIndex(), s);
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	public void insertFault(String s)//�ش� �κп� s�� ���������ν� ���׸� ����
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.insert(getIndex(), s);
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	
}
