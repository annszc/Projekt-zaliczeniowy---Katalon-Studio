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

WebUI.rightClick(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/button_Got It'))

WebUI.click(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/button_Got It'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/input_Email_email'), 'user@phptravels.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/input_Password_password'), '6weEYLVRi3+STmppai9GiQ==')

WebUI.click(findTestObject('Object Repository/Search/Page_Login - PHPTRAVELS/button_Login'))

WebUI.click(findTestObject('Object Repository/Search/Page_Dashboard - PHPTRAVELS/a_Hotels'))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/a_Home'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/a_Hotels'))

WebUI.click(findTestObject('Object Repository/Search/Page_Search Hotels - PHPTRAVELS/a_Home'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/body_1-234-56789                           _d9076c'))

WebUI.setText(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/input_Dec_select2-search__field'), 'DUBAI')

WebUI.sendKeys(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/input_Dec_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/input_Checkin_checkin'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/th_February 2022'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/th_2022'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/span_2022'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/th_February 2022'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/span_Mar'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/input_Checkin_checkin'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/th_February 2022'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/span_Mar'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/td_6'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/a_Travellers 2                             _ac14f6'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/i_Adults_la la-minus'))

WebUI.click(findTestObject('Object Repository/Search/Page_PHPTRAVELS - PHPTRAVELS/button_Search'))

WebUI.click(findTestObject('Object Repository/Search/Page_Hotels in dubai - PHPTRAVELS/img_Price Range_main-img lazyloaded'))

WebUI.click(findTestObject('Object Repository/Search/Page_Hotels in dubai - PHPTRAVELS/img_Discounts 10_main-img ls-is-cached lazyloaded'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/h3_Madinah Moevenpick Hotel'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/img_One-Bedroom Apartment_img-fluid room_im_d94892'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/div'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/div'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/div'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/div'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/div'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/svg'))

WebUI.click(findTestObject('Object Repository/Search/Page_madinah-moevenpick-hotel - PHPTRAVELS/span_Book Now'))

WebUI.setText(findTestObject('Object Repository/Search/Page_Hotel Booking - PHPTRAVELS/input_First Name_firstname_1'), 'Demo')

WebUI.setText(findTestObject('Object Repository/Search/Page_Hotel Booking - PHPTRAVELS/input_Last Name_lastname_1'), 'User')

WebUI.click(findTestObject('Object Repository/Search/Page_Hotel Booking - PHPTRAVELS/input_bank transfer_payment_gateway'))

WebUI.click(findTestObject('Object Repository/Search/Page_Hotel Booking - PHPTRAVELS/label_By continuing, you agree to the   Ter_355a10'))

WebUI.click(findTestObject('Object Repository/Search/Page_Hotel Booking - PHPTRAVELS/button_Confirm Booking'))

WebUI.click(findTestObject('Object Repository/Search/Page_Hotel Invoice - PHPTRAVELS/button_Download Invoice'))

