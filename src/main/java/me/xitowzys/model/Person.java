package me.xitowzys.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Person")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Column(name = "age")
    private int age;
}
