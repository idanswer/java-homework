/*
 * @author Pxy
 * @��������Ϸ��
 * 
 */
package threeclass;
import java.util.Scanner;
public class GaussGame {
	public Player player1;
	public Player player2;
	public Player player3;
	/*
	 * @���캯��������������Ҷ���
	 */
	public GaussGame() {
		 player1=new Player();
		 player2=new Player();
		 player3=new Player();
	}
	public void startGame() {
		player1.guess();//�����и�bug��������ҵ������ֻ����һ�Σ�������Ϸ��������Ȼ���ѽ�����Ϸ
		player2.guess();
		player3.guess();
		Scanner input=new Scanner(System.in);
		do//ѭ��
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
		}//���������˭Ӯ������Ǯ�ͽ���ѭ��
		while(player1.money<=1&&player2.money<=1&&player3.money<=1);
		String temp;//�������������򻯴��볤��
		if(player1.money>=0)
			temp="Ӯ��";
		else
		{
		temp="����";
		player1.money=Math.abs(player1.money);//��Ϊ����ʱҪȡȡ����ֵ
		}
		System.out.println("player1"+temp+player1.money+"Ԫ");
		if(player2.money>=0)
			temp="Ӯ��";
		else
		{
			temp="����";
			player2.money=Math.abs(player2.money);
		}
		System.out.println("player2"+temp+player2.money+"Ԫ");
		if(player3.money>=0)
			temp="Ӯ��";
		else
		{
			temp="����";
			player3.money=Math.abs(player3.money);
		}
		System.out.println("player3"+temp+player3.money+"Ԫ");
	}
}
