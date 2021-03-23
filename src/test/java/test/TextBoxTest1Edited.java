package test;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TextBoxTest1Edited {

    String  firstName = "Vasya",
            lastName = "Vasya",
            gender = "Male",
            email = "1@1.com",
            phone = "9119119119",
            birthDay = "5",
            birthMonth = "December",
            birthYear = "1900",
            birthСheck ="5 December,1900",
            subjects = "Arts",
            address = "Vasya",
            state = "NCR",
            city = "Delhi";


    @Test
    void successfulFillTest() {
        open("https://demoqa.com/automation-practice-form");





        //---- TextBoxTest1 without strings
        /*
        $("#firstName").setValue("Vasya");
        $("#lastName").setValue("Vasya");
        $("#userEmail").setValue("1@1.com");
        $("#userNumber").setValue("9119119119");

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
        $("#submit").click();

         */
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(birthMonth);
        $(".react-datepicker__year-select").selectOption(birthYear);
        $(String.format("[aria-label='Choose Wednesday, %s %sth, %s']", birthMonth, birthDay, birthYear)).click();
        //----DateOfBirth other
        /*
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1900");
        //---- double day number
        $$(".react-datepicker__day").filter(not(cssClass("react-datepicker__day--outside-month"))).find(text("29")).click();
        */

        $(byText(gender)).click();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#currentAddress").setValue(address);
        $("#subjectsInput").setValue("a");
        $(byText(subjects)).click();
        $("#uploadPicture").uploadFromClasspath("docs/test.txt");
        $("#react-select-3-input").setValue("n");
        $(byText(state)).click();
        $("#react-select-4-input").setValue("d");
        $(byText(city)).click();
        $("#submit").click();
        $(".table-responsive").shouldHave(text("Vasya Vasya"),
                text(email),
                text(gender),
                text(phone),
                text(birthСheck),
                text(subjects),
                text("Sports, Reading, Music"),
                text("test.txt"),
                text(address),
                text(state+" "+city));

    }
}