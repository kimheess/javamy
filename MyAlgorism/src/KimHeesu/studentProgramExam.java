package KimHeesu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


//강사님 열심히 해보려 했는데 정말 막상 하려니 처음부터 막히네요 .. 
//더욱 노력 해보겠습니다 아무것도 안한것 같아 너무 부끄럽네요
public class studentProgramExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentInformation b1 = new StudentInformation();
		int[] shot = new int[5];
		String[] shot1 = new String[2];
		
		while(true) {
			System.out.println();
			System.out.println("### 학생 성적 관리 프로그램 ###");
			System.out.printf("1. 학생 정보 입력\n2. 학생 정보 조회\n3. 성적 변경\n4. 학생 정보 삭제\n5. 프로그램 종료\n>>>>");
			
			int menu = sc.nextInt();
			if (menu == 5) {
				System.out.println("학생 성적 관리 프로그램을 종료합니다.");
				break;
			}
			else if(menu >= 6) {
				System.out.println("잘못된 번호를 입력 하셨습니다. 다시 입력해주세요.");
			}
			
			 switch (menu) {
             case 1:                               
                System.out.print("1.학번을 입력하세요.\n 예 : 20230203\n>>>>");
                shot[0] = (sc.nextInt());
                System.out.println("2. 성함을 입력하세요.\n 예 : 김희수");
                shot1[0] = (sc.next());
                System.out.println("3. 성별을 입력하세요.\n 예 : 남자 or 여자");
                shot1[1] = (sc.next());
                System.out.println("4. 국어 점수를 입력하세요.");
                shot[1] = (sc.nextInt());
                System.out.println("5. 영어 점수를 입력하세요.");
                shot[2] = (sc.nextInt());
                System.out.println("6. 수학 점수를 입력하세요.");
                shot[3] = (sc.nextInt());
                System.out.println("7. 과학 점수를 입력하세요.");
                shot[4] = (sc.nextInt());
                System.out.println("입력이 완료 됐습니다! \n입력하신 정보는 [학번] : " + shot[0] + " [성함] : " + shot1[0] + " [성별] : " + shot1[1] + "\n [국어] : " + shot[1] +" [영어] : " + shot[2] + " [수학] : " + shot[3] + " [과학] : " + shot[4] + " 입니다." );
                break;
             case 2:
            	 	System.out.println("학생 정보 조회를 시작 합니다.\n 1. 전체 학생 정보 조회 \n 2. 개별 학생 정보 조회\n >>>>");
            	 	int menu1 = sc.nextInt();
            	 	switch (menu1) {
            	 	case 1: 
            	 		
            	 		System.out.println("전체 학생 정보를 조회 합니다.\n" + "학번 : " +shot[0] + " 이름 : " + shot1[0] + " 성별 : " + shot1[1]);
            	 		break;
            	 		
            	 	case 2:
            	 		System.out.println("개별 학생 정보를 조회 합니다 \n 학번을 입력해주세요 >>>");
            	 		int h =0;
            	 		int menu2 = sc.nextInt();
            	 		h = menu2;
            	 	if(h==shot[0]) {
            	 		System.out.println("조회하신 학생의 정보는\n  학번 : " +shot[0] + " 이름 : " + shot1[0] + " 성별 : " + shot1[1] + "\n [국어] : " + shot[1] +" [영어] : " + shot[2] + " [수학] : " + shot[3] + " [과학] : " + shot[4] + " 입니다.");
            	 	}
            	 	else {
            	 		System.out.println("존재 하지 않는 학번 입니다.");
            	 	}
            	 	
            	 	}
            	 	break;
            	 	case 3:
            	 		System.out.println("성적 변경을 위해 변경하실 학생의 학번을 입력해주세요\n>>>>");
            	 		int j = 0;
            	 		int menu3 = sc.nextInt();
            	 		j = menu3;
            	 		if(j == shot[0]) {
            	 				System.out.println("변경하실 학생은 이름 : " + shot1[0] + "입니다.\n 성적 변경을 진행 해 주세요.");
            	 				System.out.println("[기존 점수] 국어 : " + shot[1] + "변경하실 점수를 입력 해 주세요 \n 국어 >>>>");
            	 				shot[1] = (sc.nextInt());
                            System.out.println("[기존 점수] 영어 : " + shot[2] + "변경하실 점수를 입력 해 주세요 \n 영어 >>>>");
                            shot[2] = (sc.nextInt());
                            System.out.println("[기존 점수] 수학 : " + shot[3] + "변경하실 점수를 입력 해 주세요 \n 수학 >>>>");
                            shot[3] = (sc.nextInt());
                            System.out.println("[기존 점수] 과학 : " + shot[4] + "변경하실 점수를 입력 해 주세요 \n 과학 >>>>");
                            shot[4] = (sc.nextInt());
                            System.out.println("변경 하신 점수는 \n 국어 :" + shot[1] + " 영어 : " + shot[2] + " 수학 : " + shot[3] + " 과학 : " + shot[4] + " 입니다" );
            	 		}
            	 		else {
            	 			System.out.println("입력하신 학번은 존재 하지 않는 학번 입니다");
            	 		}
            	 		break;
            	 	 case 4:
            	 		System.out.println("삭제하실 학생의 학번을 입력 해 주세요");
            	 		int menu4 = sc.nextInt();
            	 		if(menu4 == shot[0]) {
            	 			System.out.println("입력하신 학생은 이름 : " + shot1[0] + "입니다 \n 해당 학생의 정보를 삭제 합니다." );
            	 			for(int i=0; i<shot.length;i++) {
            	 				shot[i] = 0;
            	 			}
            	 			for (int i =0; i<shot1.length;i++) {
            	 				shot1[i] = "";
            	 			}
            	 		}
            	 		else {
            	 			System.out.println("입력하신 학번은 존재 하지 않는 학번 입니다.");
            	 		}
            	 		break;
            	 	}
			 }
		}
	
}
