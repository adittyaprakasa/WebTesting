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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver

WebUI.click(findTestObject('PHP Travels/Page_Dashboard - PHPTRAVELS/a_My Bookings'))

booking = WebUI.getText(findTestObject('PHP Travels/Page_Bookings - PHPTRAVELS/strong_( 1 )'))

println(booking)

splitText = booking.substring(2, 3)

println(splitText)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> txtListHotel = driver.findElements(By.xpath('//th[@scope="row"]'))

totalListHotel = txtListHotel.size()

println(totalListHotel)

WebUI.back()

WebUI.getText(findTestObject('PHP Travels/Page_Bookings - PHPTRAVELS/h4_1'))

WebUI.verifyElementText(findTestObject('PHP Travels/Page_Bookings - PHPTRAVELS/h4_1'), totalListHotel.toString())

