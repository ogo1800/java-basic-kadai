package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// 年代、料金の変数を宣言、初期化
		int userAge = 30;
		int serviceCost;
		
		// switch文で条件分岐を記述する
		switch (userAge) {
		case 10 -> serviceCost = 1000;
		case 20 -> serviceCost = 2000;
		case 30, 40 -> serviceCost = 3000;
		case 50, 60, 70 -> serviceCost = 4000;
		case 80 -> serviceCost = 5000;
		default -> serviceCost = 500;
		}
		// 年代とそれに応じた料金を出力する
				System.out.println(userAge + "代の料金は" + serviceCost + "円");	
	}
	
}
