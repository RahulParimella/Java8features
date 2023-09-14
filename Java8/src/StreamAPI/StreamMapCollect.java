package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollect {
public static void main(String[] args) {
	
	List<User> users =new ArrayList<User>();
	users.add(new User(1,"ramesh","secrete","ramesh@gmail.com"));
	users.add(new User(2,"rajesh","secrete","rajesh@gmail.com"));
	users.add(new User(3,"rahul","secrete","rahul@gmail.com"));
	users.add(new User(4,"raghu","secrete","raghu@gmail.com"));
	users.add(new User(5,"gabbar","secrete","gabbar@gmail.com"));
	
	
	//user.stream().map() with out lambada expressions
	users.stream().map(new Function<User, UserDTO>() {

		@Override
		public UserDTO apply(User user) {
			// TODO Auto-generated method stub
			return new UserDTO(user.getId(),user.getUserName(),user.getEmail());

		}
	
	}).collect(Collectors.toList()).forEach(System.out::println);
	
	System.out.println("------------------------------------------------------");
	
	//user.stream().map() with  lambada expressions
	users.stream().map((User user) -> new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
	.collect(Collectors.toList()).forEach(System.out::println);

}
}

class UserDTO{
	private int id;
	private String userName;
	private String password;
	private String email;
@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName +  ", email=" + email + "]";
	}

	public UserDTO(int id, String userName,  String email) {
		super();
		this.id = id;
		this.userName = userName;
        this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
