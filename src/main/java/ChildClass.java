
import java.util.ArrayList;
import java.util.List;

public class ChildClass {

	private final List<String> fields = new ArrayList<>();

	public List<String> getFields() {
		return this.fields;
	}

	public void addField(String field) {
		this.fields.add(field);
	}
}
