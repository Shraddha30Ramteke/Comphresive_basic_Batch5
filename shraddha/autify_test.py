from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Set up Chrome WebDriver
chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument("--start-maximized")  # Maximize the browser window
driver = webdriver.Chrome(options=chrome_options)

# Navigate to the website
url = "https://autify.com/"
driver.get(url)

try:
    # a. Verify Autify logo is present on the top left side of the page
    logo_xpath = "//img[@alt='Autify']"
    WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, logo_xpath)))
    print("Autify logo is present.")

    # b. Click on the English by default language drop-down and switch the language
    language_dropdown_xpath = "//div[@class='lang-switcher']//button"
    WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, language_dropdown_xpath))).click()

    # Assuming there are language options available, you may need to modify this according to the actual dropdown structure
    english_option_xpath = "//div[@class='lang-switcher']//a[text()='English']"
    WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, english_option_xpath))).click()

    # c. Verify that the webpage language has changed successfully
    # You can add a verification based on the changed language content on the page
    # For example, you can check for an element that is specific to the English version
    english_page_identifier_xpath = "//div[@class='some-element-that-is-present-in-english']"
    WebDriverWait(driver, 10).until(EC.presence_of_element_located((By.XPATH, english_page_identifier_xpath)))
    print("Web page language has changed successfully.")

finally:
    # Close the browser window
    driver.quit()
