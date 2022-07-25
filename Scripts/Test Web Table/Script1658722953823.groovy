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

WebUI.navigateToUrl('https://demoqa.com/webtables')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_First Name_firstName'), 'Aditya')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Last Name_lastName'), 'Prakasa')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Email_userEmail (1)'), 'aditya@test.com')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Age_age'), '19')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Salary_salary'), '1000000')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Department_department'), 'ddb')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Submit (1)'))

WebUI.getText(findTestObject('Object Repository/Page_ToolsQA/div_Aditya'))

WebUI.verifyElementText(findTestObject('Page_ToolsQA/div_Aditya'), 'Aditya')

WebUI.closeBrowser()

