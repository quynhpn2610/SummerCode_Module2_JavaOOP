package service;

import model.Customer;

import java.util.ArrayList;

public class CustomerService implements IGeneralService<Customer> {
    ArrayList<Customer> customers = new ArrayList<>();

    // interface - interface -> extends
    // class - class -> extends
    // class - interface -> implements

    @Override
    public void add(Customer customer) {

    }

    @Override
    public Iterable<Customer> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
