package br.com.max.projectsw.character.configRestAssured;

import io.restassured.RestAssured;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class RestAssuredTestExecution implements TestExecutionListener {

    @Override
    public void beforeTestMethod(final TestContext testContext) {

        RestAssured.baseURI = "http://localhost:8080";
    }
}
