package project_Rain;
import java.util.*;

public class line {
	 public static ArrayList<ArrayList<Station>> AllLine; // 전체 모든 호선을 아우르는 line
	   public static ArrayList<Station> line1;
	   public static ArrayList<Station> line2;
	   public static ArrayList<Station> line3;

	   public line() {
	      AllLine = new ArrayList<ArrayList<Station>>();
	      line1 = new ArrayList<Station>();
	      line2 = new ArrayList<Station>();
	      line3 = new ArrayList<Station>(); 
	   }

	   public void setLine() {
	      // 1호선 세팅
	      line1.add(new Station(11, "구일"));
	      line1.add(new Station(12, "구로"));
	      line1.add(new Station(13, "신도림"));
	      line1.add(new Station(14, "영등포"));
	      line1.add(new Station(15, "신길"));
	      line1.add(new Station(16, "대방"));

	      // 2호선 세팅
	      line2.add(new Station(21, "영등포구청"));
	      line2.add(new Station(22, "문래"));
	      line2.add(new Station(23, "신도림"));
	      line2.add(new Station(24, "대림"));
	      line2.add(new Station(25, "구로디지털단지"));
	      line2.add(new Station(26, "신대방"));
	      
	      line3.add(new Station(31, "오목교"));
	      line3.add(new Station(32, "양평"));
	      line3.add(new Station(33, "영등포구청"));
	      line3.add(new Station(34, "영등포시장"));
	      line3.add(new Station(35, "신길"));
	      line3.add(new Station(36, "여의도"));

	      AllLine.add(line1);
	      AllLine.add(line2);
	      AllLine.add(line3);
	   }

	   public void showLine() {

	      for (int i = 0; i < AllLine.size(); i++) {
	         System.out.println((i + 1) + "호선");
	         for (int j = 0; j < AllLine.get(i).size(); j++) {
	            System.out.print(AllLine.get(i).get(j).name + "\t");
	         }
	         System.out.println();
	      }
	   }

	   public int totalStation(ArrayList<ArrayList<Station>> line) // 지하철 역의 갯수 구하는 함수
	   {
	      int lineCount = 0; // 지하철 호선의 갯수
	      int stationCount = 0; // 역의 갯수
	      lineCount = line.size();
	      for (int i = 0; i < lineCount; i++)
	         stationCount += line.get(i).size();
	      return stationCount;
	   }

	   public int findLine(int code) {
	      for (int i = 0; i < AllLine.size(); i++)
	         for (int j = 0; j < AllLine.get(i).size(); j++)
	            if (AllLine.get(i).get(j).code == code)
	               return i;

	      return -1;
	   }

	   public int findStationIndex(ArrayList<Station> line, String name) { // 특정 호선 안에서 이름 넣으면 해당 역 인덱스 준다.
	      int stationCountInLine = line.size(); // 한 라인 안에 있는 역의 갯수
	      for (int i = 0; i < stationCountInLine; i++) {
	         if (name.equals(line.get(i).getName())) {
	            return i;
	         }
	      }
	      return -1;
	   }

	   public String findStationName(ArrayList<Station> line, int code) { // 특정 호선 안에서 코드 넣으면 해당 역 이름 준다.
	      int stationCountInLine = line.size(); // 한 라인 안에 있는 역의 갯수
	      for (int i = 0; i < stationCountInLine; i++) {
	         if (line.get(i).getCode() == code) {
	            return line.get(i).getName();
	         }
	      }
	      return null;
	   }

	   public ArrayList<Station> findStationInAll(ArrayList<ArrayList<Station>> line, String name) {// 원하는 지하철 역들 찾는다.
	      ArrayList<Station> a = new ArrayList<Station>(); // 코드 여러개일 수 있음
	      Station[] temp = new Station[6];
	      int k = 0;
	      for(k = 0; k < 6; k++)
	         temp[k] = new Station();
	      
	      k = 0;
	      
	      for (int i = 0; i < line.size(); i++) {
	         for (int j = 0; j < line.get(i).size(); j++) {
	            if (name.equals(line.get(i).get(j).getName())) { // 만약 이름이 같다면
	               temp[k].setName(name);
	               temp[k].setCode(line.get(i).get(j).code); // 코드를 담는다.
	               a.add(temp[k++]); // 여기가 이상함
	            }
	         }
	      }

	      return a;
	   }

	   public Station prevStation(ArrayList<Station> line, String name) {
	      int index = findStationIndex(line, name);
	      if (index == 0) {
	         return null;
	      }
	      return line.get(index - 1);
	   }

	   public Station nextStation(ArrayList<Station> line, String name) {
	      int index = findStationIndex(line, name);
	      if (index == (line.size()-1)) {
	         return null;
	      }
	      return line.get(index + 1);
	   }                                   
}
