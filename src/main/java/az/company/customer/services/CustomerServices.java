/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.company.customer.services;

import az.company.customer.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service("customerService")
public class CustomerServices {
    @Autowired
    CustomerDAO customerDao;

    @Override
    public String toString() {
        return "CustomerServices{" + "customerDao=" + customerDao + '}';
    }
    public void foo(){
        
    }
    
}
