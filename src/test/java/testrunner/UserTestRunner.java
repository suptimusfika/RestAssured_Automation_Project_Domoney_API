package testrunner;

import com.github.javafaker.Faker;
import controller.User;
import io.restassured.path.json.JsonPath;
import model.UserModel;
import org.apache.commons.configuration.ConfigurationException;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.Setup;
import utils.Utils;

import java.io.IOException;

public class UserTestRunner extends Setup {
    public UserTestRunner() throws IOException {
        initConfig();
    }
    @Test(priority = 1, description = "Do Admin login")
    public void doLogin() throws ConfigurationException, IOException {
        User user = new User();
        JsonPath res = user.doLogin("admin1@roadtocareer.net", "1234");
        String message = res.get("message");
        Assert.assertTrue(message.contains("Login successfully"));
    }

    @Test(priority = 2, description = "Create Customer-1")
    public void createNewCustomer() throws IOException, ConfigurationException, ParseException {
        User user = new User();
        int randomId = Utils.generateRandomId(1000, 9999);
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = "customer" + randomId + "@dmoneytest.com";
        String password = faker.internet().password();
        String phone_number = "0199" + randomId + "345";
        String nid = "11"+randomId+"45";
        String role = "Customer";
        JsonPath res = user.createUser(name, email, password, phone_number, nid, role);

        UserModel model = new UserModel();
        model.setName(name);
        model.setEmail(email);
        model.setPassword(password);
        model.setPhone_number(phone_number);
        model.setNid(nid);
        model.setRole(role);
        Utils.saveInfo(model);

        String message = res.get("message");
        Assert.assertTrue(message.contains("User created"));
    }

    @Test(priority = 3, description = "Create Customer-2")
    public void createAnotherCustomer() throws IOException, ConfigurationException, ParseException {
        User user = new User();
        int randomId = Utils.generateRandomId(1000, 9999);
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = "customer" + randomId + "@dmoneytest.com";
        String password = faker.internet().password();
        String phone_number = "0188" + randomId + "345";
        String nid = "11"+randomId+"45";
        String role = "Customer";
        JsonPath res = user.createUser(name, email, password, phone_number, nid, role);

        UserModel model = new UserModel();
        model.setName(name);
        model.setEmail(email);
        model.setPassword(password);
        model.setPhone_number(phone_number);
        model.setNid(nid);
        model.setRole(role);
        Utils.saveInfo(model);

        String message = res.get("message");
        Assert.assertTrue(message.contains("User created"));
    }
    @Test(priority = 4, description = "Create an Agent")
    public void createNewAgent() throws IOException, ConfigurationException, ParseException {
        User user = new User();
        int randomId = Utils.generateRandomId(1000, 9999);
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = "agent" + randomId + "@dmoneytest.com";
        String password = faker.internet().password();
        String phone_number = "0177" + randomId + "345";
        String nid = "11"+randomId+"45";
        String role = "Agent";
        JsonPath res = user.createUser(name, email, password, phone_number, nid, role);

        UserModel model = new UserModel();
        model.setName(name);
        model.setEmail(email);
        model.setPassword(password);
        model.setPhone_number(phone_number);
        model.setNid(nid);
        model.setRole(role);
        Utils.saveInfo(model);

        String message = res.get("message");
        Assert.assertTrue(message.contains("User created"));
    }
}
