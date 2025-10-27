from utils.base_test import page
from page_objects.home_page import HomePage
from page_objects.search_results_page import SearchResultsPage
from config import Config

def test_search_for_product(page):
    home_page = HomePage(page)
    search_results_page = SearchResultsPage(page)

    home_page.navigate(Config.BASE_URL)
    home_page.search_for("t-shirt")

    assert search_results_page.is_product_list_visible()
    assert "T-shirts" in search_results_page.get_first_product_name()
