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

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/a_flights'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_Flying From_from'), varDestination1)

WebUI.sendKeys(findTestObject('Search/Page_Search Hotels - PHPTRAVELS/input_Flying From_from'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_To Destination_to'), varDestination2)

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_To Destination_to'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_Departure Date_depart'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_Departure Date_depart'), '01-05-2023')

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/span_Search'))

WebUI.click(findTestObject('Object Repository/Search/Page_Flights - PHPTRAVELS/button_Got It'))

WebUI.verifyElementPresent(findTestObject('Search/loader_search'), 30)

WebUI.waitForElementPresent(findTestObject('Search/no result'), 30)

WebUI.closeBrowser()

