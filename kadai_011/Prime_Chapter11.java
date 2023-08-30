package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.println(number + " ");
            }
	}

}
	
	// 素数かどうかを判定する関数
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
