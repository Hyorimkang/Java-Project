import java.util.Scanner;
public class Gaddo{
   public static void main(String args[]){
	System.out.println(" ┏  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  ┓");
	System.out.println(" ㅣ       ㅡㅡㅡ    ㅣ         ㅡㅡㅡㅡㅡ           ㅣ");
	System.out.println(" ㅣ            ㅣ   ㅣ        ㅣ   ㅣ               ㅣ");
	System.out.println(" ㅣ            ㅣ   ㅣ ㅡㅡ    ㅡㅡㅡㅡㅡ           ㅣ");	
	System.out.println(" ㅣ            ㅣ   ㅣ             ㅣ               ㅣ");	
	System.out.println(" ㅣ                           ㅡㅡㅡㅡㅡㅡ          ㅣ");	
	System.out.println(" ┗  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  ┛");
	Scanner scan = new Scanner(System.in);
	System.out.println();
	System.out.println("  사용하실 모드를 선택해 주세요 ");
	System.out.println();
	System.out.print("  [ 사용자 모드 ]와 [ 관리자 모드 ] 중 어떤 모드를 사용하시겠습니까? (띄어쓰기 없이 작성): ");
	String modechoise = scan.next();
	
	switch(modechoise){
		case "관리자모드" : getPassword(modechoise); break; //관리자 비밀번호 입력창 메서드
		case "사용자모드" : getDate(modechoise); break;  //날짜 입력창 메서드
				
		default : System.out.print("  제공하지 않는 서비스 입니다. 다시 입력해 주세요");
	}
	
   }//main화면
   public static int getDate(String modechoise){
	System.out.println("  ┏  -  -  -  -  ┓");
	System.out.println("  l  ex) 220702   l");
	System.out.println("  ┗  -  -  -  -  ┛");
	System.out.print("  위의 형식으로 날짜를 입력해 주세요 :");
	Scanner scan = new Scanner(System.in);
	int date = scan.nextInt();
	
	if(date>= 220702 && date <= 221023){
		System.out.print("  서비스 제공 목록메서드");
	}
	else{
		System.out.println("  날짜를 다시 확인하여 입력해주세요");
		getDate(modechoise);
	}

	return date;
   }//getDate
   public static String getPassword(String modechoise){
	System.out.println("  ┏  -  -  -  -  -  -  -  -  -  -  ┓");
	System.out.println("      관리자 비밀번호를 입력하세요   ");
	System.out.println("  ┗  -  -  -  -  -  -  -  -  -  -  ┛");
	Scanner scan = new Scanner(System.in);
	System.out.print("  비밀번호 : ");
	String password = "entermanager";
	String enterpassword = scan.next();
	if(password.equals(enterpassword)){
	//문자열 같음을 비교할 때는 변수.equals(변수) 로 표현한다. 
		System.out.println("  관리자 모드로 로그인 되었습니다.");
		//관리자 모드 메서드 추가
	}
	else{
		for(int i = 1; i<4; i++){
			System.out.println("  비밀번호가 틀렸습니다. 다시 입력해 주세요. (기회" + i + "번 남음)");
			getPassword(modechoise);
		}
		
	}//3번이상 틀리면 강종되게 만들기 
	
	return password;
   }//getPassword
}