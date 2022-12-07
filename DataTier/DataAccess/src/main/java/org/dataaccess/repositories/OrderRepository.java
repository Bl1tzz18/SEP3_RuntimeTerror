package org.dataaccess.repositories;

import org.dataaccess.Shared.Order;
import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>
{
    Order findByUser(User username);
}
