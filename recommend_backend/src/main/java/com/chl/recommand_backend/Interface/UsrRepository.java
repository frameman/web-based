package com.chl.recommand_backend.Interface;

import com.chl.recommand_backend.sql.userdb;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UsrRepository extends CrudRepository<userdb,Long> {
    @Query("SELECT u FROM userdb u WHERE u.Email = :email")
    userdb findByEmail(@Param("email") String email);
}
