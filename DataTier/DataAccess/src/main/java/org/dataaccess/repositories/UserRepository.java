package org.dataaccess.repositories;

import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>
{
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findUser(String userName);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE User SET credits = ?1 WHERE username = ?2")
    void changeCredits(int credits, String userName);
}
