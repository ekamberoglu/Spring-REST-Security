package com.kayroc.model;


import java.time.LocalDateTime;

public class Order {

    private static final long serialVersionUID = 691914827490530925L;

    private long id;
    private String userName;
    private long itemId;
    private String itemName;
    private int numberOfItems;
    private float saleItemPrice;
    private float originalItemPrice;
    private float totalAmountOfPurchase;
    private LocalDateTime transactionDate;

    public Order() {
    }

    public Order(long id, String userName, long itemId, String itemName, int numberOfItems, float saleItemPrice, float originalItemPrice, float totalAmountOfPurchase, LocalDateTime transactionDate) {
        this.id = id;
        this.userName = userName;
        this.itemId = itemId;
        this.itemName = itemName;
        this.numberOfItems = numberOfItems;
        this.saleItemPrice = saleItemPrice;
        this.originalItemPrice = originalItemPrice;
        this.totalAmountOfPurchase = totalAmountOfPurchase;
        this.transactionDate = transactionDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public float getSaleItemPrice() {
        return saleItemPrice;
    }

    public void setSaleItemPrice(float saleItemPrice) {
        this.saleItemPrice = saleItemPrice;
    }

    public float getOriginalItemPrice() {
        return originalItemPrice;
    }

    public void setOriginalItemPrice(float originalItemPrice) {
        this.originalItemPrice = originalItemPrice;
    }

    public float getTotalAmountOfPurchase() {
        return totalAmountOfPurchase;
    }

    public void setTotalAmountOfPurchase(float totalAmountOfPurchase) {
        this.totalAmountOfPurchase = totalAmountOfPurchase;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", numberOfItems=" + numberOfItems +
                ", saleItemPrice=" + saleItemPrice +
                ", originalItemPrice=" + originalItemPrice +
                ", totalAmountOfPurchase=" + totalAmountOfPurchase +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
