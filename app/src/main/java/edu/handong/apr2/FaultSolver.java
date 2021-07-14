package edu.handong.apr2;

/*코드를 수정하는 메소드들을 포함하는 클래스
 * 삭제, 수정, 삽입 기능을 가진 메소드들을 갖는다.
 */

public class FaultSolver extends FaultLocalizationFinder{

	private static StringBuffer fixedS1;//s1의 값을 변화시키기 위해 stringbuffer를 사용
	private static String fixedSS;//stringbuffer값을 다시 string으로 바꿔서 여기에 저장 
	
	public FaultSolver()//초기화
	{
		
		fixedS1 = new StringBuffer(getS1());
		fixedSS = null;
	}
	public void removeFault()//해당부분을 삭제함으로써 버그를 수정
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.deleteCharAt(getIndex());
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	public void replaceFault(String s)//해당 부분을 s로 대체함으로써 버그를 수정
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.replace(getIndex(), getIndex(), s);
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	public void insertFault(String s)//해당 부분에 s를 삽입함으로써 버그를 수정
	{
		fixedS1 = new StringBuffer(getOriginS1());
		setOriginToS1();
		
		fixedS1.insert(getIndex(), s);
		fixedSS = fixedS1.toString();
		fixS1(fixedSS);
	}
	
	
}
