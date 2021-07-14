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
	    if(Fl.compareScore(input1, input2) != 1)
	    {
	    	System.out.println("FL ½ÇÆÐ");
	    }
	    
	    else
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
