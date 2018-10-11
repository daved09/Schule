package collections.a1;



public class StopWatch {
	long start;
	public void start(){
		start = System.currentTimeMillis();
	}
	
	public void stop(String text){
		long end = System.currentTimeMillis();
		System.out.println(text + ": " + (end-start) + "ms");
		
	}
}


