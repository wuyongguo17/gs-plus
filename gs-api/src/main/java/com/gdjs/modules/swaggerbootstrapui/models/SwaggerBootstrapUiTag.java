package com.gdjs.modules.swaggerbootstrapui.models;


import io.swagger.models.Tag;

/**
 * @author GDJS
 */
public class SwaggerBootstrapUiTag extends Tag {

    private Integer order;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public SwaggerBootstrapUiTag() {
    }

    public SwaggerBootstrapUiTag(Integer order) {
        this.order = order;
    }
}
