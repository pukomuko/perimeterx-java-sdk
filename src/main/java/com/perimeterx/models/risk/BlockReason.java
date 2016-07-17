package com.perimeterx.models.risk;

/**
 * BlockReason Enum
 * <p>
 * Created by shikloshi on 05/07/2016.
 */
public enum BlockReason {

    SERVER("s2s_high_score"), COOKIE("cookie_high_score");

    private String value;

    BlockReason(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
