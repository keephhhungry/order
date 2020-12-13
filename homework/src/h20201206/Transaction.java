package h20201206;

import java.util.Random;

public class Transaction extends Thread {

	private double money;
	private int type;
	AtmVault atmVault;

	public Transaction(int type, AtmVault atmVault) {
		super();
		this.type = type;
		this.atmVault = atmVault;
	}

	public void run() {
		Random random = new Random();
		int i = 0;
		while (i <= 20) {
			synchronized (atmVault) {
				Double nextInt = (double) random.nextInt(500);
				money = nextInt / 100;
				if (type == 1) {
					atmVault.receiveCash(money);
				} else if (type == 0) {
					atmVault.DispensesCash(money);
				}
			}
			i++;
		}
	}

}
