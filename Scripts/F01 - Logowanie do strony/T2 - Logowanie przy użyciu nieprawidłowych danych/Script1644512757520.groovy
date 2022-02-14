import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/login')

WebUI.click(findTestObject('Log in/go_button'))

WebUI.sendKeys(findTestObject('Log in/login_input'), '')

WebUI.sendKeys(findTestObject('Log in/password_input'), '')

WebUI.click(findTestObject('Log in/login_btn'))

Thread.sleep(4000)

WebUI.waitForAlert(10, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Log in/div_login'), 0)

WebUI.sendKeys(findTestObject('Log in/login_input'), 'adres.pl')

WebUI.sendKeys(findTestObject('Log in/password_input'), 'password')

WebUI.click(findTestObject('Log in/login_btn'))

WebUI.waitForAlert(15)

WebUI.verifyElementPresent(findTestObject('Log in/div_login'), 0)

WebUI.sendKeys(findTestObject('Log in/login_input'), 'przykladowyadres@wp.pl')

WebUI.sendKeys(findTestObject('Log in/password_input'), 'hasło1234')

WebUI.click(findTestObject('Log in/login_btn'))

Thread.sleep(4000)

WebUI.waitForAlert(15)

WebUI.verifyElementPresent(findTestObject('Log in/div_login'), 0)

WebUI.closeBrowser()

