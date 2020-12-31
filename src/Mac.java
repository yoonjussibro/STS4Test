
public class Mac extends Character{
    @Override
    public void move() {
	System.out.println("맥크리가 이동합니다.");
    }
    
    @Override
    public void stop() {
	System.out.println("맥크리가 멈춥니다.");
    }
    
    @Override
    public void attack() {
	System.out.println("맥크리가 리볼버로 공격합니다.");
    
    }
    @Override
    public void skill() {
	System.out.println("맥크리가 황야의 무법자를 사용합니다.");
    }
}
