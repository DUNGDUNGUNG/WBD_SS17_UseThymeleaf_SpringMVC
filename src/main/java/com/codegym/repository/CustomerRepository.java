package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements GeneralRepository<Customer> {

    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(0, "Dung", "dung@gmail.com", "Ha noi"));
        customerList.add(new Customer(1, "Hung", "hung@gmail.com", "Can tho"));
        customerList.add(new Customer(2, "Hanh", "hanh@gmail.com", "Sai gon"));
        customerList.add(new Customer(3, "Quang", "quang@gmail.com", "Da nang"));
        customerList.add(new Customer(4, "Dat", "dat@gmail.com", "Hue"));
    }


    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void update(int id, Customer customer) {
        int index = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        customerList.set(index, customer);
    }

    @Override
    public Customer findById(int id) {
        int index = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return customerList.get(index);
    }

    @Override
    public void remove(int id) {
        Customer customer = this.findById(id);
        customerList.remove(customer);
    }

}
