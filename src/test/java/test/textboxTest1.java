package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class textboxTest1 {
    @Test
    void seccsefulFillTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Vasya");
        $("#lastName").setValue("Vasya");
        $("#userEmail").setValue("1@1.com");
        $("#gender-radio-3").doubleClick();
        $("#gender-radio-2").doubleClick();
        $("#gender-radio-1").doubleClick();
        $("#userNumber").setValue("911");
        $("#dateOfBirth").doubleClick();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#currentAddress").setValue("Vasya");
        $("#subjectsInput").setValue("subject1");
        sleep(10000);

        System.out.println("debug");
    }
}




