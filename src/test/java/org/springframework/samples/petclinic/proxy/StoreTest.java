package org.springframework.samples.petclinic.proxy;

import org.hibernate.graph.CannotContainSubGraphException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {


	@Test
	public void testPay(){
		Payment cashperf = new CreditCard();
		Store store = new Store(cashperf);
		store.buySomthing(100);

	}

}
