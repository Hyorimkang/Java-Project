import java.util.Scanner;
public class Gaddo{
   public static void main(String args[]){
	System.out.println(" ��  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  ��");
	System.out.println(" ��       �ѤѤ�    ��         �ѤѤѤѤ�           ��");
	System.out.println(" ��            ��   ��        ��   ��               ��");
	System.out.println(" ��            ��   �� �Ѥ�    �ѤѤѤѤ�           ��");	
	System.out.println(" ��            ��   ��             ��               ��");	
	System.out.println(" ��                           �ѤѤѤѤѤ�          ��");	
	System.out.println(" ��  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  ��");
	Scanner scan = new Scanner(System.in);
	System.out.println();
	System.out.println("  ����Ͻ� ��带 ������ �ּ��� ");
	System.out.println();
	System.out.print("  [ ����� ��� ]�� [ ������ ��� ] �� � ��带 ����Ͻðڽ��ϱ�? (���� ���� �ۼ�): ");
	String modechoise = scan.next();
	
	switch(modechoise){
		case "�����ڸ��" : getPassword(modechoise); break; //������ ��й�ȣ �Է�â �޼���
		case "����ڸ��" : getDate(modechoise); break;  //��¥ �Է�â �޼���
				
		default : System.out.print("  �������� �ʴ� ���� �Դϴ�. �ٽ� �Է��� �ּ���");
	}
	
   }//mainȭ��
   public static int getDate(String modechoise){
	System.out.println("  ��  -  -  -  -  ��");
	System.out.println("  l  ex) 220702   l");
	System.out.println("  ��  -  -  -  -  ��");
	System.out.print("  ���� �������� ��¥�� �Է��� �ּ��� :");
	Scanner scan = new Scanner(System.in);
	int date = scan.nextInt();
	
	if(date>= 220702 && date <= 221023){
		System.out.print("  ���� ���� ��ϸ޼���");
	}
	else{
		System.out.println("  ��¥�� �ٽ� Ȯ���Ͽ� �Է����ּ���");
		getDate(modechoise);
	}

	return date;
   }//getDate
   public static String getPassword(String modechoise){
	System.out.println("  ��  -  -  -  -  -  -  -  -  -  -  ��");
	System.out.println("      ������ ��й�ȣ�� �Է��ϼ���   ");
	System.out.println("  ��  -  -  -  -  -  -  -  -  -  -  ��");
	Scanner scan = new Scanner(System.in);
	System.out.print("  ��й�ȣ : ");
	String password = "entermanager";
	String enterpassword = scan.next();
	if(password.equals(enterpassword)){
	//���ڿ� ������ ���� ���� ����.equals(����) �� ǥ���Ѵ�. 
		System.out.println("  ������ ���� �α��� �Ǿ����ϴ�.");
		//������ ��� �޼��� �߰�
	}
	else{
		for(int i = 1; i<4; i++){
			System.out.println("  ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���. (��ȸ" + i + "�� ����)");
			getPassword(modechoise);
		}
		
	}//3���̻� Ʋ���� �����ǰ� ����� 
	
	return password;
   }//getPassword
}