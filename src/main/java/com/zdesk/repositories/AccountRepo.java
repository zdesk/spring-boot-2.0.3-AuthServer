package com.zdesk.repositories;


import org.springframework.data.repository.Repository;

import com.zdesk.models.Account;

import java.util.Collection;
import java.util.Optional;

public interface AccountRepo extends Repository<Account, Long> {

    Collection<Account> findAll();
    Optional<Account> findByUsername(String username);
    Optional<Account> findById(Long id);
    Integer countByUsername(String username);
    Account save(Account account);
    void deleteAccountById(Long id);



}
