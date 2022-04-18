package allure.git_hub;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {

    private static final String REPOSITORY = "Denis-Pronin94/Student-Registration-Form";
    private static final int ISSUE_NUMBER = 2;

        @Test
        public void testGitHubIssue() {
            SelenideLogger.addListener("allure0", new AllureSelenide());
            WebSteps steps = new WebSteps();

            steps.openMainPage();
            steps.searchForRepository(REPOSITORY);
            steps.ClickOnRepositoryLink(REPOSITORY);
            steps.openIssuesTab();
            steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
