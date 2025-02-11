package utility;

import com.aventstack.extentreports.model.Category;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class FakerUtility {
	public String getFakeFirstName() {

		Faker faker = new Faker();

		Address address = faker.address();

		String text = address.firstName();

		return text;

	}

	public String getFakeLastName() {

		Faker faker = new Faker();

		Address address = faker.address();
		PhoneNumber phone = faker.phoneNumber();

		String text = address.lastName();

		return text;
	}

	public String getFakeCityName() {

		Faker faker = new Faker();

		Address address = faker.address();

		String text = address.cityName();

		return text;
	}

}
