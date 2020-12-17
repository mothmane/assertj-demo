import java.util.List;
import ma.othmane.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CollectionsTest {

	static List<Product> actualList = List.of(new Product(01L, "TV", 400.00),
			new Product(02L, "Phone", 500.00),
			new Product(03L, "Keyboard", 10.00));

	@Test
	void size() {
		Assertions.assertEquals(3, actualList.size());
		Assertions.assertTrue(actualList.size() == 3);

	}

	@Test
	void same_collection() {
		var expectedList = List.of(new Product(01L, "TV", 400.00),
				new Product(02L, "Phone", 500.00),
				new Product(03L, "Keyboard", 10.00));
		Assertions.assertIterableEquals(expectedList, actualList);

	}

	@Test
	void collection_contains_elements() {
		Assertions.assertTrue(actualList.containsAll(List.of(new Product(02L, "Phone", 500.00),
				new Product(03L, "Keyboard", 10.00))));

	}


}
