package com.study.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@**PropertySource**：加载指定的配置文件
@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private Integer id;
    private String firstName;
    private Integer age;
    private Date birthDay;

    private List<Object> list;
    private Map<String,Object> map;
    private Cat cat;


    public Person(Integer id, String firstName, Integer age, Date birthDay, List<Object> list, Map<String, Object> map, Cat cat) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.birthDay = birthDay;
        this.list = list;
        this.map = map;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                ", list=" + list +
                ", map=" + map +
                ", cat=" + cat +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person() {

    }
}
