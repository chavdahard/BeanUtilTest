
public class ParentClass {

	private ChildClass childClass = new ChildClass();

	public ChildClass getChildClass() {
		return childClass;
	}

	public void setChildClass(ChildClass childClass) {
		this.childClass = childClass;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ParentClass))
			return false;

		ParentClass parentClass = (ParentClass) o;
		return !(getChildClass() != null ? !getChildClass().equals(parentClass.getChildClass()) : parentClass.getChildClass() != null);
	}

	@Override
	public int hashCode() {
		return getChildClass() != null ? getChildClass().hashCode() : 0;
	}
}
