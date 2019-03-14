package money;

public class Moneycal {
	private static int moneyok = 0;
	public void moneycal(int a){
		if(a/50 == 1){
			a = a -50;
			if(a/20 == 1){
				int m = a%20;
				if(m == 0||m ==1||m ==2||m ==3||m ==5||m ==6||m ==7||m ==8||m ==10||m ==11
						||m ==12||m ==13){
					moneyok =1;
				}
			}else if(a == 0||a ==1||a ==2||a ==3||a ==5||a ==6||a ==7||a ==8||a ==10||a ==11
					||a ==12||a ==13){
				moneyok =1;
			}
		}else if( a < 50 && a/20 == 1){
			a =a-20;
			if(a == 0||a ==1||a ==2||a ==3||a ==5||a ==6||a ==7||a ==8||a ==10||a ==11||a ==12
					||a ==13){
				moneyok =1;
			}
		}else if(a < 20 && (a == 0||a ==1||a ==2||a ==3||a ==5||a ==6||a ==7||a ==8||a ==10||a ==11
				||a ==12||a ==13)){
			moneyok =1;
		}
	}
	public int getReuslt(){
		return moneyok;
	}
	public void clear(){
		moneyok =0;
	}
}
