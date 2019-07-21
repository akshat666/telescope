/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.space.telescope.base.impl;

import com.space.telescope.base.ContainerFactory;
import org.testcontainers.containers.GenericContainer;

/**
 *
 * @author akshat
 */
public class ContainerProducer implements ContainerFactory {

    @Override
    public GenericContainer createContainer(String containerName) {
        GenericContainer container = new GenericContainer(containerName);
        return container;
    }
    
}





