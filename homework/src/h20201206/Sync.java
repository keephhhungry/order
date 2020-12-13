package h20201206;
/**
 * @ahthor : cxyxh
 * @date : 2020/12/12 10:43
 * @describetion : 具有同步功能的Java多线程程序
 */
public class Sync {

	public static void main(String[] args) {
		AtmVault atmVault = new AtmVault();
		Transaction t1 = new Transaction(1, atmVault);
		Transaction t2 = new Transaction(0, atmVault);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			System.out.println("全部执行完毕");
		} catch (Exception e) {
			System.out.println("thread interupted");
		}
	}
}

