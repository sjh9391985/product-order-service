package com.example.demo.product;

import org.springframework.util.Assert;

class Product {

    private final String name;
    private final int price;
    private final DiscountPolicy discountPolicy;
    private Long id;

    public Product(final String name, final int price, final DiscountPolicy discountPolicy) {

        Assert.hasText(name, "상품명은 필수");
        Assert.isTrue(price > 0, "상품 가격은 0 이상");
        Assert.notNull(discountPolicy, "할인 정책은 필수");

        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }

    public void assignId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public Long getId() {
        return id;
    }
}
