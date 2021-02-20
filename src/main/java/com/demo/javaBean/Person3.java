package com.demo.javaBean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
        * 将配置文件中配置的每一个属性的值，映射到这个组件中
        * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
        *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
        *
        * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
        *  @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值；
        *
        */
//指定加载配置文件
@PropertySource(value={"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person3")
public class Person3 {
    /**
     * person3.last-name=李四
     * person3.age=12
     * person3.birth=2017/12/15
     * person3.boss=false
     * person3.maps.k1=v1
     * person3.maps.k2=14
     * person3.lists=a,b,c
     * person3.dog.name=dog
     * person3.dog.age=15
     */
    private String lastName;
 private Integer age;
 private Boolean boss;
private Date birth;

       private Map<String,Object> maps;
private List<Object> lists;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
