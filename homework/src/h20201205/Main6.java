package h20201205;

import java.util.Random;
/**
 * @ahthor : cxyxh
 * @date : 2020/12/12 10:43
 * @describetion : 与电脑猜拳
 */
public class Main6 {
	// 0是布 1是剪刀 2是锤子
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(3);
		int b = random.nextInt(3);
		String aString;
		String bString;
		if(a == 0) {
			aString = "布";
		}else if(a == 1) {
			aString = "剪刀";
		}else{
			aString = "锤子";
		}
		if(b == 0) {
			bString = "布";
		}else if(b == 1) {
			bString = "剪刀";
		}else{
			bString = "锤子";
		}
		if (a == 0 && b == 2 || a == 1 && b == 0 || a == 2 && b == 1) {
			System.out.println("电脑A为:" + aString);
			System.out.println("电脑B为:" + bString);
			System.out.println("电脑A胜利");
		} else if (a == 0 && b == 1 || a == 1 && b == 2 || a == 2 && b == 0) {
			System.out.println("电脑A为:" + aString);
			System.out.println("电脑B为:" + bString);
			System.out.println("电脑B胜利");
		} else {
			System.out.println("电脑A为:" + aString);
			System.out.println("电脑B为:" + bString);
			System.out.println("平局");
		}
	}
}
