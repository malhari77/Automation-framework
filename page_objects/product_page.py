from utils.base_page import BasePage

class ProductPage(BasePage):
    ADD_TO_CART_BUTTON = "p#add_to_cart button"
    QUANTITY_INPUT = "#quantity_wanted"
    SIZE_SELECT = "#group_1"
    COLOR_OPTIONS = "#color_to_pick_list a"

    def add_to_cart(self):
        self.page.wait_for_load_state('networkidle')
        self.click(self.ADD_TO_CART_BUTTON)

    def set_quantity(self, quantity):
        self.fill(self.QUANTITY_INPUT, quantity)

    def select_size(self, size):
        self.select_option(self.SIZE_SELECT, size)

    def select_color(self, color):
        self.page.click(f"a[name='{color}']")
