package com.recipe.spring5recipeapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer preTime;
    private Integer cookTime;
    private Integer servings;
    private String cource;
    private String url;
    private String directions;

    @Lob
    private Byte[] image;

    @OneToOne(mappedBy = "recipe" , cascade = CascadeType.ALL)
    private Notes notes;

    @OneToMany(mappedBy = "recipe" , cascade = CascadeType.ALL)
    private Set<Ingredient> ingredients;
}
