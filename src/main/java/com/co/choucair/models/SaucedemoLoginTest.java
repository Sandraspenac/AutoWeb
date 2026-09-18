import io.cucumber.datatable.DataTable;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;


import java.util.Map;

public class SaucedemoLoginTest implements Task {

    private String user;

    private String pass;

    public SaucedemoLoginTest(String user, String pass) {

        this.user = user;

        this.pass = pass;

    }

    public static SaucedemoLoginTest saucedemoLoginTest(DataTable dataTable) {

        Map<String, String> row =

                dataTable.asMaps(String.class, String.class).get(0);


        return new SaucedemoLoginTest(

                row.get("username"),

                row.get("password")

        );

    }

    @Override

    public <T extends Actor> void performAs(T actor) {

// Aquí va la lógica del login

    }

    public String getUser() {

        return user;

    }

    public String getPass() {

        return pass;

    }

    public void setUser(String user) {

        this.user = user;

    }

    public void setPass(String pass) {

        this.pass = pass;

    }

}