import org.apache.commons.beanutils.BeanUtils;
import org.junit.Assert;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class Starter {

	static final PodamFactory factory = new PodamFactoryImpl();

	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		testClasses(MyTest.class);
		System.out.println("End");
	}

	public static void testClasses(final Class<?> klass) throws Exception {
		final Object source = factory.manufacturePojo(klass);
		final Object destination = klass.newInstance();
		BeanUtils.copyProperties(destination, source);
		Assert.assertEquals(source, destination);
		Assert.assertNotEquals(source, new Object());
		Assert.assertEquals(source.hashCode(), destination.hashCode());
	}
}
