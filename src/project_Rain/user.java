package project_Rain;

import java.util.*;

public class user extends line {
	 public String userStationName;
	   public Station userStation;
	   public ArrayList<Station> buffer;
	   public ArrayList<Integer> index; // buffer �þ�������� index ������� ĭ 1ĭ ������ �� ���ۿ� 3�� ������� 3 �þ�� �̷� ��

	   public user() {
	      this.userStationName = null;
	      this.buffer = new ArrayList<Station>();
	      this.index = new ArrayList<Integer>();
	      this.index.add(0);

	   }

	   public void userpick() {
	      System.out.println("\n����ö ����");
	      Scanner sc = new Scanner(System.in);
	      userStationName = sc.nextLine();
	      //sc.close();
	      
	      System.out.println(this.userStationName + "���� �����ϼ̽��ϴ�.");
	      this.buffer.addAll(this.findStationInAll(AllLine, userStationName));
	   }

	public void bufferSearch() {

		boolean flag = true;
		int line = 0;
		String name;
		Station prev = new Station();
		Station next = new Station();

		this.index.add(this.buffer.size()); // ���� �� �̸� ������ ����� index�� ��´�.

		for (int i = this.index.get(this.index.size() - 2); i < this.index.get(this.index.size() - 1); i++) {

			line = this.findLine(this.buffer.get(i).code);
			name = this.buffer.get(i).name;

			prev = this.prevStation(AllLine.get(line), name);
			next = this.nextStation(AllLine.get(line), name);

			if (prev != null) { // null�� �ƴ϶�� ���� �Ͽ�
				for (int k = 0; k < this.index.get(this.index.size() - 1); k++) {
					if (prev.name.equals(this.buffer.get(k).name))
						flag = false;
				}
				if (flag == true) // �̸� ������ ���ٴ°�
					this.buffer.addAll(this.findStationInAll(AllLine, prev.name));
			}

			flag = true;

			if (next != null) { // null�� �ƴ϶�� ���� �Ͽ�
				for (int k = 0; k < this.index.get(this.index.size() - 1); k++) {
					if (next.name.equals(this.buffer.get(k).name))
						flag = false;
				}
				if (flag == true) // �̸� ������ ���ٴ°�
					this.buffer.addAll(this.findStationInAll(AllLine, next.name));
			}

		}

	} // buffer ���� �ִ� ������ ��ŭ

	   public void bufferShow() {
	      for (int i = 0; i < this.buffer.size(); i++) {
	         System.out.print(this.buffer.get(i).code + "," + this.buffer.get(i).name + "\t");
	      }
	      System.out.println();
	   }
}
