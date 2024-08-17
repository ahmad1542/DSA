import java.util.Stack;

public class clsMyString {
	private Stack<String> undo = new Stack<>();
	private Stack<String> redo = new Stack<>();
	private String value = "";
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		undo.push(this.value);
		this.value = value;
	}
	
	public void undo() {
		if (!undo.isEmpty()) {
			redo.push(value);
			value = undo.pop();
		}
	}
	
	public void redo() {
		if (!redo.isEmpty()) {
			undo.push(value);
			value = redo.pop();
		}
	}
	
}
