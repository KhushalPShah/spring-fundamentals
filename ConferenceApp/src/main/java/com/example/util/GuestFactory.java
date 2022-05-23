package com.example.util;

import com.example.model.Guest;
import org.springframework.beans.factory.FactoryBean;

public class GuestFactory implements FactoryBean<Guest> {

    @Override
    public Guest getObject() throws Exception {
        return new Guest();
    }

    @Override
    public Class<?> getObjectType() {
        return Guest.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
