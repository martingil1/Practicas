package Class;

public class User {

    private String name;
    private String lastname;

    public User(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return
                "" + name + " " + lastname;
    }
}
