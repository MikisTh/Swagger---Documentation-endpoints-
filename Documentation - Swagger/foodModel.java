package br.com.artigos.swagger.model;

public class food {

    private Long idFood;
    private String nameFood;
    private Boolean category;
    private String description;

    public food (Long idFood, String nomeFood, Boolean category, String description) {
        this.idFood = idFood;
        this.nameFood = nome;
        this.category = category;
        this.description = description;
    }

    public Long getIdFood() {
        return idFood;
    }

    public void setIdFood(Long idFood) {
        this.idFood = idFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nomeFood) {
        this.nameFood = nameFood;
    }

    public Boolean getCategory() {
        return category;
    }

    public void setCategory(Boolean category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}