public class Test {
	public void test001() {
		Example e = new Example();
		int c = e.sum(3, 5);
		assert c == 8;
	}
	public void test002() {
		Example e = new Example();
		int c = e.sum(2_000_000_000,
					  2_000_000_000);
		assert c == 4_000_000_000L;
	}
}