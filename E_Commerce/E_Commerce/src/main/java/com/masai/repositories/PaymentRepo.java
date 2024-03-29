/**
 * 
 */
package com.masai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Payment;

/**
 * @author tejas
 *
 */

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
