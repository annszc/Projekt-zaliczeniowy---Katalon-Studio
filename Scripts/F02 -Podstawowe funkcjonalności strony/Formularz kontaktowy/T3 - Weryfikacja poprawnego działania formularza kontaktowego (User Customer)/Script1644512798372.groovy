import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWebElement
import static com.kms.katalon.core.testobject.ObjectRepository.executeJavaScript
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/login')

WebUI.click(findTestObject('Log in/go_button'))

WebUI.sendKeys(findTestObject('Log in/login_input'), 'user@phptravels.com')

WebUI.sendKeys(findTestObject('Log in/password_input'), 'demouser')

WebUI.click(findTestObject('Log in/login_btn'))

WebUI.click(findTestObject('Support/home_btn'))

WebUI.click(findTestObject('Support/contactUs_btn'))

WebUI.sendKeys(findTestObject('Support/name_input'), 'Anna')

WebUI.sendKeys(findTestObject('Support/email_input'), 'poczta8anny@gmail.com')

WebUI.sendKeys(findTestObject('Support/message_area'), varMessage)

WebUI.deleteAllCookies()

WebUI.scrollToElement(findTestObject('Support/name_input'), 30)

WebUI.click(findTestObject('Object Repository/Support/Page_Contact - PHPTRAVELS/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Support/send_btn'))

WebUI.closeBrowser()

