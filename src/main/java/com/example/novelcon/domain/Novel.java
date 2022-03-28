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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "NOVEL")
public class Novel {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String novelToken;

  @Column
  private String title;

  @Column
  private Integer likes;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User writer;

  @OneToMany(mappedBy = "novel", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
  private List<Subscribe> subscribes = new ArrayList<>();

  @OneToMany(mappedBy = "novel", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
  private List<Chapter> chapters = new ArrayList<>();
}
