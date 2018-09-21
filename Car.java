/*
 * 汽车类
 * @author Pxy
 * version 1.0
 * */
import java.util.*;
public class Car {
	public String name;//汽车类型名
	private double tank;//汽车油量
	private int oilConsumption;//汽车油耗
	/*加油
	 * @param addtank 加多少油
	 * */
	public void gas(double addtank) {
		tank=tank+addtank;
	};
	/*启动车
	 * @return 有油可以跑返回ture 没有返回false
	 * */
	public boolean run(int tank) {
		if(tank>=0)
			return true;
		else
			System.out.println("油量耗尽");
			return false;
	};
	public Car() {}
	public Car(String name) {
		this.name=name;
		this.tank=100;
		this.oilConsumption=1;
	}
	public Car(String name,double tank,int oilCinsumption) {
		this.name=name;
		this.tank=tank;
		this.oilConsumption=oilCinsumption;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		Car[] AutoBots=new Car[5];//建立汽车人对象数组
		String name;
		System.out.println("please input name of ever car!");
		/*
		 *  输入内容提供
		 * Optimus Prime 擎天柱
		 * Bumblebee 大黄蜂
		 * Jazz 爵士
		 * Ratchet 救护车/力捷
		 * ronhide 铁皮
		 * Hound 探长 
		 */
		for(int i=0;i<5;i++) {
			name =input.nextLine();
			Car temp=new Car(name);//每次temp赋给下一个对象时，之前的自动释放
			AutoBots[i]=temp;
		}
		System.out.println("Optimus Prime:Autobots, ROLL OUT!");
		for(int j=0;j<5;j++) 
			System.out.println(AutoBots[j].name+" "+"get it!");
	}

}
