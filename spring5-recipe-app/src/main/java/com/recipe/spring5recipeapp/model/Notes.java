package com.recipe.spring5recipeapp.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String recipeNotes;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
}
