package project_Rain;
import java.util.*;

public class line {
	 public static ArrayList<ArrayList<Station>> AllLine; // ��ü ��� ȣ���� �ƿ츣�� line
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
	      // 1ȣ�� ����
	      line1.add(new Station(11, "����"));
	      line1.add(new Station(12, "����"));
	      line1.add(new Station(13, "�ŵ���"));
	      line1.add(new Station(14, "������"));
	      line1.add(new Station(15, "�ű�"));
	      line1.add(new Station(16, "���"));

	      // 2ȣ�� ����
	      line2.add(new Station(21, "��������û"));
	      line2.add(new Station(22, "����"));
	      line2.add(new Station(23, "�ŵ���"));
	      line2.add(new Station(24, "�븲"));
	      line2.add(new Station(25, "���ε����д���"));
	      line2.add(new Station(26, "�Ŵ��"));
	      
	      line3.add(new Station(31, "����"));
	      line3.add(new Station(32, "����"));
	      line3.add(new Station(33, "��������û"));
	      line3.add(new Station(34, "����������"));
	      line3.add(new Station(35, "�ű�"));
	      line3.add(new Station(36, "���ǵ�"));

	      AllLine.add(line1);
	      AllLine.add(line2);
	      AllLine.add(line3);
	   }

	   public void showLine() {

	      for (int i = 0; i < AllLine.size(); i++) {
	         System.out.println((i + 1) + "ȣ��");
	         for (int j = 0; j < AllLine.get(i).size(); j++) {
	            System.out.print(AllLine.get(i).get(j).name + "\t");
	         }
	         System.out.println();
	      }
	   }

	   public int totalStation(ArrayList<ArrayList<Station>> line) // ����ö ���� ���� ���ϴ� �Լ�
	   {
	      int lineCount = 0; // ����ö ȣ���� ����
	      int stationCount = 0; // ���� ����
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

	   public int findStationIndex(ArrayList<Station> line, String name) { // Ư�� ȣ�� �ȿ��� �̸� ������ �ش� �� �ε��� �ش�.
	      int stationCountInLine = line.size(); // �� ���� �ȿ� �ִ� ���� ����
	      for (int i = 0; i < stationCountInLine; i++) {
	         if (name.equals(line.get(i).getName())) {
	            return i;
	         }
	      }
	      return -1;
	   }

	   public String findStationName(ArrayList<Station> line, int code) { // Ư�� ȣ�� �ȿ��� �ڵ� ������ �ش� �� �̸� �ش�.
	      int stationCountInLine = line.size(); // �� ���� �ȿ� �ִ� ���� ����
	      for (int i = 0; i < stationCountInLine; i++) {
	         if (line.get(i).getCode() == code) {
	            return line.get(i).getName();
	         }
	      }
	      return null;
	   }

	   public ArrayList<Station> findStationInAll(ArrayList<ArrayList<Station>> line, String name) {// ���ϴ� ����ö ���� ã�´�.
	      ArrayList<Station> a = new ArrayList<Station>(); // �ڵ� �������� �� ����
	      Station[] temp = new Station[6];
	      int k = 0;
	      for(k = 0; k < 6; k++)
	         temp[k] = new Station();
	      
	      k = 0;
	      
	      for (int i = 0; i < line.size(); i++) {
	         for (int j = 0; j < line.get(i).size(); j++) {
	            if (name.equals(line.get(i).get(j).getName())) { // ���� �̸��� ���ٸ�
	               temp[k].setName(name);
	               temp[k].setCode(line.get(i).get(j).code); // �ڵ带 ��´�.
	               a.add(temp[k++]); // ���Ⱑ �̻���
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
