package project_Rain;
import java.util.*;

public class line {
	public static ArrayList<Station> line1;
	public static ArrayList<Station> line2;
	
	public line() {
		line1 = new ArrayList<Station>();
		line2 = new ArrayList<Station>();
	}
	
	public static void setLine() {
		//1ȣ�� ����
		line1.add(new Station(1,"����"));
		line1.add(new Station(2,"����"));
		line1.add(new Station(3,"�ŵ���"));
		line1.add(new Station(4,"������"));
		line1.add(new Station(5,"�ű�"));
		line1.add(new Station(6,"���"));
		
		//2ȣ�� ����
		line2.add(new Station(7,"��������û"));
		line2.add(new Station(8,"����"));
		line2.add(new Station(9,"�ŵ���"));
		line2.add(new Station(10,"�븲"));
		line2.add(new Station(11,"���ε����д���"));
		line2.add(new Station(12,"�Ŵ��"));
	}
	
	public static void showLine() {
		System.out.println("1ȣ��");
		for(int i=0; i<line1.size();i++) {
			System.out.print(line1.get(i).name + "\t");
		}
		System.out.println("\n"+"2ȣ��");
		for(int i=0; i<line2.size();i++) {
			System.out.print(line2.get(i).name + "\t");
		}
	}
}
