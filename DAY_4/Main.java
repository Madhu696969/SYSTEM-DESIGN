package DAY_4;

public class Main {
	public static void main(String[] args) {
		User user=new User.Builder().setName("Madhu").setAge(19).setEmail("madhukaleru36@gmail.com").setPhone("999-999-999").build();
		user.display();
	}
}
