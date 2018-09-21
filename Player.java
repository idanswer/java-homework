package threeclass;

public class Player {
	public  int number;
	public  int money=0;
	public  void guess() {
		number=(int) (Math.random()*10);
	}
}
