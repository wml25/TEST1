package test;

public class TestAction extends BaseAction {
	public String execute() {
		System.out.println("连接成功");
		return "success";
	}
}
