/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.UserDAO;
import junit.framework.Assert;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tien Thanh
 */
public class UserDAOTest {
    UserDAO u=new UserDAO();
    @Test
    //Standard: User Manager
    public void testcheckLoginStandard1(){
        User user=new User(0, "manager", "12345", "", "");
        boolean result = u.checkLogin(user);
        Assert.assertTrue(result);
        Assert.assertEquals("Nguyen Tien Thanh", user.getName());
        Assert.assertEquals("manager", user.getPosition());
        return;
    }
    @Test
    //Standard: User Client
    public void testcheckLoginStandard2(){
        User user=new User(0, "referee4", "12345", "", "");
        boolean result = u.checkLogin(user);
        Assert.assertTrue(result);
        Assert.assertEquals("Truong Hong Vu", user.getName());
        Assert.assertEquals("client", user.getPosition());
        return;
    }
    @Test
    //Exception: Wrong Password
    public void testcheckLoginException1(){
        User user=new User(0, "manager", "1234", "", "");
        boolean result = u.checkLogin(user);
        Assert.assertFalse(result);
        return;
    }
    @Test
    //Exception: Empty Username and Password
    public void testcheckLoginException2(){
        User user=new User(0, "", "", "", "");
        boolean result = u.checkLogin(user);
        Assert.assertFalse(result);
        return;
    }
    @Test
    //Exception: Username not exist
    public void testcheckLoginException3(){
        User user=new User(0, "afhkkf", "ahfoil", "", "");
        boolean result = u.checkLogin(user);
        Assert.assertFalse(result);
        return;
    }
}
