package edu.handong.apr2;

public class FaultLocalizationFinder {

	private static String s1, s2, originS1, score;
	private static int n;
	//s1은 실패하는 코드, s2는 성공하는 코드 
	public FaultLocalizationFinder()
	{
		n = 0;
		score = null;
	}
	
	public FaultLocalizationFinder(String a, String b)
	{
		s1 = a;
		s2 = b;
		originS1 = s1;
		
	}
	
	
	public String getOriginS1()//처음 s1값 리턴
	{
		return originS1;
	}
	
	public void setOriginToS1()
	{
		s1 = originS1;
	}
	
	public String gradeScore(String s)//점수를 매긴다.
	{
		if(s.contains("a"))
		{//a를 포함하면 excuted
			score = "e";
		}
		else
		{//a를 포함하지 않으면 no excuted
			score = "n";
		}
		
		if(s.contains("b"))
		{//b를 포함하면 pass
			score += "p"; 
		}
		
		else
		{//b를 포함하지 않으면 fail
			score += "f";
		}
		
		return score;
	}
	
	public int compareScore(String a, String b)//점수를 비교한다.
	{
		if((a.contains("ef")) && (b.contains("ep")))
			return 1;
		else
			return 0;
	}
	
	public void localizeFault(String s)//버그 위치를 특정
	{
		n = s.indexOf("a");
		System.out.println("버그 위치 : " + n + "번 째 문자");
		System.out.println();
	}
	
	
	public String getS1()//버그 코드 리턴
	{
		return s1;
	}
	
	public String getS2()//정상 코드 리턴
	{
		return s2;
	}
	
	public void fixS1(String s)
	{
		s1 = s;
	}
	
	public int getIndex()//버그 위치 값 반환
	{
		return n;
	}
	
}
