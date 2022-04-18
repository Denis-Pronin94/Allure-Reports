import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

        @Test
        public void testGitHubIssue() {

            open("https://github.com");

            $(".header-search-input").click();
            $(".header-search-input").sendKeys("Denis-Pronin94/Student-Registration-Form");
            $(".header-search-input").submit();

            $(linkText("Denis-Pronin94/Student-Registration-Form")).click();
            $(partialLinkText("Issues")).click();

            $(withText("#2")).click();
    }
}
