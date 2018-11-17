package project_Rain;

import java.util.*;

public class Main {	
	public static ArrayList<Integer> commonset;
	
	public static void main(String[] args) {
		commonset = new ArrayList<Integer>();
		System.out.println("test");
		int user1_check1 = -1000;
		int user1_check2 = -1000;//값이 안바뀔경우 대비
		
		int user1set_size = 0;
		
		int user2_check1 = -1000;
		int user2_check2 = -1000;//값이 안바뀔경우 대비
		
		int user2set_size = 0;
		
		line subway = new line();
		subway.setLine();
		subway.showLine();
		
		user user1 = new user();
		System.out.println("\n지하철 고르쇼");
		Scanner sc = new Scanner(System.in);
		user1.userstation = sc.next();		
		sc.nextLine();
		//sc.close();	
		String point1 = user1.userstation;
		
		user user2 = new user();
		System.out.println("\n지하철 고르쇼");
		Scanner sc2 = new Scanner(System.in);
		user2.userstation = sc2.next();		
		sc2.nextLine();
		//sc2.close();
		String point2 = user2.userstation;
		
		
		for(int i=0; i<subway.line1.size();i++){
			if(subway.line1.get(i).name.contains("신도림")) {
				System.out.println(i + "신도림 인덱스");
			}
		}
		
		
		//user1이 선택한 것.
		for(int i = 0 ; i < subway.line1.size() ; i++){
			if(point1.equals(subway.line1.get(i).name)) {
				System.out.println(point1 + "의 코드:" +subway.line1.get(i).code);
				user1.userset.add(subway.line1.get(i).code);
				user1_check1 = i;
			}
		}
		
		//System.out.println("1의 처음 첵원" + user1_check1);
		
		if(user1_check1 == -1000) {
		//사용자가 선택한 역이 1호선에 없어
		}
		else if(user1_check1 < 0) {
			user1.userset.add(subway.line1.get(user1_check1+1).code);
			user1set_size++;
			//user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == 0) {
		//사용자가 선택한 역이 종점일 때	
			user1.userset.add(subway.line1.get(user1_check1+1).code);
			user1set_size++;
			//user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == subway.line1.size() - 1) {
		//사용자가 선택한 역이 종점일 때
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1set_size++;
			//user1_check1 = user1_check1 - 1;
		}
		else {
		//사용자가 선택한 역이 1호선에 있고 종점이 아닐 떄
			user1.userset.add(subway.line1.get(user1_check1+1).code);
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1set_size++;
			user1set_size++;
		//이 때는 앞으로 가도 되고 뒤로 가도 됨!!!!일단 -1로 앞으로 전진
			//user1_check1 = user1_check1 - 1;
		}
	
		//System.out.println("1의 두번째 첵원" + user1_check1);
		
		for(int i = 0 ; i < subway.line2.size() ; i++){
			if(point1.equals(subway.line2.get(i).name)) {
				System.out.println(point1 + "의 코드:" +subway.line2.get(i).code);
				user1.userset.add(subway.line2.get(i).code);
				user1_check2 = i;
			}
		}
		//System.out.println("1의 첫번째 첵투" + user1_check2);
		
		
		if(user1_check2 == -1000) {
		//사용자가 선택한 역이 2호선에 없을 때
		}
		else if(user1_check2 < 0) {
			user1.userset.add(subway.line2.get(user1_check2+1).code);
			//user1_check2 = user1_check2 - 1;
		}
		else if(user1_check2 == 0) {
		//사용자가 선택한 역이 종점일 때
			user1.userset.add(subway.line2.get(user1_check2+1).code);
			//user1_check2 = user1_check2 - 1;
		}
		else if(user1_check2+1 == subway.line2.size() - 1) {
		//사용자가 선택한 역이 종점일 때
			user1.userset.add(subway.line2.get(user1_check2-1).code);
			//user1_check2 = user1_check2 - 1;
		}
		else {
		//사용자가 선택한 역이 2호선에 있고 종점이 아닐 때
			user1.userset.add(subway.line2.get(user1_check2+1).code);
			user1.userset.add(subway.line2.get(user1_check2-1).code);
		//이 때는 앞으로 가도 되고 뒤로 가도 되고 일단 앞으로 가자.
			//user1_check2 = user1_check2 - 1;
		}
		//System.out.println("1의 두번째 첵투" + user1_check2);
		
		System.out.println("user1 집합");
		for(int i = 0; i < user1.userset.size(); i++) {
            System.out.print(user1.userset.get(i)+"\t");
        }
		
		System.out.println();
		
		//user2가 선택한 것
		for(int i = 0 ; i < subway.line1.size() ; i++){
			if(point2.equals(subway.line1.get(i).name)) {
				System.out.println(point2 + "의 코드:" +subway.line1.get(i).code);
				user2.userset.add(subway.line1.get(i).code);
				//System.out.println("user2의 처음 추가된 코드"+user2.userset.get(i));
				user2_check1 = i;
			}
		}
		//System.out.println("2의 첫번째 첵원" + user2_check1);
		if(user2_check1 == -1000) {
			//사용자가 선택한 역이 1호선에 없을 때
			}
		else if(user2_check1 < 0) {
			user2.userset.add(subway.line1.get(user2_check1+1).code);
			//user2_check1 = user2_check1 - 1;
		}
		else if(user2_check1 == 0) {
			//사용자가 선택한 역이 종점일 때
			user2.userset.add(subway.line1.get(user2_check1+1).code);
			//user2_check1 = user2_check1 - 1;
		}
		else if(user2_check1+1 == subway.line1.size() - 1) {
			//사용자가 선택한 역이 종점일 때
			user2.userset.add(subway.line1.get(user2_check1-1).code);
			//user2_check1 = user2_check1 - 1;
		}
		else {
			//사용자가 선택한 역이 1호선에 있고 종점이 아닐 때
			user2.userset.add(subway.line1.get(user2_check1+1).code);
			user2.userset.add(subway.line1.get(user2_check1-1).code);
			//이 때는 앞으로 가도 되고 뒤로 가도 되고 일단 앞으로 가자.
			//user2_check1 = user2_check1 - 1;
		}
		//System.out.println("2의 두번째 첵원" + user2_check1);
		
		for(int i = 0 ; i < subway.line2.size() ; i++){
			if(point2.equals(subway.line2.get(i).name)) {
				System.out.println(point2 + "의 코드:" +subway.line2.get(i).code);
				user2.userset.add(subway.line2.get(i).code);
				user2_check2 = i;
			}
		}
		//System.out.println("2의 첫번째 첵투" + user2_check2);
		
		if(user2_check2 == -1000) {
			//사용자가 선택한 역이 2호선에 없을 때
			}
		else if(user2_check2 < 0) {
			user2.userset.add(subway.line2.get(user2_check2+1).code);
			//user2_check2 = user2_check2 - 1;
		}
		else if(user2_check2 == 0) {
			//사용자가 선택한 역이 종점일 때
			user2.userset.add(subway.line2.get(user2_check2+1).code);
			//user2_check2 = user2_check2 - 1;
		}
		else if(user2_check2+1 == subway.line2.size() - 1) {
			//사용자가 선택한 역이 종점일 때
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			//user2_check2 = user2_check2 - 1;
		}
		else {
			//사용자가 선택한 역이 1호선에 있고 종점이 아닐 때
			user2.userset.add(subway.line2.get(user2_check2+1).code);
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			//이 때는 앞으로 가도 되고 뒤로 가도 되고 일단 앞으로 가자.
			//user2_check2 = user2_check2 - 1;
		}
		//System.out.println("2의 두번째 첵투" + user2_check2);
		
		
		System.out.println("user2 집합");
		for(int i = 0; i < user2.userset.size(); i++) {
            System.out.print(user2.userset.get(i)+"\t");
        }
		
		//user1과 user2의 userset 비교
		for(int i=0; i<user1.userset.size(); i++) {
			for(int j=0; j<user2.userset.size();j++) {
				if(user1.userset.get(i).equals(user2.userset.get(j))) {
					int common = user1.userset.get(i);
					commonset.add(common);
				}
			}
		}
        
		
		System.out.println("\n공통 지하철 역 코드");
		for(int i = 0; i < commonset.size(); i++) {
            System.out.print(commonset.get(i)+"\t");
        }
		
		///테스트
		
		System.out.println("\n----------------2칸 늘렸을 때-------------\n");
		System.out.println("\n유저1확인");
		

		
		//인덱스 하나 앞으로 뺀게 있는지 없는지 검사
		//for(int i = 0 ; i < subway.line1.size() ; i++){
//			if(!(user1_check1 - 2 < 0)) {
//				for(int i=0; i<subway.line1.size();i++){
//					if(subway.line1.get(i).name.contains(subway.line1.get(user1_check1-2).name)) {
//						user1.userset.add(subway.line1.get(user1_check1-2).code);
//					}
//				}
//			}
			

		//}
		//for(int i = 0 ; i < subway.line2.size() ; i++){
//			if(!(user1_check1 - 2 < 0)) {
//				for(int i=0; i<subway.line2.size();i++){
//					if(subway.line2.get(i).name.contains(subway.line1.get(user1_check1-2).name)) {
//						String testname = subway.line1.get(user1_check1-2).name;
//						int testindex = subway.line2.indexOf(testname);
//						user1.userset.add(subway.line2.get(testindex).code);
//				}
//			}
//		}
		//}
		//for(int i = 0 ; i < subway.line1.size() ; i++){
//			if(user1_check1 + 2 < subway.line1.size()) {
//				for(int i=0; i<subway.line1.size();i++){
//					if(subway.line1.get(i).name.contains(subway.line1.get(user1_check1+2).name)) {
//					user1.userset.add(subway.line1.get(user1_check1+2).code);
//				}
//			}
//		}
			
			
		//}
		//for(int i = 0 ; i < subway.line2.size() ; i++){
			//if(user1_check1 + 2 < subway.line1.size()) {
//				for(int i=0; i<subway.line2.size();i++){
//					if(subway.line2.get(i).name.contains(subway.line1.get(user1_check1+2).name)) {
//						String testname = subway.line1.get(user1_check1+2).name;
//						System.out.println(testname);
//						int testindex = subway.line2.indexOf(testname);
//						System.out.println(testindex);
//						//user1.userset.add(subway.line2.get(testindex).code);
//					}
//				}

		//}
		
		
//		for(int i = 0 ; i < subway.line1.size() ; i++){
//			if(user1_check1 == subway.line1.get(i).code) {
//				if(user1_check1 == -1000) {
//					
//				}
//				else if(user1_check1 < 0) {
//					user1.userset.add(subway.line1.get(user1_check1+3).code);
//					user1_check1 = user1_check1 - 1;
//				}
//				else if(user1_check1 == 0) {
//					user1.userset.add(subway.line1.get(user1_check1+3).code);
//					user1_check1 = user1_check1 - 1;
//				}
//			
//				else if(user1_check1 == subway.line1.size() - 1) {
//					user1.userset.add(subway.line1.get(user1_check1-1).code);
//					user1_check1 = user1_check1 - 1;
//				}
//				else {
//					user1.userset.add(subway.line1.get(user1_check1+3).code);
//					user1.userset.add(subway.line1.get(user1_check1-1).code);
//					user1_check1 = user1_check1 - 1;
//				}
//			}
//		}
		
		
		if(user1_check1 == -1000) {
			
		}
		else if(user1_check1 < 0) {
			user1.userset.add(subway.line1.get(user1_check1+3).code);
			user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == 0) {
			user1.userset.add(subway.line1.get(user1_check1+3).code);
			user1_check1 = user1_check1 - 1;
		}
	
		else if(user1_check1 == subway.line1.size() - 1) {
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1_check1 = user1_check1 - 1;
		}
		else {
			user1.userset.add(subway.line1.get(user1_check1+3).code);
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1_check1 = user1_check1 - 1;
		}
		
		
		
//		for(int i = 0 ; i < subway.line2.size() ; i++){
//			if(user1_check2 == subway.line2.get(i).code) {
				if(user1_check2 == -1000) {
					
				}
				else if(user1_check2 < 0) {
					user1.userset.add(subway.line2.get(user1_check2+3).code);
					user1_check2 = user1_check2 - 1;
				}
				else if(user1_check2 == 0) {
					user1.userset.add(subway.line2.get(user1_check2+3).code);
					user1_check2 = user1_check2 - 1;
				}
				else if(user1_check2 == subway.line2.size() - 1) {
					user1.userset.add(subway.line2.get(user1_check2-1).code);
					user1_check2 = user1_check2 - 1;
				}
				else {
					user1.userset.add(subway.line2.get(user1_check2+3).code);
					user1.userset.add(subway.line2.get(user1_check2-1).code);
					user1_check2 = user1_check2 - 1;
				}	
			//}
//		}
		
		
		for(int i = 0; i < user1.userset.size(); i++) {
			System.out.print(user1.userset.get(i)+"\t");
		}
				
		
		System.out.println("\n유저2확인");
//		for(int i = 0 ; i < subway.line1.size() ; i++){
//			if(user2_check1 == subway.line1.get(i).code) {
				if(user2_check1 == -1000) {
					
				}
				else if(user2_check1 < 0) {
					user2.userset.add(subway.line1.get(user2_check1+3).code);
					user2_check1 = user2_check1 - 1;
				}
				else if(user2_check1 == 0) {
					user2.userset.add(subway.line1.get(user2_check1+3).code);
					user2_check1 = user2_check1 - 1;
				}
				else if(user2_check1+1 == subway.line1.size() - 1) {
					user2.userset.add(subway.line1.get(user2_check1-1).code);
					user2_check1 = user2_check1 - 1;
				}
				else {
					user2.userset.add(subway.line1.get(user2_check1+3).code);
					user2.userset.add(subway.line1.get(user2_check1-1).code);
					user2_check1 = user2_check1 - 1;
				}
//			}
//		}
		
//		for(int i = 0 ; i < subway.line2.size() ; i++){
//			if(user2_check2 == subway.line2.get(i).code) {
				if(user2_check2 == -1000) {
					
				}
				else if(user2_check2 < 0) {
					user2.userset.add(subway.line2.get(user2_check2+3).code);
					user2_check2 = user2_check2 - 1;
				}
				else if(user2_check2 == 0) {
					user2.userset.add(subway.line2.get(user2_check2+3).code);
					user2_check2 = user2_check2 - 1;
				}
				else if(user2_check2+1 == subway.line2.size() - 1) {
					user2.userset.add(subway.line2.get(user2_check2-1).code);
					user2_check2 = user2_check2 - 1;
				}
				else {
					user2.userset.add(subway.line2.get(user2_check2+3).code);
					//System.out.println(subway.line2.get(user2_check2+3).code + "찍어보자");
					user2.userset.add(subway.line2.get(user2_check2-1).code);
					//System.out.println(subway.line2.get(user2_check2-1).code + "찍어보자");
					user2_check2 = user2_check2 - 1;
				}
//			}
//		}
		for(int i = 0; i < user2.userset.size(); i++) {
            System.out.print(user2.userset.get(i)+"\t");
        }
		
		//user1과 user2의 userset 비교
		for(int i=0; i<user1.userset.size(); i++) {
			for(int j=0; j<user2.userset.size();j++) {
				if(user1.userset.get(i).equals(user2.userset.get(j))) {
					int common = user1.userset.get(i);
					commonset.add(common);
					}
				}
			}
		        
				
		System.out.println("\n공통 지하철 역 코드");
		for(int i = 0; i < commonset.size(); i++) {
			System.out.print(commonset.get(i)+"\t");
		}
		
		
		System.out.println("\n------------------테스트입니다-------------\n");
		System.out.println("\n유저1확인");
		if(user1_check1 == -1000) {
			System.out.println("설마여기였니,,,,,");
		}
		else if(user1_check1 < 0) {
			user1.userset.add(subway.line1.get(user1_check1+5).code);
			user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == 0) {
			user1.userset.add(subway.line1.get(user1_check1+5).code);
			user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == subway.line1.size() - 1) {
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1_check1 = user1_check1 - 1;
		}
		else {
			user1.userset.add(subway.line1.get(user1_check1+5).code);
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1_check1 = user1_check1 - 1;
		}
		
		
		if(user1_check2 == -1000) {
			
		}
		else if(user1_check2 < 0) {
			user1.userset.add(subway.line2.get(user1_check2+5).code);
			user1_check2 = user1_check2 - 1;
		}
		else if(user1_check2 == 0) {
			user1.userset.add(subway.line2.get(user1_check2+5).code);
			user1_check2 = user1_check2 - 1;
		}
		else if(user1_check2 == subway.line2.size() - 1) {
			user1.userset.add(subway.line2.get(user1_check2-1).code);
			user1_check2 = user1_check2 - 1;
		}
		else {
			user1.userset.add(subway.line2.get(user1_check2+5).code);
			user1.userset.add(subway.line2.get(user1_check2-1).code);
			user1_check2 = user1_check2 - 1;
		}	
		
		for(int i = 0; i < user1.userset.size(); i++) {
            System.out.print(user1.userset.get(i)+"\t");
        }
		
		
		
		
		System.out.println("\n유저2확인");
		if(user2_check1 == -1000) {
			
		}
		else if(user2_check1 < 0) {
			user2.userset.add(subway.line1.get(user2_check1+5).code);
			user2_check1 = user2_check1 - 1;
		}
		else if(user2_check1 == 0) {
			user2.userset.add(subway.line1.get(user2_check1+5).code);
			user2_check1 = user2_check1 - 1;
		}
		else if(user2_check1+1 == subway.line1.size() - 1) {
			user2.userset.add(subway.line1.get(user2_check1-1).code);
			user2_check1 = user2_check1 - 1;
		}
		else {
			System.out.println(user2_check1);
			user2.userset.add(subway.line1.get(user2_check1+5).code);
			user2.userset.add(subway.line1.get(user2_check1-1).code);
			user2_check1 = user2_check1 - 1;
		}
		
		//System.out.println(user2_check2+"유저2첵2뭐야?");
		if(user2_check2 == -1000) {
			
		}
		else if(user2_check2 < 0) {
			user2.userset.add(subway.line2.get(user2_check2+5).code);
			user2_check2 = user1_check2 - 1;
		}
		else if(user2_check2 == 0) {
			user2.userset.add(subway.line2.get(user2_check2+5).code);
			user2_check2 = user2_check2 - 1;
		}
		else if(user2_check2+1 == subway.line2.size() - 1) {
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			user2_check2 = user2_check2 - 1;
		}
		else {
			user2.userset.add(subway.line2.get(user2_check2+5).code);
			//System.out.println(subway.line2.get(user2_check2+3).code + "찍어보자");
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			//System.out.println(subway.line2.get(user2_check2-1).code + "찍어보자");
			user2_check2 = user2_check2 - 1;
		}
	
		for(int i = 0; i < user2.userset.size(); i++) {
            System.out.print(user2.userset.get(i)+"\t");
        }
		
		
//		for(int i = 0 ; i < subway.line1.size() ; i++){
//			if(point.equals(subway.line1.get(i).name) || point.equals(subway.line2.get(i).name)) {
//				System.out.println(point + "의 코드:" +subway.line1.get(i).code);
//				
//			}
//		}
//		for(int i = 0; i< subway.line1.size();i++) {
//			if(subway.line1.get(i).name.contains(point)) {
//				stack.push(subway.line1.get(i).name);
//				stack.push(subway.line1.get(i-1).name);
//			}
//		}
		
	}
}

