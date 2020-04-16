import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create user: ");
        Long id = scanner.nextLong();
        String name = scanner.next();
        String lastName = scanner.next();
        String login = scanner.next();
        String email = scanner.next();
        Integer age = scanner.nextInt();
        Gender gender = Gender.valueOf(scanner.next());

        User user = new User.Builder().setId(id)
                .setName(name)
                .setLastName(lastName)
                .setLogin(login)
                .setEmail(email)
                .setAge(age)
                .setGender(gender)
                .build();

        System.out.println(user.toString());
    }
}
