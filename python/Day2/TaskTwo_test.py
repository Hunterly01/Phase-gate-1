import unittest;
import TaskTwo;


class TestForTaskTwo(unittest.TestCase):
	def test_if_function_exist(self):
		TaskTwo.averageOfThreeScore(80, 80, 80)

	def test_function_for_float(self):
		self.assertRaises(ValueError, TaskTwo.averageOfThreeScore, 25.5, 60, 60);

	def test_function_for_string(self):
		self.assertRaises(ValueError, TaskTwo.averageOfThreeScore, "mon", 60, 60);

	def test_function_for_negative(self):
		self.assertRaises(ValueError, TaskTwo.averageOfThreeScore, -1, 60, 60);

	def test_function(self):
		expected = 'B'
		result = TaskTwo.averageOfThreeScore(80, 80, 80);
		self.assertEqual(result, expected);
	