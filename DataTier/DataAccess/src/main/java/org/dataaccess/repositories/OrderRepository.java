package org.dataaccess.repositories;

import org.dataaccess.Shared.Order;
import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>
{
    Order findByUserAndStatus(User username, String status);

    @Modifying
    @Query("UPDATE Order o SET o.status = ?2 WHERE o.user.username = ?1")
    void updateOrderStatus(String username, String status);
}
