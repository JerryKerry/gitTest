package github;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SelenideRepositorySearchTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void SearchCodeTest () {
        //   Открыть страницу Selenide в Github
        open("selenide/selenide");
        // Клик на wiki
        $("[data-content=Wiki]").click();
        // Фильтруем по SoftAssertions
        $("[data-filterable-for=wiki-pages-filter]").$(".wiki-more-pages-link").$("button").click();
        $("[data-filterable-for=wiki-pages-filter]")
                .$(byText("SoftAssertions")).click();
        // Ищем JUnit5
        $("#user-content-3-using-junit5-extend-test-class").scrollTo().preceding(0)
                .shouldHave(text("3. Using JUnit5 extend test class:"));

        // Проверка сниппета кода
        $("#wiki-wrapper").shouldHave(text("""
                @ExtendWith({SoftAssertsExtension.class})
                class Tests {
                  @Test
                  void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");
                
                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
                  }
                }
                """));
        // Проверка сниппета кода
        $("#wiki-wrapper").shouldHave(text("""
              class Tests {
                @RegisterExtension 
                static SoftAssertsExtension softAsserts = new SoftAssertsExtension();
                
                @Test
                void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");

                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
  }
}
 """));
    }
}
