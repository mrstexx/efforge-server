package com.efforge.studio.repository;

import com.efforge.studio.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends CrudRepository<Account, Long> {

}
