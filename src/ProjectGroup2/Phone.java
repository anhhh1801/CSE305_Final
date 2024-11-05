/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGroup2;

/**
 *
 * @author nhanv
 */
public class Phone {
    private String id;
    private String name;
    private String type;
    private String publisher;
    private String RAM;
    private String color;
    private float Price;
    private boolean check;

    public Phone() {
    }

    public Phone(String id, String name, String type, String publisher, String RAM, String color, float Price,boolean check) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.publisher = publisher;
        this.RAM = RAM;
        this.color = color;
        this.Price = Price;
        this.check = check;
    }

    public Phone(String id, String name, String type, String publisher, String RAM, String color, float Price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.publisher = publisher;
        this.RAM = RAM;
        this.color = color;
        this.Price = Price;
    }
    

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    
    
    

}
