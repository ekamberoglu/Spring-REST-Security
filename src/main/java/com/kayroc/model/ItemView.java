package com.kayroc.model;


import java.time.LocalDateTime;

public class ItemView {

    private static final long serialVersionUID = 6919148274902309323L;

    private long id;
    private int itemId;
    private LocalDateTime localDateTime;

    public ItemView() {
    }

    public ItemView(long id, int itemId, LocalDateTime localDateTime) {
        this.id = id;
        this.itemId = itemId;
        this.localDateTime = localDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "ItemView{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
