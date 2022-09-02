public class ValidaLogin {
    public static void main(String[] args) {

        String login = "aaZsdw33@dasdwerwerwe!()&r1111a";
        String pattern = "([0-9]|[a-z]|[A-Z]|[@#$%^&+=]).{5,30}";
        System.out.println(login.matches(pattern));

        String password = "aaZZa44@SDS";
        String pattern2 = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}";
        System.out.println(password.matches(pattern2));
    }
}
