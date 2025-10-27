from utils.base_page import BasePage

class SignInPage(BasePage):
    EMAIL_INPUT = "#email"
    PASSWORD_INPUT = "#passwd"
    SUBMIT_BUTTON = "#SubmitLogin"
    CREATE_EMAIL_INPUT = "#email_create"
    CREATE_ACCOUNT_BUTTON = "#SubmitCreate"

    def login(self, email, password):
        self.fill(self.EMAIL_INPUT, email)
        self.fill(self.PASSWORD_INPUT, password)
        self.click(self.SUBMIT_BUTTON)

    def create_account(self, email):
        self.fill(self.CREATE_EMAIL_INPUT, email)
        self.click(self.CREATE_ACCOUNT_BUTTON)
