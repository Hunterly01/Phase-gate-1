import unittest;
import mini_parking_system;


class TestforParkedCar(unittest.TestCase):
	def test_if_function_exist(self):
		mini_parking_system.pack_my_car(1);

	def test_function(self):
		expected = "'1' car packed successfully.";
		result = mini_parking_system.pack_my_car(1);
		self.assertEqual(result, expected);


class TestforRemoveCarFromParkedSpot(unittest.TestCase):
	def test_if_function_exist(self):
		mini_parking_system.remove_my_car_from_car_pack(1);

	def test_function(self):
		expected = "'1' has been removed successfully.";
		result = mini_parking_system.remove_my_car_from_car_pack(1);
		self.assertEqual(result, expected);

class TestforShowCarSpace(unittest.TestCase):
		def test_if_function_exist(self):
			mini_parking_system.to_show_car_park_status();
		