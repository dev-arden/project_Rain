package project_Rain;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		line subway = new line();
		
		
		user user1 = new user();
		user user2 = new user();
		user user3 = new user();
		Alluser a = new Alluser();
		
		a.Alluser.add(user1);
		a.Alluser.add(user2);
		a.Alluser.add(user3);

		subway.setLine();
		subway.showLine();

		user1.userpick();
		user2.userpick();
		user3.userpick();

		for (int i = 0; i < 2; i++) {
			user1.bufferSearch();
			user2.bufferSearch();
			user3.bufferSearch();
		}

		user1.bufferShow();
		user2.bufferShow();
		user3.bufferShow();
		
		makeCommon(a);
	}	
	

	public static void makeCommon(Alluser a) {
//		for (int i = 0; i < a.user1.buffer.size(); i++) {
//			for (int j = 0; j < a.user2.buffer.size(); j++) {
//				if (user1.buffer.get(i).name.equals(user2.buffer.get(j).name)) {
//					String common = user1.buffer.get(i).name;
//					// 공통집합에 중복이 있는지 검사하기
//					if (!commonset.contains(common)) {
//						commonset.add(common);
//					}
//				}
//			}
//		}
		ArrayList<String> commonset = new ArrayList<String>();
		ArrayList<String> common_01 = new ArrayList<String>();
		
		
	
			for(int i = 0; i<a.Alluser.get(0).buffer.size();i++) 
			{
				for(int j = 0; j<a.Alluser.get(1).buffer.size();j++)
				{
					if(a.Alluser.get(0).buffer.get(i).name.equals(a.Alluser.get(1).buffer.get(j).name))
					{
						String test = a.Alluser.get(0).buffer.get(i).name;
						if(!common_01.contains(test)) {
							//System.out.println(test);
							common_01.add(test);	
						}
					}
				}
			}
		
			for(int j=0;j<a.Alluser.get(2).buffer.size();j++) {
				for(int i = 0; i < common_01.size();i++) {
					if(a.Alluser.get(2).buffer.get(j).name.equals(common_01.get(i))) {
						String test = common_01.get(i);
						if(!commonset.contains(test)) {
							commonset.add(test);
						}
					}
				}
			}
			
								
		for (int i = 0; i < commonset.size(); i++) {
			System.out.print(commonset.get(i));
		}
	}
}

