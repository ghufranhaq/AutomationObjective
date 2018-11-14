import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://qa-portal.munchies.com.pk/login')

assert true

//WebUI.waitForElementVisible('Obje, 0)('Object Repository/Page_Unilever - Munchies/input_Email_email', 5))
WebUI.setText(findTestObject('Object Repository/Page_Unilever - Munchies/input_Email_email'), 'jawad@venturedive.com')

assert true

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Unilever - Munchies/input_Password_password'), 'aeHFOx8jV/A=')

assert true

WebUI.click(findTestObject('Object Repository/Page_Unilever - Munchies/button_Login'))

assert true

//WebUI.verifyElementPresent('Object Respository/Page_Unilever Munchies/div_Profile')
WebUI.closeBrowser()

