package de.fherfurt.manufactor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManufacturerTest {

    @Test
    void addRevenue() {
    // given
    Address address = new Address("street", 1, "Erfurt", "45646", "Germany");
    Manufacturer manufacturer = new Manufacturer("Ford", address, 10, 1);

    Revenue given = new Revenue(123, 2021);

    // when
    manufacturer.addRevenue(given);

    // then
    Assertions.assertThat(manufacturer.getRevenues())
      .isNotNull()
      .isNotEmpty()
      .contains(given);
  }

    @Test
    void testAddRevenue() {
    // given

    // when

    // then
  }

    @Test
    void addCar() {
    // given

    // when

    // then
  }

    @Test
    void testAddCar() {
    // given

    // when

    // then
  }
}
