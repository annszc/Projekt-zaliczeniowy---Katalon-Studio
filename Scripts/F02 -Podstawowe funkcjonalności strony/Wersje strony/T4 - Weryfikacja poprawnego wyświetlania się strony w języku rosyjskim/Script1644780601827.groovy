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

WebUI.sendKeys(findTestObject('Log in/login_input'), 'user@phptravels.com')

WebUI.sendKeys(findTestObject('Log in/password_input'), 'demouser')

WebUI.click(findTestObject('Log in/login_btn'))

WebUI.click(findTestObject('Support/home_btn'))

WebUI.click(findTestObject('Language/ch_language_btn'))

WebUI.click(findTestObject('Language/russian_btn'))

WebUI.verifyElementText(findTestObject('Language/home_btn'), 'Дом')

WebUI.verifyElementText(findTestObject('Language/hotels_btn'), 'Гостиницы')

WebUI.verifyElementText(findTestObject('Language/flights_btn'), 'Полеты')

WebUI.verifyElementText(findTestObject('Language/tours_btn'), 'Экскурсии')

WebUI.verifyElementText(findTestObject('Language/visa_btn'), 'Виза')

WebUI.verifyElementText(findTestObject('Language/blog_btn'), 'Блог')

WebUI.verifyElementText(findTestObject('Language/offers_btn'), 'Предложения')

WebUI.verifyElementText(findTestObject('Language/company_btn'), 'Компания')

WebUI.verifyElementText(findTestObject('Language/cityName'), 'Название города')

WebUI.verifyElementText(findTestObject('Language/checkn_btn'), 'Регистрироваться')

WebUI.verifyElementText(findTestObject('Language/checkout_btn'), 'Проверить')

WebUI.verifyElementText(findTestObject('Language/travellers_btn'), 'Путешественники')

WebUI.verifyElementText(findTestObject('Language/search_btn'), 'Искать')

WebUI.verifyElementText(findTestObject('Language/bottom_tab_company'), Компания)

WebUI.verifyElementText(findTestObject('Language/bottom_tab_support'), Служба поддержки)

WebUI.verifyElementText(findTestObject('Language/bottom_tab_services'), Служба Услуги)

WebUI.closeBrowser()

