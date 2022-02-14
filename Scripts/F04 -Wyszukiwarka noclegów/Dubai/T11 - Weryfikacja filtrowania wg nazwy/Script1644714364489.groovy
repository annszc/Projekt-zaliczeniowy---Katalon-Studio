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

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/a_Login'))

WebUI.click(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/button_Got It'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/input_Email_email'), 'user@phptravels.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/input_Password_password'), '6weEYLVRi3+STmppai9GiQ==')

WebUI.click(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/button_Login'))

WebUI.click(findTestObject('Object Repository/Search/Page_Dashboard - PHPTRAVELS/a_Hotels'))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/body_1-234-56789                           _d9076c'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_Dec_select2-search__field'), 
    varCity_name)

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_Dec_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/input_Checkin_checkin'))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/td_13'))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/td_19'))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/span_Search'))

WebUI.verifyElementPresent(findTestObject('Search/hotel_details_btn'), 1)

WebUI.verifyElementPresent(findTestObject('Search/filter_label'), 1)

WebUI.click(findTestObject('Search/input_hotelName'))

WebUI.setText(findTestObject('Search/input_hotelName'), varHotel_name)

WebUI.verifyElementPresent(findTestObject('Rose_Hotel_Dubai_div'), 0)

WebUI.closeBrowser()

