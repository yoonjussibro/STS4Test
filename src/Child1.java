
public class Child1 extends Parent1{
    public String name;
    public final String email;
    
    public Child1(String name, String email) {
	this.name = name;
	this.email = email;
    }
    
    @Override
    public void output1() {
	System.out.println("Child의 output1 메서드");
    }
    
//    output2 메서드는 부모 클래스에서 final 메서드로 선언하였기 때문에 클래스를
//    상속 받아도 해당 메서드를 오버라이딩 할 수 없음
//    @Override
//    public void output2() {
//	System.out.println("Child1의 output2 메서드");
//    }
}
