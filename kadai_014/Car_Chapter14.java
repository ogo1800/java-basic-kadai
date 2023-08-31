package kadai_014;

public class Car_Chapter14 {
	public int gear = 1; // 1速から5速のギアを表す
	public int speed = 10; // ギアチェンジ後の速度を表す
	
	// 【メソッド】　
	// ギアの値により速度を変える
	public void gearChange( int afterGear ) {
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました" );
		this.gear = afterGear;		
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		this.speed = this.gear * 10;
		
		if ( this.gear < 1 || 5 < this.gear ) {
			System.out.println("速度は時速" + 10 + "kmです");
			
		} else {
			System.out.println( "速度は時速" + this.speed + "kmです" );
		}
	}

}
