package test;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TexBoxTest1 {
    @Test
    void successfulFillTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Vasya");
        $("#lastName").setValue("Vasya");
        $("#userEmail").setValue("1@1.com");
        $("#userNumber").setValue("9119119110");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1900");
        $$(".react-datepicker__day").filter(not(cssClass("react-datepicker__day--outside-month"))).find(text("29")).click();
        $(byText("Male")).click();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#currentAddress").setValue("Vasya");
        $("#subjectsInput").setValue("a");
        $(byText("Arts")).click();
        $("#uploadPicture").uploadFromClasspath("docs/test.txt");
        $("#react-select-3-input").setValue("n");
        $(byText("NCR")).click();
        $("#react-select-4-input").setValue("d");
        $(byText("Delhi")).click();


        System.out.println("debug");

    }
}




