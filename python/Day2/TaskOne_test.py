import unittest;
import TaskOne;


class TestTaskone(unittest.TestCase):
	def test_if_function_exist(self):
		TaskOne.calculateTwiceFathersAge(30, 10)

	def test_for_if_input_is_float(self):
		self.assertRaises(ValueError,TaskOne.calculateTwiceFathersAge,4.9,2.9);

	def test_for_if_input_is_string(self):
		self.assertRaises(ValueError,TaskOne.calculateTwiceFathersAge,"ola","ade");

	def test_for_calculate_twice_fathersAge(self):
		multiply = 10 * 2
		fathersAge = 30
		expected = fathersAge - multiply;
		result = TaskOne.calculateTwiceFathersAge(30,10);
		self.assertEqual(result, expected);

	