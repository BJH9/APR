package edu.handong.apr2;

public class AutoProgramRepairMain {

	public static void main(String[] args)
	{
		 String input1, input2;
		 int p;
		
	    FaultLocalizationFinder Fl = new FaultLocalizationFinder("poeraqrq", "fdseabsd");
	    FaultSolver Fs = new FaultSolver();
	    TestcaseFinder Tf = new TestcaseFinder("pass", "aaapass", "sadfsadffds");
	    
	    input1 = Fl.gradeScore(Fl.getS1());
	    input2 = Fl.gradeScore(Fl.getS2());
	    if(Fl.compareScore(input1, input2) != 1)//1을 반환하지 않으면 결함이 없다.
	    {
	    	System.out.println("결함이 없음");
	    }
	    
	    else//결함이 발생한 경우
	    {
	    	Fl.localizeFault(Fl.getS1());
	    	
	    	for(p = 0; p < 3; p++)
	    	{
	    		Tf.verifyTestcase(p);
	    	}
	    	
	    	for(p = 0; p < 2; p++)
	    	{
	    		Tf.showPlausiblePatch(p);
	    	}
	    	
	    	Tf.validatePatch();
	    }
	    	
	    
	}
	
	
	
}
