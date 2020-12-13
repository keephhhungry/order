package h20201206;

import java.text.DecimalFormat;

public class AtmVault {

	private Double value = 1000.00;
	private DecimalFormat df = new DecimalFormat("#.##"); 
	public void receiveCash(Double monney) {
		System.out.println("准备收钱:收钱前余额:" + value);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("thread interupted");
		}
//		value = (double)value + monney;
		value  = Double.parseDouble(df.format(value + monney));
		System.out.println("收钱完毕:收钱后余额:" + value);
		System.out.println("=======================");
	}

	public void DispensesCash(Double monney) {
		System.err.println("准备付钱:收钱前余额:" + value);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.err.println("thread interupted");
		}
		value  = Double.parseDouble(df.format(value - monney));
		System.err.println("付钱完毕:付钱后余额:" + value);
		System.err.println("=======================");
	}
}
