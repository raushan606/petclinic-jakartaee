package org.woehlke.jakartaee.petclinic.it;

import lombok.extern.java.Log;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.woehlke.jakartaee.petclinic.it.ui.Deployments;
import org.woehlke.jakartaee.petclinic.it.ui.pages.HomePage;
import org.woehlke.jakartaee.petclinic.it.ui.pages.OwnerPage;

import java.net.URL;

import static org.jboss.arquillian.graphene.Graphene.goTo;

@Log
@RunWith(Arquillian.class)
public class Test04Owner {

    @Deployment(testable = false)
    public static WebArchive createDeployment() {
        return Deployments.createDeployment();
    }

    @Drone
    WebDriver driver;

    @ArquillianResource
    URL deploymentUrl;

    @Page
    private HomePage homePage;

    @Page
    private OwnerPage ownerPage;

    @Test
    @InSequence(1)
    @RunAsClient
    public void openHomePage() {
        goTo(HomePage.class);
        homePage.assertPageIsLoaded();
    }

    @Test
    @InSequence(2)
    @RunAsClient
    public void openOwnerPage() {
        goTo(OwnerPage.class);
        ownerPage.assertPageIsLoaded();
    }

    @Test
    @InSequence(3)
    @RunAsClient
    public void openOwnerDetailsPage() {
        goTo(OwnerPage.class);
        ownerPage.assertPageIsLoaded();
    }

}
