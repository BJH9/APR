package edu.handong.csee.isel.apr;
import java.util.Scanner;

/*constructor를 통해 테스트케이스들을 입력받는다. 
 * 테스트케이스를 갖고 버그코드에 조건에 맞는 수정을 해 코드에 적용해배고 조건을 모두 통과한 코드를 plausible code로 판단해 배열에 담는다.
 * 사용자가 직접 번호를 눌러 수동적으로 correct patch를 선정한다.
 */

public class TestcaseFinder extends FaultSolver{

	private static int i;
	private String  test2, test3;
	private static String[] arrayS1;
	
	public TestcaseFinder() {
		
	}
	
	static {
		arrayS1 = new String[10];
		i = 0;
	}
	
	public TestcaseFinder(String t2, String t3) {
		
		test2 = t2;
		test3 = t3;
	}
	
	public void verifyTestcase(int t) {// testcases을 적용해 plausible patch를 찾는다
		if(t == 0) {
			removeFault(); // 0이 입력되면 삭제함으로써 버그 수정
		
		
		System.out.println("deleted: " + getS1());
		}
		
		if(t == 1) {//1이 입력되면 대체함으로써 버그 수정
			
				replaceFault(test2);
			
			
			
			System.out.println("replaced: " + getS1());
		}
		
		if(t == 2) {//2가 입력되면 삽입함으로써 버그를 수정
			
				insertFault(test3);
			
			
			
			
			System.out.println("added: " + getS1());
			System.out.println();
			
			
		}
		
		if(getS1().contains("pass") || !getS1().contains("a")) {//pass라는 글자가 입력되어 있으면 plausible patch
			arrayS1[i] = getS1();
			i++;
		}
		
		setOriginToS1();
	}
	
	public void showPlausiblePatch(int k) {
		System.out.println("plasubile patch");
		System.out.println(k + " : " + arrayS1[k]);
		System.out.println();
	}
	
	public void validatePatch() {//correct patch
		System.out.println("correct patch 선택");
		
		int k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		sc.close();
		
		fixS1(arrayS1[k]);
		System.out.println(getS1());
	}
	
}
