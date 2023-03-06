package chap04;

import java.util.Scanner;


/*
 	1. 아래의 코드 실행 결과가 다음 실행 예와 같도록 변경하세요.
 	
 	<실행 예>
 	
 	[ 가위바위보 게임 ]

  	 1. 가위 
	 2. 바위 
	 3. 보 
	 >>> 

	 사용자 바위, 컴퓨터 가위입니다.
	 사용자가 이겼습니다.
	 
	 2. 이길 때 까지 가위 바위 보 게임을 구현하는 코드를 작성하세요.
	 
 */

public class KawiBawilBo {

	public static void main(String[] args) {
		int user, com; 
		String [] kbb = {"가위","바위","보"};
		String result = "";
		boolean isWin = false;
		Scanner scanner = new Scanner(System.in);

					
				String intro = "\n\t[ 가위바위보 게임]\n\n + "+
						"\t 1. 가위 \n" +
						"\t 2. 바위 \n" +	
						"\t 3. 보 \n" +
						"\t >>>";
				
				
				do {
					com = (int)(Math.random() * 3);
					System.out.print(intro);
					user = scanner.nextInt() -1;
					
				
					System.out.printf("\n\t 사용자 %s , 컴퓨터 %s %n" , kbb[user] , kbb[com]); 
					switch(user-com) {
						
						case 2: case -1: result ="졌습니다."; break;
						case 1: case -2: result ="이겼습니다."; isWin = true; break;
						case 0: result ="비겼습니다."; break;
					}
					System.out.printf("\t 가위바위보 결과 ==> %s %n" , result);
				}while(!isWin);
				
					
				
				
				scanner.close();
				System.out.println("\n\t 이용해주셔서 감사합니다. 다음에 다시 만나요....");
	}		
}

//switch(user) {
//case 1:
//	System.out.println("가위");
//	break;
//case 2:	
//	System.out.println("바위");
//	break;
//case 3:
//	System.out.println("보");
//	break;
//}
//String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//user = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)를 숫자로 변환
//
//com = (int)(Math.random() * 3) + 1;  // 1,2,3중 하나가 com에 저장됨
//
