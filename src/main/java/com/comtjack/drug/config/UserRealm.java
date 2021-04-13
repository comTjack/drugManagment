package com.comtjack.drug.config;

import com.comtjack.drug.entity.User;
import com.comtjack.drug.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();  //前端传过来的数据
        User queryUser = new User();
        queryUser.setUsername(username);
        User user = userService.queryUserByUsername(queryUser);
        if(user == null){
            return null;

        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
    }
}
