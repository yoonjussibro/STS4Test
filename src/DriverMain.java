
public class DriverMain {

    public static void main(String[] args) {
	Vehicle v = new Vehicle();
	v.run();
	
	Bus b = new Bus();
	b.run();
	
	Taxi t = new Taxi();
	t.run();
	
	v = b;
	v.run();
	v = t;
	v.run();
	
	v = new Vehicle();
	
	
	System.out.println();
//	동일한 메서드를 실행하지만 매개 변수에 따라서 출력되는 형태가 변경 됨
//	사용방법은 동일, 결과는 다름
	
	Driver d = new Driver();
	d.drive(v);
	d.drive(b);
	d.drive(t);

    }

}
