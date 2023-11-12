package ToDo_Model;

public class TodoModel {
	
	int no;
	String todo;
	String date;
	String time;
	
	public TodoModel() {
		super();
	}

	public TodoModel(String todo, String date, String time) {
		super();
		this.todo = todo;
		this.date = date;
		this.time = time;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "todo_bean [no=" + no + ", todo=" + todo + ", date=" + date + ", time=" + time + "]";
	}
	
	
}
