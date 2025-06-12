package utility;

import com.github.javafaker.Faker;

public class sharedData {
 public static String email;
 public static String password;
 public static String firstName;
 public static String lastName;

public static void generateCredentials() {
Faker faker = new Faker();
 email = faker.internet().emailAddress();
password = faker.internet().password(8, 12);
firstName =faker.internet().domainName();
lastName =faker.internet().domainName();
 }
}

