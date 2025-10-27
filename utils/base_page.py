from playwright.sync_api import Page

class BasePage:
    def __init__(self, page: Page):
        self.page = page

    def navigate(self, url):
        self.page.goto(url)

    def click(self, selector):
        self.page.locator(selector).click()

    def fill(self, selector, text):
        self.page.fill(selector, text)

    def select_option(self, selector, value):
        self.page.select_option(selector, value)

    def wait_for_selector(self, selector, state='visible', timeout=10000):
        self.page.wait_for_selector(selector, state=state, timeout=timeout)
