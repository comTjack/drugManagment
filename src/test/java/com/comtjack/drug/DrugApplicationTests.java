package com.comtjack.drug;

import com.comtjack.drug.entity.User;
import com.comtjack.drug.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrugApplicationTests {
    @Autowired
    private IUserService userService;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("admin");
        User user1 = userService.queryUserByUsername(user);
        System.out.println(user1);
    }

}
