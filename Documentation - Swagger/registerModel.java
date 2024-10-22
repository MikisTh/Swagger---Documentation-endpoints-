package br.com.artigos.swagger.model;

public class register {

    private Long idRegister;
    private Long idFood;
    private String nameFood;
    private String category;
    private Long quantity;

    public register(Long idRegister, Long idFood, String nomeFood, String category, Long quantity) {
        this.idRegister = idRegister;
        this.idFood = idFood;
        this.nameFood = nome;
        this.category = category;
        this.quantity = quantity;
    }

    public Long getIdRegister() {
        return idRegister;
    }

    public void setIdRegister(Long id) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}