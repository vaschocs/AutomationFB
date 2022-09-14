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

WebUI.navigateToUrl('https://web.facebook.com/?stype=lo&jlou=Afc7RSfZDuIG_V1YAuE9OHlPHBdLWzt7HkYt9BaEq3I-ZwuNcarbT8ZdvwVibaLaRJreKWCaXef9bFSXjttjnvnGZTPHVztQZ--QigRpQxvJiw&smuh=28453&lh=Ac_8aWKrlbMCkVloXrU')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/html_function envFlush(a)function b(b)for(v_82898c'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_We hope to see you again soon_email'), 
    'testingdot1409@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_We hope to see you again soon_pass'), 
    '3daxC11jEmG6kI050haNxg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_We hope to see you again soon_pass'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/g'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/span_Keluar'))

WebUI.closeBrowser()

