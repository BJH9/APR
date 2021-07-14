package edu.handong.csee.isel.apr;


/*construcor를 활용해 정상코드와 버그코드를 입력받고 그 두 개를 비교한다.
 만약 정상코드가 ep score를 받고 버그코드가 ef score 를 받으면 
 버그가 있고, faultlocalization 또한 가능한 것으로 판단해 1을 반환
 조건에 따라 버그 위치를 특정해 n에 저장
 */


public class FaultLocalizationFinder {

	private static String s1, s2, originS1, score; //s1: 버그코드, s2:정상코드, originS1:처음 입력받은 s1(버그코드)의 값, score:bug가 발생했는지, 어디서 발생했는지 확인하기 위해 입력되는 점수
	private static int n; //버그가 발생한 곳의 위치
	//s1은 실패하는 코드, s2는 성공하는 코드 
	public FaultLocalizationFinder() //버그가 발생한 곳의 위치 n과 점수 score를 초기화
	{
		n = 0;
		score = null;
	}
	
	public FaultLocalizationFinder(String a, String b)//버그코드,s1입력 정상코드,s2입력 originS1에 처음 값 입력
	{
		s1 = a;
		s2 = b;
		originS1 = s1;
		
	}
	
	
	public String getOriginS1()//처음 s1값 리턴
	{
		return originS1;
	}
	
	public void setOriginToS1()//s1의 값을 처음 입력받은 값으로 되돌린다
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
		if((a.contains("ef")) && (b.contains("ep")))//ef와 ep가 나오면 버그가 발생했다고 판단
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
	
	public void fixS1(String s)//s1의 값을 변경
	{
		s1 = s;
	}
	
	public int getIndex()//버그 위치 값 반환
	{
		return n;
	}
	
}
