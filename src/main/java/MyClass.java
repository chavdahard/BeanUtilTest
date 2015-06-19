
public class MyClass {
	private MyTest myTest = new MyTest();

	public MyTest getMyTest() {
		return myTest;
	}

	public void setMyTest(MyTest myTest) {
		this.myTest = myTest;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof MyClass))
			return false;

		MyClass myClass = (MyClass) o;
		return !(getMyTest() != null ? !getMyTest().equals(myClass.getMyTest()) : myClass.getMyTest() != null);
	}

	@Override
	public int hashCode() {
		return getMyTest() != null ? getMyTest().hashCode() : 0;
	}
}
