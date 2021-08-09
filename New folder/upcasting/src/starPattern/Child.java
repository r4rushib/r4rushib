package starPattern;

public class Child extends Parent{

	public static void main(String[] args) {

		Child c = new Child();
		c.same2();	
	
	}
  public void same() {
		
		System.out.println("child"+" class method");
		
	}
  public void same2() {
		Child.super.same();
		System.out.println(super.sup);
  }
}
