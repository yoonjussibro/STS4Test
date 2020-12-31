
public class PhoneMain {

    public static void main(String[] args) {
	Phone p = new Phone();
	p.SendMsg();
	
	IPhone i = new IPhone();
	i.SendMsg();
	
	GalaxyPhone g = new GalaxyPhone();
	g.SendMsg();
	
	p = i;
	p.SendMsg();
	
	p = g;
	p.SendMsg();

    }

}
