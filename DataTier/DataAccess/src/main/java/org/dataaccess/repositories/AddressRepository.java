package org.dataaccess.repositories;

import org.dataaccess.Shared.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>
{
    @Modifying
    @Query("UPDATE Address SET country = ?2, city = ?3, zip = ?4, street = ?5 WHERE id = (SELECT u.address.id FROM User u WHERE u.username = ?1)")
    void updateUserAddress(String username, String country, String city, String zip, String street);
}
