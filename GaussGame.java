/*
 * @author Pxy
 * @猜数字游戏类
 * 
 */
package threeclass;
import java.util.Scanner;
public class GaussGame {
	public Player player1;
	public Player player2;
	public Player player3;
	/*
	 * @构造函数，创建三个玩家对象
	 */
	public GaussGame() {
		 player1=new Player();
		 player2=new Player();
		 player3=new Player();
	}
	public void startGame() {
		player1.guess();//这里有个bug，三个玩家的随机数只生成一次，方便游戏结束，不然很难结束游戏
		player2.guess();
		player3.guess();
		Scanner input=new Scanner(System.in);
		do//循环
		{
		System.out.println("Please player1 guess one number from 1 to 9.");
		int number1=input.nextInt();
		if(number1==player1.number)
			{
			player1.money=player1.money+1;
			System.out.println("you win 1 rmb!");
			}
		else 
			{
			player1.money=player1.money-1;
			System.out.println("you lose 1 rmb!");
			}
		System.out.println("Please player2 guess one numberfrom 1 to 9.");
		int number2=input.nextInt();
		if(number2==player2.number)
		{
			player2.money=player2.money+1;
			System.out.println("you win 1 rmb!");
		}
		else 
		{
			player2.money=player2.money-1;
			System.out.println("you lose 1 rmb!");
		}
		System.out.println("Please player3 guess one numberfrom 1 to 9.");
		int number3=input.nextInt();
		if(number3==player3.number)
		{
			player3.money=player3.money+1;
			System.out.println("you win 1 rmb!");
		}
		else 
		{
			player3.money=player3.money-1;
			System.out.println("you lose 1 rmb!");
		}
		}//当三个玩家谁赢了两块钱就结束循环
		while(player1.money<=1&&player2.money<=1&&player3.money<=1);
		String temp;//方便输出结果，简化代码长度
		if(player1.money>=0)
			temp="赢了";
		else
		{
		temp="输了";
		player1.money=Math.abs(player1.money);//变为负数时要取取绝对值
		}
		System.out.println("player1"+temp+player1.money+"元");
		if(player2.money>=0)
			temp="赢了";
		else
		{
			temp="输了";
			player2.money=Math.abs(player2.money);
		}
		System.out.println("player2"+temp+player2.money+"元");
		if(player3.money>=0)
			temp="赢了";
		else
		{
			temp="输了";
			player3.money=Math.abs(player3.money);
		}
		System.out.println("player3"+temp+player3.money+"元");
	}
}
