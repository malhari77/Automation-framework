import pytest
from playwright.sync_api import sync_playwright
from config import Config

@pytest.fixture(scope="function")
def page():
    with sync_playwright() as p:
        browser_type = getattr(p, Config.BROWSER)
        browser = browser_type.launch(headless=Config.HEADLESS)
        page = browser.new_page()
        page.set_default_timeout(10000)
        yield page
        browser.close()
