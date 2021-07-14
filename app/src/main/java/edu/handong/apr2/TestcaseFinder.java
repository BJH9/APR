package edu.handong.apr2;
import java.util.Scanner;

public class TestcaseFinder extends FaultSolver{

	private static int i;
	private String test1, test2, test3;
	private static String[] arrayS1;
	
	public TestcaseFinder() {
		
	}
	
	static {
		arrayS1 = new String[10];
		i = 0;
	}
	
	public TestcaseFinder(String t1, String t2, String t3) {
		test1 = t1;
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
		
		fixS1(arrayS1[k]);
		System.out.println(getS1());
	}
	
}
