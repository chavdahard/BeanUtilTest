
import java.util.ArrayList;
import java.util.List;

public class MyTest {
	private final List<String> editableFields = new ArrayList<>();

	public List<String> getEditableFields() {
		return this.editableFields;
	}

	public void addEditableField(String editableField) {
		this.editableFields.add(editableField);
	}
}
