package maccess;
import test.Addition;

public class DemoInterface1 {

	public static void main(String[] args) {
	
		Addition ad=new Addition();
		int k=ad.calcualte(5, 6);
		ad.dis(k);
		ad.dis(120);
	}

}
