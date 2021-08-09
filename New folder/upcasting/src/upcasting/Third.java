package upcasting;

public interface Third {
	
	Object multi();
	
	default Object div() {
		System.out.println("   ");
		return null;
	}
	

}
