/*
 * ������
 * @author Pxy
 * version 1.0
 * */
import java.util.*;
public class Car {
	public String name;//����������
	private double tank;//��������
	private int oilConsumption;//�����ͺ�
	/*����
	 * @param addtank �Ӷ�����
	 * */
	public void gas(double addtank) {
		tank=tank+addtank;
	};
	/*������
	 * @return ���Ϳ����ܷ���ture û�з���false
	 * */
	public boolean run(int tank) {
		if(tank>=0)
			return true;
		else
			System.out.println("�����ľ�");
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
		//���Խ����ֱ�ӵ��ù��캯��
		//Car one=new Car("Bumblebee",20.0,1);
		//System.out.println(one.name+" "+one.tank+" "+one.oilConsumption);
		//��������
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
		//��ҵ �������� �û�����ÿ����������
		Car[] AutoBots=new Car[5];
		String name;
		//System.out.println("please input the same tank and oilcost");
		//double oil;
		//int oilConsumption;
		//oil=input.nextDouble();
		//oilConsumption=input.nextInt();
		System.out.println("please input name of ever car!");
		/*
		 *  ���������ṩ
		 * Optimus Prime ������
		 * Bumblebee ��Ʒ�
		 * Jazz ��ʿ
		 * Ratchet �Ȼ���/����
		 * ronhide ��Ƥ
		 * Hound ̽�� 
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
