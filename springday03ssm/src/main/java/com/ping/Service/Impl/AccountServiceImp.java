package com.ping.Service.Impl;

import com.ping.Dao.AccountDao;
import com.ping.Service.AccountService;
import com.ping.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImp implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {

        System.out.println(" 保存账户");
        accountDao.saveAccount(account);
    }

}
