package com.example.novelcon.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @Column
  private Integer age;

  @Column
  private String email;

  @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
  private List<Novel> writeNovels = new ArrayList<>();

  @OneToMany(mappedBy = "subscriber", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
  private List<Subscribe> subscribes = new ArrayList<>();
}
