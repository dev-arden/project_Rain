package project_Rain;

import java.util.*;

public class Main {	
	public static ArrayList<Integer> commonset;
	
	public static void main(String[] args) {
		commonset = new ArrayList<Integer>();
		System.out.println("test");
		int user1_check1 = -1000;
		int user1_check2 = -1000;//���� �ȹٲ��� ���
		
		int user1set_size = 0;
		
		int user2_check1 = -1000;
		int user2_check2 = -1000;//���� �ȹٲ��� ���
		
		int user2set_size = 0;
		
		line subway = new line();
		subway.setLine();
		subway.showLine();
		
		user user1 = new user();
		System.out.println("\n����ö ����");
		Scanner sc = new Scanner(System.in);
		user1.userstation = sc.next();		
		sc.nextLine();
		//sc.close();	
		String point1 = user1.userstation;
		
		user user2 = new user();
		System.out.println("\n����ö ����");
		Scanner sc2 = new Scanner(System.in);
		user2.userstation = sc2.next();		
		sc2.nextLine();
		//sc2.close();
		String point2 = user2.userstation;
		
		
		for(int i=0; i<subway.line1.size();i++){
			if(subway.line1.get(i).name.contains("�ŵ���")) {
				System.out.println(i + "�ŵ��� �ε���");
			}
		}
		
		
		//user1�� ������ ��.
		for(int i = 0 ; i < subway.line1.size() ; i++){
			if(point1.equals(subway.line1.get(i).name)) {
				System.out.println(point1 + "�� �ڵ�:" +subway.line1.get(i).code);
				user1.userset.add(subway.line1.get(i).code);
				user1_check1 = i;
			}
		}
		
		//System.out.println("1�� ó�� ý��" + user1_check1);
		
		if(user1_check1 == -1000) {
		//����ڰ� ������ ���� 1ȣ���� ����
		}
		else if(user1_check1 < 0) {
			user1.userset.add(subway.line1.get(user1_check1+1).code);
			user1set_size++;
			//user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == 0) {
		//����ڰ� ������ ���� ������ ��	
			user1.userset.add(subway.line1.get(user1_check1+1).code);
			user1set_size++;
			//user1_check1 = user1_check1 - 1;
		}
		else if(user1_check1 == subway.line1.size() - 1) {
		//����ڰ� ������ ���� ������ ��
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1set_size++;
			//user1_check1 = user1_check1 - 1;
		}
		else {
		//����ڰ� ������ ���� 1ȣ���� �ְ� ������ �ƴ� ��
			user1.userset.add(subway.line1.get(user1_check1+1).code);
			user1.userset.add(subway.line1.get(user1_check1-1).code);
			user1set_size++;
			user1set_size++;
		//�� ���� ������ ���� �ǰ� �ڷ� ���� ��!!!!�ϴ� -1�� ������ ����
			//user1_check1 = user1_check1 - 1;
		}
	
		//System.out.println("1�� �ι�° ý��" + user1_check1);
		
		for(int i = 0 ; i < subway.line2.size() ; i++){
			if(point1.equals(subway.line2.get(i).name)) {
				System.out.println(point1 + "�� �ڵ�:" +subway.line2.get(i).code);
				user1.userset.add(subway.line2.get(i).code);
				user1_check2 = i;
			}
		}
		//System.out.println("1�� ù��° ý��" + user1_check2);
		
		
		if(user1_check2 == -1000) {
		//����ڰ� ������ ���� 2ȣ���� ���� ��
		}
		else if(user1_check2 < 0) {
			user1.userset.add(subway.line2.get(user1_check2+1).code);
			//user1_check2 = user1_check2 - 1;
		}
		else if(user1_check2 == 0) {
		//����ڰ� ������ ���� ������ ��
			user1.userset.add(subway.line2.get(user1_check2+1).code);
			//user1_check2 = user1_check2 - 1;
		}
		else if(user1_check2+1 == subway.line2.size() - 1) {
		//����ڰ� ������ ���� ������ ��
			user1.userset.add(subway.line2.get(user1_check2-1).code);
			//user1_check2 = user1_check2 - 1;
		}
		else {
		//����ڰ� ������ ���� 2ȣ���� �ְ� ������ �ƴ� ��
			user1.userset.add(subway.line2.get(user1_check2+1).code);
			user1.userset.add(subway.line2.get(user1_check2-1).code);
		//�� ���� ������ ���� �ǰ� �ڷ� ���� �ǰ� �ϴ� ������ ����.
			//user1_check2 = user1_check2 - 1;
		}
		//System.out.println("1�� �ι�° ý��" + user1_check2);
		
		System.out.println("user1 ����");
		for(int i = 0; i < user1.userset.size(); i++) {
            System.out.print(user1.userset.get(i)+"\t");
        }
		
		System.out.println();
		
		//user2�� ������ ��
		for(int i = 0 ; i < subway.line1.size() ; i++){
			if(point2.equals(subway.line1.get(i).name)) {
				System.out.println(point2 + "�� �ڵ�:" +subway.line1.get(i).code);
				user2.userset.add(subway.line1.get(i).code);
				//System.out.println("user2�� ó�� �߰��� �ڵ�"+user2.userset.get(i));
				user2_check1 = i;
			}
		}
		//System.out.println("2�� ù��° ý��" + user2_check1);
		if(user2_check1 == -1000) {
			//����ڰ� ������ ���� 1ȣ���� ���� ��
			}
		else if(user2_check1 < 0) {
			user2.userset.add(subway.line1.get(user2_check1+1).code);
			//user2_check1 = user2_check1 - 1;
		}
		else if(user2_check1 == 0) {
			//����ڰ� ������ ���� ������ ��
			user2.userset.add(subway.line1.get(user2_check1+1).code);
			//user2_check1 = user2_check1 - 1;
		}
		else if(user2_check1+1 == subway.line1.size() - 1) {
			//����ڰ� ������ ���� ������ ��
			user2.userset.add(subway.line1.get(user2_check1-1).code);
			//user2_check1 = user2_check1 - 1;
		}
		else {
			//����ڰ� ������ ���� 1ȣ���� �ְ� ������ �ƴ� ��
			user2.userset.add(subway.line1.get(user2_check1+1).code);
			user2.userset.add(subway.line1.get(user2_check1-1).code);
			//�� ���� ������ ���� �ǰ� �ڷ� ���� �ǰ� �ϴ� ������ ����.
			//user2_check1 = user2_check1 - 1;
		}
		//System.out.println("2�� �ι�° ý��" + user2_check1);
		
		for(int i = 0 ; i < subway.line2.size() ; i++){
			if(point2.equals(subway.line2.get(i).name)) {
				System.out.println(point2 + "�� �ڵ�:" +subway.line2.get(i).code);
				user2.userset.add(subway.line2.get(i).code);
				user2_check2 = i;
			}
		}
		//System.out.println("2�� ù��° ý��" + user2_check2);
		
		if(user2_check2 == -1000) {
			//����ڰ� ������ ���� 2ȣ���� ���� ��
			}
		else if(user2_check2 < 0) {
			user2.userset.add(subway.line2.get(user2_check2+1).code);
			//user2_check2 = user2_check2 - 1;
		}
		else if(user2_check2 == 0) {
			//����ڰ� ������ ���� ������ ��
			user2.userset.add(subway.line2.get(user2_check2+1).code);
			//user2_check2 = user2_check2 - 1;
		}
		else if(user2_check2+1 == subway.line2.size() - 1) {
			//����ڰ� ������ ���� ������ ��
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			//user2_check2 = user2_check2 - 1;
		}
		else {
			//����ڰ� ������ ���� 1ȣ���� �ְ� ������ �ƴ� ��
			user2.userset.add(subway.line2.get(user2_check2+1).code);
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			//�� ���� ������ ���� �ǰ� �ڷ� ���� �ǰ� �ϴ� ������ ����.
			//user2_check2 = user2_check2 - 1;
		}
		//System.out.println("2�� �ι�° ý��" + user2_check2);
		
		
		System.out.println("user2 ����");
		for(int i = 0; i < user2.userset.size(); i++) {
            System.out.print(user2.userset.get(i)+"\t");
        }
		
		//user1�� user2�� userset ��
		for(int i=0; i<user1.userset.size(); i++) {
			for(int j=0; j<user2.userset.size();j++) {
				if(user1.userset.get(i).equals(user2.userset.get(j))) {
					int common = user1.userset.get(i);
					commonset.add(common);
				}
			}
		}
        
		
		System.out.println("\n���� ����ö �� �ڵ�");
		for(int i = 0; i < commonset.size(); i++) {
            System.out.print(commonset.get(i)+"\t");
        }
		
		///�׽�Ʈ
		
		System.out.println("\n----------------2ĭ �÷��� ��-------------\n");
		System.out.println("\n����1Ȯ��");
		

		
		//�ε��� �ϳ� ������ ���� �ִ��� ������ �˻�
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
				
		
		System.out.println("\n����2Ȯ��");
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
					//System.out.println(subway.line2.get(user2_check2+3).code + "����");
					user2.userset.add(subway.line2.get(user2_check2-1).code);
					//System.out.println(subway.line2.get(user2_check2-1).code + "����");
					user2_check2 = user2_check2 - 1;
				}
//			}
//		}
		for(int i = 0; i < user2.userset.size(); i++) {
            System.out.print(user2.userset.get(i)+"\t");
        }
		
		//user1�� user2�� userset ��
		for(int i=0; i<user1.userset.size(); i++) {
			for(int j=0; j<user2.userset.size();j++) {
				if(user1.userset.get(i).equals(user2.userset.get(j))) {
					int common = user1.userset.get(i);
					commonset.add(common);
					}
				}
			}
		        
				
		System.out.println("\n���� ����ö �� �ڵ�");
		for(int i = 0; i < commonset.size(); i++) {
			System.out.print(commonset.get(i)+"\t");
		}
		
		
		System.out.println("\n------------------�׽�Ʈ�Դϴ�-------------\n");
		System.out.println("\n����1Ȯ��");
		if(user1_check1 == -1000) {
			System.out.println("�������⿴��,,,,,");
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
		
		
		
		
		System.out.println("\n����2Ȯ��");
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
		
		//System.out.println(user2_check2+"����2ý2����?");
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
			//System.out.println(subway.line2.get(user2_check2+3).code + "����");
			user2.userset.add(subway.line2.get(user2_check2-1).code);
			//System.out.println(subway.line2.get(user2_check2-1).code + "����");
			user2_check2 = user2_check2 - 1;
		}
	
		for(int i = 0; i < user2.userset.size(); i++) {
            System.out.print(user2.userset.get(i)+"\t");
        }
		
		
//		for(int i = 0 ; i < subway.line1.size() ; i++){
//			if(point.equals(subway.line1.get(i).name) || point.equals(subway.line2.get(i).name)) {
//				System.out.println(point + "�� �ڵ�:" +subway.line1.get(i).code);
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

