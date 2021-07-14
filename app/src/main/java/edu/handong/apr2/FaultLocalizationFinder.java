package edu.handong.apr2;

public class FaultLocalizationFinder {

	private static String s1, s2, originS1, score; //s1: �����ڵ�, s2:�����ڵ�, originS1:ó�� �Է¹��� s1(�����ڵ�)�� ��, score:bug�� �߻��ߴ���, ��� �߻��ߴ��� Ȯ���ϱ� ���� �ԷµǴ� ����
	private static int n; //���װ� �߻��� ���� ��ġ
	//s1�� �����ϴ� �ڵ�, s2�� �����ϴ� �ڵ� 
	public FaultLocalizationFinder() //���װ� �߻��� ���� ��ġ n�� ���� score�� �ʱ�ȭ
	{
		n = 0;
		score = null;
	}
	
	public FaultLocalizationFinder(String a, String b)//�����ڵ�,s1�Է� �����ڵ�,s2�Է� originS1�� ó�� �� �Է�
	{
		s1 = a;
		s2 = b;
		originS1 = s1;
		
	}
	
	
	public String getOriginS1()//ó�� s1�� ����
	{
		return originS1;
	}
	
	public void setOriginToS1()//s1�� ���� ó�� �Է¹��� ������ �ǵ�����
	{
		s1 = originS1;
	}
	
	public String gradeScore(String s)//������ �ű��.
	{
		if(s.contains("a"))
		{//a�� �����ϸ� excuted
			score = "e";
		}
		else
		{//a�� �������� ������ no excuted
			score = "n";
		}
		
		if(s.contains("b"))
		{//b�� �����ϸ� pass
			score += "p"; 
		}
		
		else
		{//b�� �������� ������ fail
			score += "f";
		}
		
		return score;
	}
	
	public int compareScore(String a, String b)//������ ���Ѵ�.
	{
		if((a.contains("ef")) && (b.contains("ep")))//ef�� ep�� ������ ���װ� �߻��ߴٰ� �Ǵ�
			return 1;
		else
			return 0;
	}
	
	public void localizeFault(String s)//���� ��ġ�� Ư��
	{
		n = s.indexOf("a");
		System.out.println("���� ��ġ : " + n + "�� ° ����");
		System.out.println();
	}
	
	
	public String getS1()//���� �ڵ� ����
	{
		return s1;
	}
	
	public String getS2()//���� �ڵ� ����
	{
		return s2;
	}
	
	public void fixS1(String s)//s1�� ���� ����
	{
		s1 = s;
	}
	
	public int getIndex()//���� ��ġ �� ��ȯ
	{
		return n;
	}
	
}
