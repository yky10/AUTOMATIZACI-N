package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import pages.AdvantagePage;

public class advantageStepDefinition {
    AdvantagePage aventajaPage = new AdvantagePage();

    @Given("se abre el advantage")
    public void navigateToAventaja() {
        aventajaPage.navigateToAventaja();
    }

    @When("Se presiona el icono User")
    public void clickUser() {
        aventajaPage.clickLinkById("menuUserLink");
    }

    @When("Se ingresan las credenciales")
    public void fillLogin() throws InterruptedException {
        aventajaPage.FillLoginForm("Yafeth", "Deleon20");
    }

    @Then("Se presiona el button login")
    public void clickLoginButton() {
        aventajaPage.ClickSignInButton("sign_in_btn");
    }

    @When("Se debe seleccionar categoria")
    public void selectCategory() throws InterruptedException {
        aventajaPage.selectCategoryAfterDelay("SPEAKERS", 10); // Espera 10 segundos antes de seleccionar la categoría
    }

    @And("Se debe seleccionar un producto y agregarlo")
    public void selectProduct() throws InterruptedException {
        aventajaPage.selectProductAfterDelay("HP Roar Mini Wireless Speaker", 15);
    }

    @And("Se presiona boton para agregar")
    public void clickAddToCartButton() {
        aventajaPage.clickAddToCartButton();
    }

    @And("Se presiona button de carrito")
    public void clickCartAndCheckout() {
        aventajaPage.clickCartImage();
        aventajaPage.clickCheckout();
        aventajaPage.clickAdvantageNextButton();
    }

    @And("Se confirma el pago")
    public void confirmPayment() throws InterruptedException {
        aventajaPage.clickPayButton();
    }

    @When("Se retorna a la pagina de inicio")
    public void returnToHomePage() {
        aventajaPage.clickHomeLink();
    }

    @And("Se llena formulario Contacto")
    public void fillContactForm() throws InterruptedException {
        aventajaPage.selectCategoria();
        aventajaPage.selectProduct();
        aventajaPage.selectEmail("yafethdeleon@gmail.com");
        aventajaPage.enterTextarea("es recomendable el producto");
    }

    @And("Se selecciona boton enviar")
    public void clickSendButton() {
        aventajaPage.clickSend();
    }

    @When("Seleccionar icono cerrar Sesion")
    public void clickSignOutIcon() {
        aventajaPage.clickSignOut("menuUserLink");
    }

    @And("Cerrar Sesion")
    public void signOff() {
        aventajaPage.SignOff();
    }

    @And("Cerrar el navegador")
    public void closeBrowser() {
        aventajaPage.cerrarNavegadorclose();
    }
}