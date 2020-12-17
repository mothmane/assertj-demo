import ma.othmane.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
	void nullity() {
		Assertions.assertNull(null);
		Assertions.assertNotNull(new Object());
	}

	@Test
	void equality() {
		var o1 = new Object();
		var o2 = new Object();

		Assertions.assertEquals(o1, o1);
		Assertions.assertNotEquals(o1, o2);
	}

	@Test
	void assert_with_custom_message() {
		var object1 = new Object();
		var object2 = new Object();

		Assertions.assertEquals(object1, object2, "my custom error message");
	}

	@Test
	void simple_strings_assertions() {
		String x = "Hello the team";
		Assertions.assertTrue(x.startsWith("Hel"));
		Assertions.assertTrue(x.contains("the"));
		Assertions.assertTrue(x.endsWith("eam"));
	}

	@Test
	void matching() {
		var product = new Product(01L, "TV", 400.00);

		Assertions.assertTrue(product.getPrice() >= 400.00);
	}
}
