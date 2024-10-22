package br.com.artigos.swagger.model;

public class diety {

    private Long idDiety;
    private Long idRegister;
    private Long idFood;
    private String nameFood;
    private Boolean category;
    private String description;
    private Long quantity;

    public food (Long idDiety, Long idRegister, Long idFood, String nomeFood, Boolean category, String description, Long quantity) {
        this.idDiety = idDiety;
        this.idRegister = idRegister;
        this.idFood = idFood;
        this.nameFood = nome;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
    }
    
    public Long getIdDiety() {
        return idDiety;
    }

    public void setIdDiety(Long idDiety) {
        this.idDiety = idDiety;
    }

    public Long getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(Long idRegister) {
        this.idRegister = idRegister;
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
   
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}