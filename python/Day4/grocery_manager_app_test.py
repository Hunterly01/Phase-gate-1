import unittest;
import grocery_manager_app;


class TestforAdditem(unittest.TestCase):
	def test_if_function_exist(self):
		grocery_manager_app.add_my_item("hunter");

	def test_function(self):
		expected = ["hunter"];
		result = grocery_manager_app.add_my_item("hunter");
		self.assertEqual(result, expected);


class Testforitem(unittest.TestCase):
	def test_if_function_exist(self):
		grocery_manager_app.remove_my_item("hunter");

		