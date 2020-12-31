
public class ChildMain {

    public static void main(String[] args) {
	Parent1 p1 = new Parent1();
	p1.output1();
	p1.output2();
	
	Child1 c1 = new Child1("유재석", "you@gmail.com");
	c1.output1();
	c1.output2(); // 상속받은 Child1에서 output2 메서드를 오버라이딩 할 수 없기 때문에 부모 클래스인 Parent1의 output2 메서드를 그대로 사용함
	
	System.out.println("c1.name" + c1.name);
	c1.name = "아이유";
	System.out.println("c1.name" + c1.name);
	System.out.println("c1.name" + c1.email);
//	c1.email = "im@gmail.com"; // Child1의 멤버 변수인 email은 final을 사용하였기 때문에 수정이 불가능함
	
//	Parent2 클래스는 final을 사용하여 다른 클래스가 상속 받을 수 없음
	Parent2 p2 = new Parent2();
	p2.output();
	
	

    }

}
