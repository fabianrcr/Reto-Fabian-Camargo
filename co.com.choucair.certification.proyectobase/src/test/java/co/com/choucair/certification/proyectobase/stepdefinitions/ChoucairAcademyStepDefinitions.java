package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the acedemy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcedemyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
       OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.
               onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course Foundation Express on the choucair academy platform$")
    public void heSearchForTheCurseFoundationExpressTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledFoundationExpress(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}