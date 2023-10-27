package com.kubudirira.jpaonetomany.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String first_name;
    private  String last_name;
    private  String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> post;


}
