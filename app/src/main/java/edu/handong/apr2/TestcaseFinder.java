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
	
	public void verifyTestcase(int t) {// testcases�� ������ plausible patch�� ã�´�
		if(t == 0) {
			removeFault(); // Ư�� ���ǿ����� ����
		
		
		System.out.println("deleted: " + getS1());
		}
		
		if(t == 1) {
			
				replaceFault(test2);
			
			
			
			System.out.println("replaced: " + getS1());
		}
		
		if(t == 2) {
			
				insertFault(test3);
			
			
			
			
			System.out.println("added: " + getS1());
			System.out.println();
			
			
		}
		
		if(getS1().contains("pass") || !getS1().contains("a")) {//pass��� ���ڰ� �ԷµǾ� ������ ����� ����
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
	
	public void validatePatch() {
		System.out.println("correct patch ����");
		
		int k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		
		fixS1(arrayS1[k]);
		System.out.println(getS1());
	}
	
}
