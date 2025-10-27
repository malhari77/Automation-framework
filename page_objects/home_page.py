from utils.base_page import BasePage

class HomePage(BasePage):
    SEARCH_INPUT = "#search_query_top"
    SEARCH_BUTTON = "button[name='submit_search']"
    SIGN_IN_BUTTON = "a.login"
    CONTACT_US_BUTTON = "a[title='Contact Us']"
    TSHIRTS_BUTTON = "a[title='T-shirts']"

    def search_for(self, product):
        self.fill(self.SEARCH_INPUT, product)
        self.click(self.SEARCH_BUTTON)

    def click_sign_in(self):
        self.click(self.SIGN_IN_BUTTON)

    def click_contact_us(self):
        self.click(self.CONTACT_US_BUTTON)

    def click_tshirts(self):
        self.click(self.TSHIRTS_BUTTON)
