package com.ptteng.model;

import java.math.BigDecimal;

public class HistoryProduct {
    private Long id;

    private String product;

    private String bankCard;

    private String buyer;

    private Long buyTime;

    private Long arriveTime;

    private Integer transactionAction;

    private BigDecimal transactionAmouont;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public Long getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Long buyTime) {
        this.buyTime = buyTime;
    }

    public Long getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Long arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Integer getTransactionAction() {
        return transactionAction;
    }

    public void setTransactionAction(Integer transactionAction) {
        this.transactionAction = transactionAction;
    }

    public BigDecimal getTransactionAmouont() {
        return transactionAmouont;
    }

    public void setTransactionAmouont(BigDecimal transactionAmouont) {
        this.transactionAmouont = transactionAmouont;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}