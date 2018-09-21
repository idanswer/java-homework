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
		//试试建类就直接调用构造函数
		//Car one=new Car("Bumblebee",20.0,1);
		//System.out.println(one.name+" "+one.tank+" "+one.oilConsumption);
		//试试输入
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		/*
		String name;
		name =input.nextLine();
		double oil;
		oil=input.nextDouble();
		int oilConsumption;
		oilConsumption=input.nextInt();
		Car two=new Car(name,oil,oilConsumption);
		System.out.println(two.name+" "+two.tank+" "+two.oilConsumption);
		*/
		//作业 建数组类 用户输入每辆车的属性
		Car[] AutoBots=new Car[5];
		String name;
		//System.out.println("please input the same tank and oilcost");
		//double oil;
		//int oilConsumption;
		//oil=input.nextDouble();
		//oilConsumption=input.nextInt();
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
			Car temp=new Car(name);
			AutoBots[i]=temp;
		}
		System.out.println("Optimus Prime:Autobots, ROLL OUT!");
		for(int j=0;j<5;j++) 
			System.out.println(AutoBots[j].name+" "+"get it!");
	}

}
