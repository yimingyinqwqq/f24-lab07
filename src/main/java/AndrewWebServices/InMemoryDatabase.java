package AndrewWebServices;

/*
 * InMemoryDatabase is a fake for the AndrewWS database which is used to improve test efficiency.
 * Remember, fakes are fully functional classes with simplified implementation.
 * What is the simplest core functionality that we need for a functional database?
 *
 * Hint: there are two methods you need to implement
 */
public class InMemoryDatabase extends Database {
    // Implement your fake database here
    private int password = 17214;
    public int getPassword(String accountName) {
        if (accountName.equals("Scotty")) {
            return password;
        } else {
            return 0;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }
}