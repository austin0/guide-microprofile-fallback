package io.openliberty.guides.inventory;

import java.io.IOException;
import java.util.Properties;
import javax.enterprise.context.ApplicationScoped;

import io.openliberty.guides.inventory.model.InventoryList;

@ApplicationScoped
public class InventoryManager {

	public Properties get(String hostname) throws IOException {
		return null;
	}

	public void add(String hostname, Properties props) {	
	}

	public InventoryList list() {
		return null;
	}
	
}