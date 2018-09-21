/*
 *   @玩家类
 *   @author Pxy
 */
public class Player {
	public  int number;
	public  int money=0;//初始值为0
	public  void guess() {
		number=(int) (Math.random()*10);//Math.random范围是[0.0,1.0)
	}
}
