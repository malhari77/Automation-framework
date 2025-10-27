from utils.base_page import BasePage

class SearchResultsPage(BasePage):
    PRODUCT_LIST = "ul.product_list"
    FIRST_PRODUCT = "ul.product_list li:first-child"
    ADD_TO_CART_BUTTON = "a.ajax_add_to_cart_button"
    PRODUCT_NAME = ".product-name"

    def is_product_list_visible(self):
        self.wait_for_selector(self.PRODUCT_LIST)
        return self.page.is_visible(self.PRODUCT_LIST)

    def get_first_product_name(self):
        return self.page.inner_text(f"{self.FIRST_PRODUCT} {self.PRODUCT_NAME}")

    def add_first_product_to_cart(self):
        self.page.hover(self.FIRST_PRODUCT)
        self.page.evaluate(f"document.querySelector('{self.FIRST_PRODUCT} {self.ADD_TO_CART_BUTTON}').click()")
