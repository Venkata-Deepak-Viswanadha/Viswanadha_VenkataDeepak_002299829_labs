/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author deepakviswanadh
 */
public class AccountDirectory {
    
    public List<Account> accountList;
    
    public AccountDirectory(){
        this.accountList= new ArrayList<>();
    }

    public List<Account> getAccountList() {
        return accountList;
    }    

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount(){
        Account acc= new Account();
        accountList.add(acc);
        return acc;
    }
    
    public void deleteAccount(Account acc){
        accountList.remove(acc);
    }
    
    public Account searchAccount(String accNumber){
        //return accountList.stream().filter(acc1-> acc1.getAccountNumber().equals(accNumber)).collect(Collectors.toList()).get(0);
        for(Account acc1:accountList){
            if(acc1.getAccountNumber().equals(accNumber)){
                return acc1;
            }
        }
        return null;
    }
    
}
