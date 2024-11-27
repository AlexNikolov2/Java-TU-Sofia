public class App {
    public static void main(String[] args) throws Exception {
        var userTable = new HashTable(1);
userTable.add("user1", "user1@example.com");
var email = userTable.get("user1");
    }
}
