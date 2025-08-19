import unittest;
import TaskThree;



class TestForTaskThree(unittest.TestCase):
	def test_if_function_exist(self):
		TaskThree.return_the_display(["peter"])

	def test_if_array_is_float(self):
		self.assertRaises(ValueError, TaskThree.return_the_display, [2.3, 3.8, 4.5])

		