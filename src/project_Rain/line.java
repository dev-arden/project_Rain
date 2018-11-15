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
		//1호선 세팅
		line1.add(new Station(1,"구일"));
		line1.add(new Station(2,"구로"));
		line1.add(new Station(3,"신도림"));
		line1.add(new Station(4,"영등포"));
		line1.add(new Station(5,"신길"));
		line1.add(new Station(6,"대방"));
		
		//2호선 세팅
		line2.add(new Station(7,"영등포구청"));
		line2.add(new Station(8,"문래"));
		line2.add(new Station(9,"신도림"));
		line2.add(new Station(10,"대림"));
		line2.add(new Station(11,"구로디지털단지"));
		line2.add(new Station(12,"신대방"));
	}
	
	public static void showLine() {
		System.out.println("1호선");
		for(int i=0; i<line1.size();i++) {
			System.out.print(line1.get(i).name + "\t");
		}
		System.out.println("\n"+"2호선");
		for(int i=0; i<line2.size();i++) {
			System.out.print(line2.get(i).name + "\t");
		}
	}
}
