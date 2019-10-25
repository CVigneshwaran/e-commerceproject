package Sampleproject.system;

public interface UserDAO {
	boolean addUser(User po);
	boolean deleteUser(User po);
	User findUser(int id);
	User updateUser(User po);
	java.util.List<User> getAllUsers();

}
