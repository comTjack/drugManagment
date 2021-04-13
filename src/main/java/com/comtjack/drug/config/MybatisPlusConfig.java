package com.comtjack.drug.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatisPlus的配置类
 * 主要用来实现翻页
 */
@Configuration  /*添加该注解后可以覆盖掉系统的默认配置*/
@MapperScan(value = "com.comtjack.drug.mapper") /*选择指定的包来当作mapper*/
public class MybatisPlusConfig {
    @Bean   /*声明当前方法的返回值是 bean对象*/
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("mysql");  //设置分页的数据库类型
        return paginationInterceptor;
    }
}
