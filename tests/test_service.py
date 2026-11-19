import unittest

class TestEmployeeServiceSimulation(unittest.TestCase):
    def test_employee_creation_and_lookup(self):
        emp = {"id": 1, "name": "Divya Sree", "email": "divyasree@example.com", "dept": "Engineering"}
        self.assertEqual(emp["name"], "Divya Sree")
        self.assertIn("@", emp["email"])

    def test_invalid_email_validation(self):
        email = "invalid-email"
        self.assertFalse("@" in email)

if __name__ == "__main__":
    unittest.main()
