package com.cl.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Description
 * @Author caolin
 * Date  2022/4/22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  int id;
    private  String name;
    private  int age;
}
