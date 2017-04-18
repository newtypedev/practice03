package prob06;

public class Sub extends Operation {

	@Override
	public int calculate() {
		int result = this.a - this.b;
		return result;
	}

}
