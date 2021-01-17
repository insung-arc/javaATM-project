import java.util.Scanner;

abstract class atm_money {
	abstract void checkMoney();
	void checkMoney(int money) {
		System.out.println("현재 계좌 금액 : " + money + "원");
	}
}

class printMoney extends atm_money {
	void showmoney() {
		System.out.println("money");
	}
	@Override
	void checkMoney() {
		// TODO Auto-generated method stub
		
	}
}


public class ATMProject {
    public static void main(String[] args) { 
        int balance = 5000;
        int withdraw = 0;
        int deposit = 0;
        
        Scanner s = new Scanner(System.in);
        
        
        while(true) {
        	System.out.println("=============");
        	System.out.println(balance);
        	System.out.println("=====ATM=====");
            System.out.println("1. 출금");
            System.out.println("2. 입금");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");
            System.out.print(">>> ");
            
            int n = s.nextInt();
            switch (n){
                case 1:
                	System.out.print("출금 금액 입력 :");
                	withdraw = s.nextInt();
                	if(balance >= withdraw) {
                		balance = balance - withdraw;
                		System.out.println("돈을 갖고 가주세요.\n");	
                	}	
                
                	else {
                		System.out.println("출금 잔액 부족\n");
                	}
                
                	System.out.println("");
                	
                	break;
 
                case 2:
                	System.out.print("입금 금액 입력 : ");
                	deposit = s.nextInt();
                	balance = balance + deposit;
                	System.out.println("정상적으로 금액이 입금 되었습니다.\n");
                	break;
 
                case 3:
                	System.out.println("금액 : "+balance+"\n");
                	break;
 
                case 4:
                	System.exit(0);
            }
        }
    }
}