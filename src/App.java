import java.util.ArrayList;

public class App {
    //attributes
    private List<User> userList;
    private List<Vehicle> vehicleList;
    private List<Post> postList;
    private User loggedUser;

    //constructors
    public App(){
        userList = new ArrayList<User>();
        vehicleList = new ArrayList<Vehicle>();
        postList = new ArrayList<Post>();
    }

    //getters & setters
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    //methods

    //public void login(){}
    //public void logout(){}
    //public void signup(){}
    //public Vehicle searchVehicle(){}
    //public User searchUser(){}
}
